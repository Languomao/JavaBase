package extract.interfacedata;

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
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-interface.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }

    public static void parse(String[] strarr) throws IOException {

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //获取Topology的数据
            InterfaceBean bean = new InterfaceBean();

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
                bean.interface_name = obj3.getString("interface-name");

                //获取Content的数据
                JSONObject obj4 = obj2.getJSONObject("Content");
                bean.applique = obj4.getLong("applique");
                bean.availability_flag = obj4.getLong("availability-flag");
                bean.broadcast_packets_received = obj4.getLong("broadcast-packets-received");
                bean.broadcast_packets_sent = obj4.getLong("broadcast-packets-sent");
                bean.bytes_received = obj4.getBigDecimal("bytes-received");
                bean.bytes_sent = obj4.getBigDecimal("bytes-sent");
                bean.carrier_transitions = obj4.getLong("carrier-transitions");
                bean.crc_errors = obj4.getLong("crc-errors");
                bean.framing_errors_received = obj4.getLong("framing-errors-received");
                bean.giant_packets_received = obj4.getLong("giant-packets-received");
                bean.input_aborts = obj4.getLong("input-aborts");
                bean.input_drops = obj4.getLong("input-drops");
                bean.input_errors = obj4.getLong("input-errors");
                bean.input_ignored_packets = obj4.getLong("input-ignored-packets");
                bean.input_overruns = obj4.getLong("input-overruns");
                bean.input_queue_drops = obj4.getLong("input-queue-drops");
                bean.last_data_time = obj4.getLong("last-data-time");
                bean.last_discontinuity_time = obj4.getLong("last-discontinuity-time");
                bean.multicast_packets_received = obj4.getLong("multicast-packets-received");
                bean.multicast_packets_sent = obj4.getLong("multicast-packets-sent");
                bean.output_buffer_failures = obj4.getLong("output-buffer-failures");
                bean.output_buffers_swapped_out = obj4.getLong("output-buffers-swapped-out");
                bean.output_drops = obj4.getLong("output-drops");
                bean.output_errors = obj4.getLong("output-errors");
                bean.output_queue_drops = obj4.getLong("output-queue-drops");
                bean.output_underruns = obj4.getLong("output-underruns");
                bean.packets_received = obj4.getLong("packets-received");
                bean.packets_sent = obj4.getLong("packets-sent");
                bean.parity_packets_received = obj4.getLong("parity-packets-received");
                bean.resets = obj4.getLong("resets");
                bean.runt_packets_received = obj4.getLong("runt-packets-received");
                bean.seconds_since_last_clear_counters = obj4.getLong("seconds-since-last-clear-counters");
                bean.seconds_since_packet_received = obj4.getLong("seconds-since-packet-received");
                bean.seconds_since_packet_sent = obj4.getLong("seconds-since-packet-sent");
                bean.throttled_packets_received = obj4.getLong("throttled-packets-received");
                bean.unknown_protocol_packets_received = obj4.getLong("unknown-protocol-packets-received");

                write2Local("D:\\WorkSpace\\data&note",bean.toString());
            }
        }

    }
}
