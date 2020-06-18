package telemetryparse;

import telemetryparse.cpubeans.DataModel;
import telemetryparse.cpubeans.KeysObject;
import telemetryparse.cpubeans.ContentObject;
import telemetryparse.cpubeans.ProcessCPU;
import telemetryparse.cpubeans.RowsObject;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;

/**
 * Classname CpuParse
 * Date 2020/6/12 16:06
 * Created by LanKorment
 * path : Cisco-IOS-XR-pfi-im-cmd-oper:interfaces/interface-xr/interface
 */

public class CpuParse {
    public static void main(String[] args){
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-cpu.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }

    public static void parse(String[] strarr){

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //System.out.println(json);
            //要解析的对象
            //String json = "";

            //获取Topology的数据
            DataModel dataModel = new DataModel();

            //获取标头信息
            String header = StringUtils.substringBetween(str,"2020-","]") + "]";
            //String header = "预处理获取标头信息";
            dataModel.header = header;

            String json = StringUtils.substringAfter(str,header);
            //System.out.println(json);
            //首先看到的是一个{}所以用JSON Object来进行解析
            //获得外部的TopologyObject
            JSONObject obj = new JSONObject(json);


            String source = obj.getString("Source");
            dataModel.source = source;


            //获取Telemetry的数据
            JSONObject obj1 = obj.getJSONObject("Telemetry");
            TelemetryObject telemetry = new TelemetryObject();
            telemetry.node_id_str = obj1.getString("node_id_str");
            telemetry.subscription_id_str = obj1.getString("subscription_id_str");
            telemetry.encoding_path = obj1.getString("encoding_path");
            telemetry.collection_id = obj1.getInt("collection_id");
            telemetry.collection_start_time = obj1.getLong("collection_start_time");
            telemetry.msg_timestamp = obj1.getLong("msg_timestamp");
            telemetry.collection_end_time = obj1.getLong("collection_end_time");
            dataModel.telemetry = telemetry;

            //获取Rows数组
            List<RowsObject> rows=new ArrayList<>();
            JSONArray jArr = obj.getJSONArray("Rows");
            for (int j = 0; j < jArr.length(); j++) {
                JSONObject obj2 = jArr.getJSONObject(j);
                RowsObject row = new RowsObject();
                row.row_timestamp = obj2.getLong("Timestamp");

                //获取Keys数据
                JSONObject obj3 = obj2.getJSONObject("Keys");
                KeysObject keys = new KeysObject();
                keys.node_name = obj3.getString("node-name");
                //keys.interface_name = "null";
                row.keys = keys;

                JSONObject obj4 = obj2.getJSONObject("Content");
                ContentObject content = new ContentObject();

                //获取ProcessCPU数组
                List<ProcessCPU> processCPU1 = new ArrayList<>();
                JSONArray pro_cpu_Arr = obj4.getJSONArray("process-cpu_PIPELINE_EDIT");
                for(int k = 0 ; k < pro_cpu_Arr.length(); k++) {
                    JSONObject obj5 = pro_cpu_Arr.getJSONObject(k);
                    ProcessCPU processCPU2 = new ProcessCPU();
                    processCPU2.process_cpu_fifteen_minute = obj5.getInt("process-cpu-fifteen-minute");
                    processCPU2.process_cpu_five_minute = obj5.getInt("process-cpu-five-minute");
                    processCPU2.process_cpu_one_minute = obj5.getInt("process-cpu-one-minute");
                    processCPU2.process_id = obj5.getInt("process-id");
                    processCPU2.process_name = obj5.getString("process-name");

                    processCPU1.add(processCPU2);
                }

                content.processCPU = processCPU1;
                row.content = content;

                rows.add(row);
            }
            dataModel.row = rows;
            //输出字段
            System.out.println(dataModel);
        }

    }
}
