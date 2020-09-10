package extract.statistic;

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
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-statistic.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }

    public static void parse(String[] strarr) throws IOException {

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //获取Topology的数据
            StatisticBean bean = new StatisticBean();

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
            //TelemetryObject telemetry = new TelemetryObject();
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
                //RowsObject row = new RowsObject();
                bean.row_timestamp = obj2.getLong("Timestamp");

                //获取Keys数据
                JSONObject obj3 = obj2.getJSONObject("Keys");
                bean.interface_name = obj3.getString("interface-name");

                //获取Content的数据
                JSONObject obj4 = obj2.getJSONObject("Content");
                bean.aborted_packet_drops = obj4.getLong("aborted-packet-drops");
                bean.buffer_underrun_packet_drops = obj4.getLong("buffer-underrun-packet-drops");
                bean.dropped_ether_stats_fragments = obj4.getLong("dropped-ether-stats-fragments");
                bean.dropped_ether_stats_undersize_pkts = obj4.getLong("dropped-ether-stats-undersize-pkts");
                bean.dropped_giant_packets_greaterthan_mru = obj4.getLong("dropped-giant-packets-greaterthan-mru");
                bean.dropped_jabbers_packets_greaterthan_mru = obj4.getLong("dropped-jabbers-packets-greaterthan-mru");
                bean.dropped_miscellaneous_error_packets = obj4.getLong("dropped-miscellaneous-error-packets");
                bean.dropped_packets_with_crc_align_errors = obj4.getLong("dropped-packets-with-crc-align-errors");
                bean.ether_stats_collisions = obj4.getLong("ether-stats-collisions");
                bean.invalid_dest_mac_drop_packets = obj4.getLong("invalid-dest-mac-drop-packets");
                bean.invalid_encap_drop_packets = obj4.getLong("invalid-encap-drop-packets");
                bean.miscellaneous_output_errors = obj4.getLong("miscellaneous-output-errors");
                bean.number_of_aborted_packets_dropped = obj4.getLong("number-of-aborted-packets-dropped");
                bean.number_of_buffer_overrun_packets_dropped = obj4.getLong("number-of-buffer-overrun-packets-dropped");
                bean.number_of_miscellaneous_packets_dropped = obj4.getLong("number-of-miscellaneous-packets-dropped");
                bean.numberof_invalid_vlan_id_packets_dropped = obj4.getLong("numberof-invalid-vlan-id-packets-dropped");
                bean.received_broadcast_frames = obj4.getLong("received-broadcast-frames");
                bean.received_good_bytes = obj4.getBigDecimal("received-good-bytes");
                bean.received_good_frames = obj4.getLong("received-good-frames");
                bean.received_multicast_frames = obj4.getLong("received-multicast-frames");
                bean.received_pause_frames = obj4.getLong("received-pause-frames");
                bean.received_total_bytes = obj4.getBigDecimal("received-total-bytes");
                bean.received_total_frames = obj4.getLong("received-total-frames");
                bean.received_total_octet_frames_from1024_to1518 = obj4.getLong("received-total-octet-frames-from1024-to1518");
                bean.received_total_octet_frames_from128_to255 = obj4.getLong("received-total-octet-frames-from128-to255");
                bean.received_total_octet_frames_from1519_to_max = obj4.getLong("received-total-octet-frames-from1519-to-max");
                bean.received_total_octet_frames_from256_to511 = obj4.getLong("received-total-octet-frames-from256-to511");
                bean.received_total_octet_frames_from512_to1023 = obj4.getLong("received-total-octet-frames-from512-to1023");
                bean.received_total_octet_frames_from65_to127 = obj4.getLong("received-total-octet-frames-from65-to127");
                bean.received_total64_octet_frames = obj4.getLong("received-total64-octet-frames");
                bean.received_unicast_frames = obj4.getLong("received-unicast-frames");
                bean.received_unknown_opcodes = obj4.getLong("received-unknown-opcodes");
                bean.received8021q_frames = obj4.getLong("received8021q-frames");
                bean.rfc2819_ether_stats_crc_align_errors = obj4.getLong("rfc2819-ether-stats-crc-align-errors");
                bean.rfc2819_ether_stats_jabbers = obj4.getLong("rfc2819-ether-stats-jabbers");
                bean.rfc2819_ether_stats_oversized_pkts = obj4.getLong("rfc2819-ether-stats-oversized-pkts");
                bean.rfc3635dot3_stats_alignment_errors = obj4.getLong("rfc3635dot3-stats-alignment-errors");
                bean.symbol_errors = obj4.getLong("symbol-errors");
                bean.total_bytes_transmitted = obj4.getBigDecimal("total-bytes-transmitted");
                bean.total_frames_transmitted = obj4.getLong("total-frames-transmitted");
                bean.total_good_bytes_transmitted = obj4.getBigDecimal("total-good-bytes-transmitted");
                bean.transmitted_broadcast_frames = obj4.getLong("transmitted-broadcast-frames");
                bean.transmitted_good_frames = obj4.getLong("transmitted-good-frames");
                bean.transmitted_multicast_frames = obj4.getLong("transmitted-multicast-frames");
                bean.transmitted_total_octet_frames_from1024_to1518 = obj4.getLong("transmitted-total-octet-frames-from1024-to1518");
                bean.transmitted_total_octet_frames_from128_to255 = obj4.getLong("transmitted-total-octet-frames-from128-to255");
                bean.transmitted_total_octet_frames_from1518_to_max = obj4.getLong("transmitted-total-octet-frames-from1518-to-max");
                bean.transmitted_total_octet_frames_from256_to511 = obj4.getLong("transmitted-total-octet-frames-from256-to511");
                bean.transmitted_total_octet_frames_from512_to1023 = obj4.getLong("transmitted-total-octet-frames-from512-to1023");
                bean.transmitted_total_octet_frames_from65_to127 = obj4.getLong("transmitted-total-octet-frames-from65-to127");
                bean.transmitted_total_pause_frames = obj4.getLong("transmitted-total-pause-frames");
                bean.transmitted_total64_octet_frames = obj4.getLong("transmitted-total64-octet-frames");
                bean.transmitted_unicast_frames = obj4.getLong("transmitted-unicast-frames");
                bean.transmitted8021q_frames = obj4.getLong("transmitted8021q-frames");
                bean.uncounted_dropped_frames = obj4.getLong("uncounted-dropped-frames");

                write2Local("D:\\WorkSpace\\data&note",bean.toString());
            }

        }

    }
}
