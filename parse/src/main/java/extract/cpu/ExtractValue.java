package extract.cpu;

import main.ISubject;
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
 * 需要传入的参数有3个，分别为输入路径，kafka主题
 */

public class ExtractValue implements ISubject {
    /*public static void main(String[] args) throws IOException {
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-cpu.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }*/

    public static void parse(String[] strarr,String ouputpath) throws IOException {

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //获取Topology的数据
            CPUBean bean = new CPUBean();

            //获取标头信息
            String header = StringUtils.substringBetween(str,"2020-","]") + "]";
            //String header = "预处理获取标头信息";
            bean.header = header;

            String json = StringUtils.substringAfter(str,header);
            //System.out.println(json);
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
                JSONObject obj3 = obj2.getJSONObject("Keys");
                bean.node_name = obj3.getString("node-name");

                JSONObject obj4 = obj2.getJSONObject("Content");

                //获取ProcessCPU数组
                //List<ProcessCPU> processCPU1 = new ArrayList<>();
                JSONArray pro_cpu_Arr = obj4.getJSONArray("process-cpu_PIPELINE_EDIT");

                bean.total_cpu_fifteen_minute = obj4.getInt("total-cpu-fifteen-minute");
                bean.total_cpu_five_minute = obj4.getInt("total-cpu-five-minute");
                bean.total_cpu_one_minute = obj4.getInt("total-cpu-one-minute");

                for(int k = 0 ; k < pro_cpu_Arr.length(); k++) {
                    JSONObject obj5 = pro_cpu_Arr.getJSONObject(k);
                    bean.process_cpu_fifteen_minute = obj5.getInt("process-cpu-fifteen-minute");
                    bean.process_cpu_five_minute = obj5.getInt("process-cpu-five-minute");
                    bean.process_cpu_one_minute = obj5.getInt("process-cpu-one-minute");
                    bean.process_id = obj5.getInt("process-id");
                    bean.process_name = obj5.getString("process-name");

                    write2Local(ouputpath,bean.toString());

                }
            }

        }

    }

    @Override
    public void main(String... args) {
        if(args.length == 2){
            String inputpath=args[0];
            String outputpath = args[1];
            //String topic = args[2];

            StringBuffer strbuff = getDataStr(inputpath);
            String[] result = data2str(strbuff);
            try {
                parse(result,outputpath);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO异常");
            }

        }else{
            System.out.println("TopologyParse Usage: "+
                    "[zookeeper-connect]  [topic]"
            );
            System.exit(-3);
        }
    }
}

