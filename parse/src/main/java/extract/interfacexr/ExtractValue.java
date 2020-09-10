package extract.interfacexr;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;
import static utils.Write2Local.write2Local;

/**
 * Classname extract.topology.ExtractValue
 * Description TODO
 * Date 2020/7/28 11:29
 * Created by LanKorment
 * interface-xr 收集到的数据不规则，字段不固定，有字段缺失
 */

public class ExtractValue {
    public static void main(String[] args) throws IOException {
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-interface-xr.txt");
        String[] result = data2str(strbuff);
        parse(result);
    }

    public static void parse(String[] strarr) throws IOException {

        for(int i = 1 ; i < strarr.length ; i++){

            String str = strarr[i].replace("-------\n","");

            //获取Topology的数据
            InterfaceXRBean bean = new InterfaceXRBean();

            //获取标头信息
            String header = StringUtils.substringBetween(str,"2020-","]") + "]";
            //String header = "预处理获取标头信息";
            bean.header = header;

            String json = StringUtils.substringAfter(str,header);
            //System.out.println(json);
            //首先看到的是一个{}所以用JSON Object来进行解析
            //获得外部的Object
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
            //dataModel.telemetry = telemetry;

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

                try{
                    JSONObject obj5 = obj4.getJSONObject("arp-information");
                    bean.arp_is_learning_disabled = obj5.getString("arp-is-learning-disabled");
                    bean.arp_timeout = obj5.getInt("arp-timeout");
                    bean.arp_type_name = obj5.getString("arp-type-name");
                }catch(Exception e){
                    bean.arp_is_learning_disabled = "null";
                    bean.arp_timeout = 0 ;
                    bean.arp_type_name = "null";
                }

                bean.bandwidth = obj4.getInt("bandwidth");

                try{
                    JSONObject obj6 = obj4.getJSONObject("burned-in-address");
                    bean.burned_in_address = obj6.getString("address");
                }catch (Exception e){
                    bean.burned_in_address = "null";
                }

                try{
                    JSONObject obj7 = obj4.getJSONObject("carrier-delay");
                    bean.carrier_delay_down = obj7.getInt("carrier-delay-down");
                    bean.carrier_delay_up = obj7.getInt("carrier-delay-up");
                }catch (Exception e){
                    bean.carrier_delay_down = 0;
                    bean.carrier_delay_up = 0;
                }

                try{
                    JSONObject obj8 = obj4.getJSONObject("data-rates");
                    //DataRates dataRates = new DataRates();
                    bean.input_data_rate = obj8.getInt("input-data-rate");
                    bean.input_load = obj8.getInt("input-load");
                    bean.input_packet_rate = obj8.getInt("input-packet-rate");
                    bean.load_interval = obj8.getInt("load-interval");
                    bean.output_data_rate = obj8.getInt("output-data-rate");
                    bean.output_load = obj8.getInt("output-load");
                    bean.output_packet_rate = obj8.getInt("output-packet-rate");
                    bean.peak_input_data_rate = obj8.getInt("peak-input-data-rate");
                    bean.peak_output_packet_rate = obj8.getInt("peak-input-packet-rate");
                    bean.peak_output_data_rate = obj8.getInt("peak-output-data-rate");
                    bean.peak_output_packet_rate = obj8.getInt("peak-output-packet-rate");
                    bean.reliability = obj8.getInt("reliability");
                }catch (Exception e){
                    bean.input_data_rate = 0;
                    bean.input_load = 0;
                    bean.input_packet_rate = 0;
                    bean.load_interval = 0;
                    bean.output_data_rate = 0;
                    bean.output_load = 0;
                    bean.output_packet_rate = 0;
                    bean.peak_input_data_rate = 0;
                    bean.peak_output_packet_rate = 0;
                    bean.peak_output_data_rate = 0;
                    bean.peak_output_packet_rate = 0;
                    bean.reliability = 0;
                }

                bean.description = obj4.getString("description");

                try{
                    bean.duplexity = obj4.getString("duplexity");
                }catch (Exception e){
                    bean.duplexity = "null";
                }

                bean.encapsulation = obj4.getString("encapsulation");
                bean.encapsulation_type_string = obj4.getString("encapsulation-type-string");
                bean.fast_shutdown = obj4.getString("fast-shutdown");
                bean.hardware_type_string = obj4.getString("hardware-type-string");
                bean.if_index = obj4.getInt("if-index");

                try{
                    bean.in_flow_control = obj4.getString("in-flow-control");
                }catch (Exception e){
                    bean.in_flow_control = "null";
                }

                bean.interface_handle = obj4.getString("interface-handle");

                try{
                    JSONObject obj9 = obj4.getJSONObject("interface-statistics");
                    JSONObject obj10 = obj9.getJSONObject("full-interface-stats");

                    bean.applique = obj10.getLong("applique");
                    bean.availability_flag = obj10.getLong("availability-flag");
                    bean.broadcast_packets_received = obj10.getLong("broadcast-packets-received");
                    bean.broadcast_packets_sent = obj10.getLong("broadcast-packets-sent");
                    bean.bytes_received = obj10.getDouble("bytes-received");
                    bean.bytes_sent = obj10.getDouble("bytes-sent");
                    bean.carrier_transitions = obj10.getLong("carrier-transitions");
                    bean.crc_errors = obj10.getLong("crc-errors");
                    bean.framing_errors_received = obj10.getLong("framing-errors-received");
                    bean.giant_packets_received = obj10.getLong("giant-packets-received");
                    bean.input_aborts = obj10.getLong("input-aborts");
                    bean.input_drops = obj10.getLong("input-drops");
                    bean.input_errors = obj10.getLong("input-errors");
                    bean.input_ignored_packets = obj10.getLong("input-ignored-packets");
                    bean.input_overruns = obj10.getLong("input-overruns");
                    bean.input_queue_drops = obj10.getLong("input-queue-drops");
                    bean.last_data_time = obj10.getLong("last-data-time");
                    bean.last_discontinuity_time = obj10.getLong("last-discontinuity-time");
                    bean.multicast_packets_received = obj10.getLong("multicast-packets-received");
                    bean.multicast_packets_sent = obj10.getLong("multicast-packets-sent");
                    bean.output_buffer_failures = obj10.getLong("output-buffer-failures");
                    bean.output_buffers_swapped_out = obj10.getLong("output-buffers-swapped-out");
                    bean.output_drops = obj10.getLong("output-drops");
                    bean.output_errors = obj10.getLong("output-errors");
                    bean.output_queue_drops = obj10.getLong("output-queue-drops");
                    bean.output_underruns = obj10.getLong("output-underruns");
                    bean.packets_received = obj10.getLong("packets-received");
                    bean.packets_sent = obj10.getLong("packets-sent");
                    bean.parity_packets_received = obj10.getLong("parity-packets-received");
                    bean.resets = obj10.getLong("resets");
                    bean.runt_packets_received = obj10.getLong("runt-packets-received");
                    bean.seconds_since_last_clear_counters = obj10.getLong("seconds-since-last-clear-counters");
                    bean.seconds_since_packet_received = obj10.getLong("seconds-since-packet-received");
                    bean.seconds_since_packet_sent = obj10.getLong("seconds-since-packet-sent");
                    bean.throttled_packets_received = obj10.getLong("throttled-packets-received");
                    bean.unknown_protocol_packets_received = obj10.getLong("unknown-protocol-packets-received");

                    bean.stats_type = obj9.getString("stats-type");

                }catch (Exception e){
                    bean.applique = 0;
                    bean.availability_flag = 0;
                    bean.broadcast_packets_received = 0;
                    bean.broadcast_packets_sent = 0;
                    bean.bytes_received = 0;
                    bean.bytes_sent = 0;
                    bean.carrier_transitions = 0;
                    bean.crc_errors = 0;
                    bean.framing_errors_received = 0;
                    bean.giant_packets_received = 0;
                    bean.input_aborts = 0;
                    bean.input_drops = 0;
                    bean.input_errors = 0;
                    bean.input_ignored_packets = 0;
                    bean.input_overruns = 0;
                    bean.input_queue_drops = 0;
                    bean.last_data_time = 0;
                    bean.last_discontinuity_time = 0;
                    bean.multicast_packets_received = 0;
                    bean.multicast_packets_sent = 0;
                    bean.output_buffer_failures = 0;
                    bean.output_buffers_swapped_out = 0;
                    bean.output_drops = 0;
                    bean.output_errors = 0;
                    bean.output_queue_drops = 0;
                    bean.output_underruns = 0;
                    bean.packets_received = 0;
                    bean.packets_sent = 0;
                    bean.parity_packets_received = 0;
                    bean.resets = 0;
                    bean.runt_packets_received = 0;
                    bean.seconds_since_last_clear_counters = 0;
                    bean.seconds_since_packet_received = 0;
                    bean.seconds_since_packet_sent = 0;
                    bean.throttled_packets_received = 0;
                    bean.unknown_protocol_packets_received = 0;

                    bean.stats_type = "null";
                }

                try{
                    JSONObject obj11 = obj4.getJSONObject("ip-information");
                    //IpInformation ipInformation = new IpInformation();
                    bean.ip_address = obj11.getString("ip-address");
                    bean.subnet_mask_length = obj11.getInt("subnet-mask-length");
                    //content.ipInformation = ipInformation;
                }catch (Exception e){
                    bean.ip_address = "null";
                    bean.subnet_mask_length = 0;
                }

                bean.is_dampening_enabled = obj4.getString("is-dampening-enabled");
                bean.is_l2_looped = obj4.getString("is-l2-looped");
                bean.is_l2_transport_enabled = obj4.getString("is-l2-transport-enabled");
                bean.last_state_transition_time = obj4.getLong("last-state-transition-time");
                bean.line_state = obj4.getString("line-state");
                try{
                    bean.link_type = obj4.getString("link-type");
                }catch (Exception e){
                    bean.link_type = "null";
                }

                try{
                    JSONObject obj12 = obj4.getJSONObject("mac-address");
                    bean.mac_address = obj12.getString("address");
                }catch (Exception e){
                    bean.mac_address = "null";
                }

                bean.max_bandwidth = obj4.getInt("max-bandwidth");

                try{
                    bean.media_type = obj4.getString("media-type");
                }catch (Exception e){
                    bean.media_type = "null";
                }

                bean.mtu = obj4.getInt("mtu");

                try{
                    bean.out_flow_control = obj4.getString("out-flow-control");
                }catch (Exception e){
                    bean.out_flow_control = "null";
                }

                bean.parent_interface_name = obj4.getString("parent-interface-name");
                try{
                    bean.speed = obj4.getInt("speed");
                }catch (Exception e){
                    bean.speed = 0;
                }

                bean.state = obj4.getString("state");
                bean.state_transition_count = obj4.getInt("state-transition-count");

                write2Local("D:\\WorkSpace\\data&note",bean.toString());
                //System.out.println(bean);
            }
        }

    }
}
