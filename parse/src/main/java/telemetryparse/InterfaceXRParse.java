package telemetryparse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import telemetryparse.interfacexrbeans.*;

import java.util.ArrayList;
import java.util.List;

import static telemetryparse.DataPretreatment.data2str;
import static telemetryparse.DataPretreatment.getDataStr;

/**
 * Classname InterfaceXRParse
 * Date 2020/6/12 16:06
 * Created by LanKorment
 * path : Cisco-IOS-XR-pfi-im-cmd-oper:interfaces/interface-xr/interface
 * inteface-xr的数据并不规则，同一次抓取中不同的对象有不同的数据字段。
 */
public class InterfaceXRParse {
    public static void main(String[] args){
        //StringBuffer strbuff = getDataStr("D:\\WorkSpace\\data&note\\age.txt");
        StringBuffer strbuff = getDataStr("D:\\WorkSpace\\Telemetry\\dump-interface-xr.txt");
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
            //获得外部的Object
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


                JSONObject obj5 = obj4.getJSONObject("arp-information");
                ARPInformation arpInformation = new ARPInformation();
                arpInformation.arp_is_learning_disabled = obj5.getString("arp-is-learning-disabled");
                arpInformation.arp_timeout = obj5.getInt("arp-timeout");
                arpInformation.arp_type_name = obj5.getString("arp-type-name");
                content.arpInformation= arpInformation;

                content.bandwidth = obj4.getInt("bandwidth");

                JSONObject obj6 = obj4.getJSONObject("burned-in-address");
                BurnedInAddress burnedInAddress = new BurnedInAddress();
                burnedInAddress.address = obj6.getString("address");

                JSONObject obj7 = obj4.getJSONObject("carrier-delay");
                CarrierDelay carrierDelay = new CarrierDelay();
                carrierDelay.carrier_delay_down = obj7.getInt("carrier-delay-down");
                carrierDelay.carrier_delay_up = obj7.getInt("carrier-delay-up");
                content.carrierDelay = carrierDelay;

                JSONObject obj8 = obj4.getJSONObject("data-rates");
                DataRates dataRates = new DataRates();
                dataRates.input_data_rate = obj8.getInt("input-data-rate");
                dataRates.input_load = obj8.getInt("input-load");
                dataRates.input_packet_rate = obj8.getInt("input-packet-rate");
                dataRates.load_interval = obj8.getInt("load-interval");
                dataRates.output_data_rate = obj8.getInt("output-data-rate");
                dataRates.output_load = obj8.getInt("output-load");
                dataRates.output_packet_rate = obj8.getInt("output-packet-rate");
                dataRates.peak_input_data_rate = obj8.getInt("peak-input-data-rate");
                dataRates.peak_output_packet_rate = obj8.getInt("peak-input-packet-rate");
                dataRates.peak_output_data_rate = obj8.getInt("peak-output-data-rate");
                dataRates.peak_output_packet_rate = obj8.getInt("peak-output-packet-rate");
                dataRates.reliability = obj8.getInt("reliability");
                content.dataRates = dataRates;

                content.description = obj4.getString("description");
                content.duplexity = obj4.getString("duplexity");
                content.encapsulation = obj4.getString("encapsulation");
                content.encapsulation_type_string = obj4.getString("encapsulation-type-string");
                content.fast_shutdown = obj4.getString("fast-shutdown");
                content.hardware_type_string = obj4.getString("hardware-type-string");
                content.if_index = obj4.getInt("if-index");
                content.in_flow_control = obj4.getString("in-flow-control");
                content.interface_handle = obj4.getString("interface-handle");

                JSONObject obj9 = obj4.getJSONObject("interface-statistics");
                InterfaceStatistics interfaceStatistics = new InterfaceStatistics();

                JSONObject obj10 = obj9.getJSONObject("full-interface-stats");
                FullInterfaceStats fullInterfaceStats = new FullInterfaceStats();

                fullInterfaceStats.applique = obj10.getLong("applique");
                fullInterfaceStats.availability_flag = obj10.getLong("availability-flag");
                fullInterfaceStats.broadcast_packets_received = obj10.getLong("broadcast-packets-received");
                fullInterfaceStats.broadcast_packets_sent = obj10.getLong("broadcast-packets-sent");
                fullInterfaceStats.bytes_received = obj10.getBigDecimal("bytes-received");
                fullInterfaceStats.bytes_sent = obj10.getBigDecimal("bytes-sent");
                fullInterfaceStats.carrier_transitions = obj10.getLong("carrier-transitions");
                fullInterfaceStats.crc_errors = obj10.getLong("crc-errors");
                fullInterfaceStats.framing_errors_received = obj10.getLong("framing-errors-received");
                fullInterfaceStats.giant_packets_received = obj10.getLong("giant-packets-received");
                fullInterfaceStats.input_aborts = obj10.getLong("input-aborts");
                fullInterfaceStats.input_drops = obj10.getLong("input-drops");
                fullInterfaceStats.input_errors = obj10.getLong("input-errors");
                fullInterfaceStats.input_ignored_packets = obj10.getLong("input-ignored-packets");
                fullInterfaceStats.input_overruns = obj10.getLong("input-overruns");
                fullInterfaceStats.input_queue_drops = obj10.getLong("input-queue-drops");
                fullInterfaceStats.last_data_time = obj10.getLong("last-data-time");
                fullInterfaceStats.last_discontinuity_time = obj10.getLong("last-discontinuity-time");
                fullInterfaceStats.multicast_packets_received = obj10.getLong("multicast-packets-received");
                fullInterfaceStats.multicast_packets_sent = obj10.getLong("multicast-packets-sent");
                fullInterfaceStats.output_buffer_failures = obj10.getLong("output-buffer-failures");
                fullInterfaceStats.output_buffers_swapped_out = obj10.getLong("output-buffers-swapped-out");
                fullInterfaceStats.output_drops = obj10.getLong("output-drops");
                fullInterfaceStats.output_errors = obj10.getLong("output-errors");
                fullInterfaceStats.output_queue_drops = obj10.getLong("output-queue-drops");
                fullInterfaceStats.output_underruns = obj10.getLong("output-underruns");
                fullInterfaceStats.packets_received = obj10.getLong("packets-received");
                fullInterfaceStats.packets_sent = obj10.getLong("packets-sent");
                fullInterfaceStats.parity_packets_received = obj10.getLong("parity-packets-received");
                fullInterfaceStats.resets = obj10.getLong("resets");
                fullInterfaceStats.runt_packets_received = obj10.getLong("runt-packets-received");
                fullInterfaceStats.seconds_since_last_clear_counters = obj10.getLong("seconds-since-last-clear-counters");
                fullInterfaceStats.seconds_since_packet_received = obj10.getLong("seconds-since-packet-received");
                fullInterfaceStats.seconds_since_packet_sent = obj10.getLong("seconds-since-packet-sent");
                fullInterfaceStats.throttled_packets_received = obj10.getLong("throttled-packets-received");
                fullInterfaceStats.unknown_protocol_packets_received = obj10.getLong("unknown-protocol-packets-received");

                interfaceStatistics.fullInterfaceStats = fullInterfaceStats;
                interfaceStatistics.stats_type = obj9.getString("stats-type");

                content.interfaceStatistics = interfaceStatistics;

                content.interface_type = obj4.getString("interface-type");

                JSONObject obj11 = obj4.getJSONObject("ip-information");
                IpInformation ipInformation = new IpInformation();
                ipInformation.ip_address = obj11.getString("ip-address");
                ipInformation.subnet_mask_length = obj11.getInt("subnet-mask-length");
                content.ipInformation = ipInformation;

                content.is_dampening_enabled = obj4.getString("is-dampening-enabled");
                content.is_l2_looped = obj4.getString("is-l2-looped");
                content.is_l2_transport_enabled = obj4.getString("is-l2-transport-enabled");
                content.last_state_transition_time = obj4.getLong("last-state-transition-time");
                content.line_state = obj4.getString("line-state");
                content.link_type = obj4.getString("link-type");

                JSONObject obj12 = obj4.getJSONObject("mac-address");
                MacAddress macAddress = new MacAddress();
                macAddress.address = obj12.getString("address");
                content.macAddress =macAddress;

                content.max_bandwidth = obj4.getInt("max-bandwidth");
                content.media_type = obj4.getString("media-type");
                content.mtu = obj4.getInt("mtu");
                content.out_flow_control = obj4.getString("out-flow-control");
                content.parent_interface_name = obj4.getString("parent-interface-name");
                content.speed = obj4.getInt("speed");
                content.state = obj4.getString("state");
                content.state_transition_count = obj4.getInt("state-transition-count");

                row.content = content;

                rows.add(row);
            }
            dataModel.row = rows;
            //输出字段
            System.out.println(dataModel);
        }

    }

}
