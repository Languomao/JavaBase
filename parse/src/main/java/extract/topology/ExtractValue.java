package extract.topology;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;
import static utils.Write2Local.write2Local;

/**
 * Classname extract.topology.ExtractValue
 * Date 2020/7/28 11:29
 * Created by LanKorment
 */

public class ExtractValue {
    public static void main(String[] args) throws IOException {
        //如果将输入路径改为kafka该如何将数据转换为StringBuffer
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-topology-summary.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }

    //解析json数据
    public static void parse(String[] strarr) throws IOException {

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //获取Topology的数据
            Topologybean bean = new Topologybean();

            //获取标头信息
            String header = StringUtils.substringBetween(str,"2020-","]") + "]";
            //String header = "预处理获取标头信息";
            bean.header = header;

            String json = StringUtils.substringAfter(str,header);
            //首先看到的是一个{}所以用JSON Object来进行解析
            //获得外部的TopologyObject
            JSONObject obj = new JSONObject(json);

            String source = obj.getString("Source");
            bean.source = source;

            //获取Telemetry的数据
            JSONObject obj1 = obj.getJSONObject("Telemetry");
            bean.node_id_str = obj1.getString("node_id_str");
            bean.subscription_id_str = obj1.getString("subscription_id_str");
            bean.encoding_path = obj1.getString("encoding_path");
            bean.collection_id = obj1.getInt("collection_id");
            bean.collection_start_time = obj1.getLong("collection_start_time");
            bean.msg_timestamp = obj1.getLong("msg_timestamp");
            bean.collection_end_time = obj1.getLong("collection_end_time");

            //获取Rows数组
            JSONArray jArr = obj.getJSONArray("Rows");
            for (int j = 0; j < jArr.length(); j++) {
                JSONObject obj2 = jArr.getJSONObject(j);
                bean.row_timestamp = obj2.getLong("Timestamp");

                //获取Keys数据
                try{
                    JSONObject keyObject = obj2.getJSONObject("Keys");
                    bean.keys = keyObject.getString("intreface_name");
                }catch(Exception e){
                    bean.keys = "null";
                }

                //获取Content的数据
                JSONObject obj4 = obj2.getJSONObject("Content");
                bean.adjacency_sids = obj4.getInt("adjacency-sids");
                bean.links = obj4.getInt("links");
                bean.nodes = obj4.getInt("nodes");
                bean.prefix_sids = obj4.getInt("prefix-sids");
                bean.prefixes = obj4.getInt("prefixes");

                write2Local("D:\\WorkSpace\\data&note",bean.toString());
                //System.out.println(bean);
            }
        }

    }
}
