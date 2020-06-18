package telemetryparse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import telemetryparse.interfacebeans.ContentObject;
import telemetryparse.interfacebeans.DataModel;
import telemetryparse.interfacebeans.KeysObject;
import telemetryparse.interfacebeans.RowsObject;

import java.util.ArrayList;
import java.util.List;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;

/**
 * Classname InterfacesParse
 * Date 2020/6/12 16:05
 * Created by LanKorment
 * parse path : Cisco-IOS-XR-infra-statsd-oper:infra-statistics/interfaces/interface/latest/generic-counters
 */
public class InterfacesParse {

    public static void main(String[] args){
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-interface.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }
    //解析json数据
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
                keys.interface_name = obj3.getString("interface-name");
                //keys.interface_name = "null";
                row.keys = keys;

                //获取Content的数据
                JSONObject obj4 = obj2.getJSONObject("Content");
                ContentObject content = new ContentObject();
                content.applique = obj4.getLong("applique");
                content.availability_flag = obj4.getLong("availability-flag");
                content.broadcast_packets_received = obj4.getLong("broadcast-packets-received");
                content.broadcast_packets_sent = obj4.getLong("broadcast-packets-sent");
                content.bytes_received = obj4.getBigDecimal("bytes-received");
                content.bytes_sent = obj4.getBigDecimal("bytes-sent");
                content.carrier_transitions = obj4.getLong("carrier-transitions");
                content.crc_errors = obj4.getLong("crc-errors");
                content.framing_errors_received = obj4.getLong("framing-errors-received");
                content.giant_packets_received = obj4.getLong("giant-packets-received");
                content.input_aborts = obj4.getLong("input-aborts");
                content.input_drops = obj4.getLong("input-drops");
                content.input_errors = obj4.getLong("input-errors");
                content.input_ignored_packets = obj4.getLong("input-ignored-packets");
                content.input_overruns = obj4.getLong("input-overruns");
                content.input_queue_drops = obj4.getLong("input-queue-drops");
                content.last_data_time = obj4.getLong("last-data-time");
                content.last_discontinuity_time = obj4.getLong("last-discontinuity-time");
                content.multicast_packets_received = obj4.getLong("multicast-packets-received");
                content.multicast_packets_sent = obj4.getLong("multicast-packets-sent");
                content.output_buffer_failures = obj4.getLong("output-buffer-failures");
                content.output_buffers_swapped_out = obj4.getLong("output-buffers-swapped-out");
                content.output_drops = obj4.getLong("output-drops");
                content.output_errors = obj4.getLong("output-errors");
                content.output_queue_drops = obj4.getLong("output-queue-drops");
                content.output_underruns = obj4.getLong("output-underruns");
                content.packets_received = obj4.getLong("packets-received");
                content.packets_sent = obj4.getLong("packets-sent");
                content.parity_packets_received = obj4.getLong("parity-packets-received");
                content.resets = obj4.getLong("resets");
                content.runt_packets_received = obj4.getLong("runt-packets-received");
                content.seconds_since_last_clear_counters = obj4.getLong("seconds-since-last-clear-counters");
                content.seconds_since_packet_received = obj4.getLong("seconds-since-packet-received");
                content.seconds_since_packet_sent = obj4.getLong("seconds-since-packet-sent");
                content.throttled_packets_received = obj4.getLong("throttled-packets-received");
                content.unknown_protocol_packets_received = obj4.getLong("unknown-protocol-packets-received");

                row.content = content;

                rows.add(row);
            }
            dataModel.row = rows;
            //输出字段
            System.out.println(dataModel);
        }

    }
}
