package telemetryparse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import telemetryparse.statisticbeans.ContentObject;
import telemetryparse.statisticbeans.DataModel;
import telemetryparse.statisticbeans.KeysObject;
import telemetryparse.statisticbeans.RowsObject;

import java.util.ArrayList;
import java.util.List;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;

/**
 * Classname StatisticParse
 * Date 2020/6/12 16:10
 * Created by LanKorment
 * path : Cisco-IOS-XR-drivers-media-eth-oper:ethernet-interface/statistics/statistic
 */
public class StatisticParse {

    public static void main(String[] args){
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-statistic.txt");
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
                content.aborted_packet_drops = obj4.getLong("aborted-packet-drops");
                content.buffer_underrun_packet_drops = obj4.getLong("buffer-underrun-packet-drops");
                content.dropped_ether_stats_fragments = obj4.getLong("dropped-ether-stats-fragments");
                content.dropped_ether_stats_undersize_pkts = obj4.getLong("dropped-ether-stats-undersize-pkts");
                content.dropped_giant_packets_greaterthan_mru = obj4.getLong("dropped-giant-packets-greaterthan-mru");
                content.dropped_jabbers_packets_greaterthan_mru = obj4.getLong("dropped-jabbers-packets-greaterthan-mru");
                content.dropped_miscellaneous_error_packets = obj4.getLong("dropped-miscellaneous-error-packets");
                content.dropped_packets_with_crc_align_errors = obj4.getLong("dropped-packets-with-crc-align-errors");
                content.ether_stats_collisions = obj4.getLong("ether-stats-collisions");
                content.invalid_dest_mac_drop_packets = obj4.getLong("invalid-dest-mac-drop-packets");
                content.invalid_encap_drop_packets = obj4.getLong("invalid-encap-drop-packets");
                content.miscellaneous_output_errors = obj4.getLong("miscellaneous-output-errors");
                content.number_of_aborted_packets_dropped = obj4.getLong("number-of-aborted-packets-dropped");
                content.number_of_buffer_overrun_packets_dropped = obj4.getLong("number-of-buffer-overrun-packets-dropped");
                content.number_of_miscellaneous_packets_dropped = obj4.getLong("number-of-miscellaneous-packets-dropped");
                content.numberof_invalid_vlan_id_packets_dropped = obj4.getLong("numberof-invalid-vlan-id-packets-dropped");
                content.received_broadcast_frames = obj4.getLong("received-broadcast-frames");
                content.received_good_bytes = obj4.getBigDecimal("received-good-bytes");
                content.received_good_frames = obj4.getLong("received-good-frames");
                content.received_multicast_frames = obj4.getLong("received-multicast-frames");
                content.received_pause_frames = obj4.getLong("received-pause-frames");
                content.received_total_bytes = obj4.getBigDecimal("received-total-bytes");
                content.received_total_frames = obj4.getLong("received-total-frames");
                content.received_total_octet_frames_from1024_to1518 = obj4.getLong("received-total-octet-frames-from1024-to1518");
                content.received_total_octet_frames_from128_to255 = obj4.getLong("received-total-octet-frames-from128-to255");
                content.received_total_octet_frames_from1519_to_max = obj4.getLong("received-total-octet-frames-from1519-to-max");
                content.received_total_octet_frames_from256_to511 = obj4.getLong("received-total-octet-frames-from256-to511");
                content.received_total_octet_frames_from512_to1023 = obj4.getLong("received-total-octet-frames-from512-to1023");
                content.received_total_octet_frames_from65_to127 = obj4.getLong("received-total-octet-frames-from65-to127");
                content.received_total64_octet_frames = obj4.getLong("received-total64-octet-frames");
                content.received_unicast_frames = obj4.getLong("received-unicast-frames");
                content.received_unknown_opcodes = obj4.getLong("received-unknown-opcodes");
                content.received8021q_frames = obj4.getLong("received8021q-frames");
                content.rfc2819_ether_stats_crc_align_errors = obj4.getLong("rfc2819-ether-stats-crc-align-errors");
                content.rfc2819_ether_stats_jabbers = obj4.getLong("rfc2819-ether-stats-jabbers");
                content.rfc2819_ether_stats_oversized_pkts = obj4.getLong("rfc2819-ether-stats-oversized-pkts");
                content.rfc3635dot3_stats_alignment_errors = obj4.getLong("rfc3635dot3-stats-alignment-errors");
                content.symbol_errors = obj4.getLong("symbol-errors");
                content.total_bytes_transmitted = obj4.getBigDecimal("total-bytes-transmitted");
                content.total_frames_transmitted = obj4.getLong("total-frames-transmitted");
                content.total_good_bytes_transmitted = obj4.getBigDecimal("total-good-bytes-transmitted");
                content.transmitted_broadcast_frames = obj4.getLong("transmitted-broadcast-frames");
                content.transmitted_good_frames = obj4.getLong("transmitted-good-frames");
                content.transmitted_multicast_frames = obj4.getLong("transmitted-multicast-frames");
                content.transmitted_total_octet_frames_from1024_to1518 = obj4.getLong("transmitted-total-octet-frames-from1024-to1518");
                content.transmitted_total_octet_frames_from128_to255 = obj4.getLong("transmitted-total-octet-frames-from128-to255");
                content.transmitted_total_octet_frames_from1518_to_max = obj4.getLong("transmitted-total-octet-frames-from1518-to-max");
                content.transmitted_total_octet_frames_from256_to511 = obj4.getLong("transmitted-total-octet-frames-from256-to511");
                content.transmitted_total_octet_frames_from512_to1023 = obj4.getLong("transmitted-total-octet-frames-from512-to1023");
                content.transmitted_total_octet_frames_from65_to127 = obj4.getLong("transmitted-total-octet-frames-from65-to127");
                content.transmitted_total_pause_frames = obj4.getLong("transmitted-total-pause-frames");
                content.transmitted_total64_octet_frames = obj4.getLong("transmitted-total64-octet-frames");
                content.transmitted_unicast_frames = obj4.getLong("transmitted-unicast-frames");
                content.transmitted8021q_frames = obj4.getLong("transmitted8021q-frames");
                content.uncounted_dropped_frames = obj4.getLong("uncounted-dropped-frames");

                row.content = content;

                rows.add(row);
            }
            dataModel.row = rows;
            //输出字段
            System.out.println(dataModel);
        }

    }
}
