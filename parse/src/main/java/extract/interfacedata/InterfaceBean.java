package extract.interfacedata;

import java.math.BigDecimal;

/**
 * Classname InterfaceXRBean
 * Date 2020/7/28 16:30
 * Created by LanKorment
 */
public class InterfaceBean {
    public String header;
    public String source;
    public String node_id_str;
    public String subscription_id_str;
    public String encoding_path;
    public int collection_id;
    public long collection_start_time;
    public long msg_timestamp;
    public long collection_end_time;
    public long row_timestamp;
    public String interface_name;
    public long applique;
    public long availability_flag;
    public long broadcast_packets_received;
    public long broadcast_packets_sent;
    public BigDecimal bytes_received;
    public BigDecimal bytes_sent;
    public long carrier_transitions;
    public long crc_errors;
    public long framing_errors_received;
    public long giant_packets_received;
    public long input_aborts;
    public long input_drops;
    public long input_errors;
    public long input_ignored_packets;
    public long input_overruns;
    public long input_queue_drops;
    public long last_data_time;
    public long last_discontinuity_time;
    public long multicast_packets_received;
    public long multicast_packets_sent;
    public long output_buffer_failures;
    public long output_buffers_swapped_out;
    public long output_drops;
    public long output_errors;
    public long output_queue_drops;
    public long output_underruns;
    public long packets_received;
    public long packets_sent;
    public long parity_packets_received;
    public long resets;
    public long runt_packets_received;
    public long seconds_since_last_clear_counters;
    public long seconds_since_packet_received;
    public long seconds_since_packet_sent;
    public long throttled_packets_received;
    public long unknown_protocol_packets_received;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNode_id_str() {
        return node_id_str;
    }

    public void setNode_id_str(String node_id_str) {
        this.node_id_str = node_id_str;
    }

    public String getSubscription_id_str() {
        return subscription_id_str;
    }

    public void setSubscription_id_str(String subscription_id_str) {
        this.subscription_id_str = subscription_id_str;
    }

    public String getEncoding_path() {
        return encoding_path;
    }

    public void setEncoding_path(String encoding_path) {
        this.encoding_path = encoding_path;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public long getCollection_start_time() {
        return collection_start_time;
    }

    public void setCollection_start_time(long collection_start_time) {
        this.collection_start_time = collection_start_time;
    }

    public long getMsg_timestamp() {
        return msg_timestamp;
    }

    public void setMsg_timestamp(long msg_timestamp) {
        this.msg_timestamp = msg_timestamp;
    }

    public long getCollection_end_time() {
        return collection_end_time;
    }

    public void setCollection_end_time(long collection_end_time) {
        this.collection_end_time = collection_end_time;
    }

    public long getRow_timestamp() {
        return row_timestamp;
    }

    public void setRow_timestamp(long row_timestamp) {
        this.row_timestamp = row_timestamp;
    }

    public String getInterface_name() {
        return interface_name;
    }

    public void setInterface_name(String interface_name) {
        this.interface_name = interface_name;
    }

    public long getApplique() {
        return applique;
    }

    public void setApplique(long applique) {
        this.applique = applique;
    }

    public long getAvailability_flag() {
        return availability_flag;
    }

    public void setAvailability_flag(long availability_flag) {
        this.availability_flag = availability_flag;
    }

    public long getBroadcast_packets_received() {
        return broadcast_packets_received;
    }

    public void setBroadcast_packets_received(long broadcast_packets_received) {
        this.broadcast_packets_received = broadcast_packets_received;
    }

    public long getBroadcast_packets_sent() {
        return broadcast_packets_sent;
    }

    public void setBroadcast_packets_sent(long broadcast_packets_sent) {
        this.broadcast_packets_sent = broadcast_packets_sent;
    }

    public BigDecimal getBytes_received() {
        return bytes_received;
    }

    public void setBytes_received(BigDecimal bytes_received) {
        this.bytes_received = bytes_received;
    }

    public BigDecimal getBytes_sent() {
        return bytes_sent;
    }

    public void setBytes_sent(BigDecimal bytes_sent) {
        this.bytes_sent = bytes_sent;
    }

    public long getCarrier_transitions() {
        return carrier_transitions;
    }

    public void setCarrier_transitions(long carrier_transitions) {
        this.carrier_transitions = carrier_transitions;
    }

    public long getCrc_errors() {
        return crc_errors;
    }

    public void setCrc_errors(long crc_errors) {
        this.crc_errors = crc_errors;
    }

    public long getFraming_errors_received() {
        return framing_errors_received;
    }

    public void setFraming_errors_received(long framing_errors_received) {
        this.framing_errors_received = framing_errors_received;
    }

    public long getGiant_packets_received() {
        return giant_packets_received;
    }

    public void setGiant_packets_received(long giant_packets_received) {
        this.giant_packets_received = giant_packets_received;
    }

    public long getInput_aborts() {
        return input_aborts;
    }

    public void setInput_aborts(long input_aborts) {
        this.input_aborts = input_aborts;
    }

    public long getInput_drops() {
        return input_drops;
    }

    public void setInput_drops(long input_drops) {
        this.input_drops = input_drops;
    }

    public long getInput_errors() {
        return input_errors;
    }

    public void setInput_errors(long input_errors) {
        this.input_errors = input_errors;
    }

    public long getInput_ignored_packets() {
        return input_ignored_packets;
    }

    public void setInput_ignored_packets(long input_ignored_packets) {
        this.input_ignored_packets = input_ignored_packets;
    }

    public long getInput_overruns() {
        return input_overruns;
    }

    public void setInput_overruns(long input_overruns) {
        this.input_overruns = input_overruns;
    }

    public long getInput_queue_drops() {
        return input_queue_drops;
    }

    public void setInput_queue_drops(long input_queue_drops) {
        this.input_queue_drops = input_queue_drops;
    }

    public long getLast_data_time() {
        return last_data_time;
    }

    public void setLast_data_time(long last_data_time) {
        this.last_data_time = last_data_time;
    }

    public long getLast_discontinuity_time() {
        return last_discontinuity_time;
    }

    public void setLast_discontinuity_time(long last_discontinuity_time) {
        this.last_discontinuity_time = last_discontinuity_time;
    }

    public long getMulticast_packets_received() {
        return multicast_packets_received;
    }

    public void setMulticast_packets_received(long multicast_packets_received) {
        this.multicast_packets_received = multicast_packets_received;
    }

    public long getMulticast_packets_sent() {
        return multicast_packets_sent;
    }

    public void setMulticast_packets_sent(long multicast_packets_sent) {
        this.multicast_packets_sent = multicast_packets_sent;
    }

    public long getOutput_buffer_failures() {
        return output_buffer_failures;
    }

    public void setOutput_buffer_failures(long output_buffer_failures) {
        this.output_buffer_failures = output_buffer_failures;
    }

    public long getOutput_buffers_swapped_out() {
        return output_buffers_swapped_out;
    }

    public void setOutput_buffers_swapped_out(long output_buffers_swapped_out) {
        this.output_buffers_swapped_out = output_buffers_swapped_out;
    }

    public long getOutput_drops() {
        return output_drops;
    }

    public void setOutput_drops(long output_drops) {
        this.output_drops = output_drops;
    }

    public long getOutput_errors() {
        return output_errors;
    }

    public void setOutput_errors(long output_errors) {
        this.output_errors = output_errors;
    }

    public long getOutput_queue_drops() {
        return output_queue_drops;
    }

    public void setOutput_queue_drops(long output_queue_drops) {
        this.output_queue_drops = output_queue_drops;
    }

    public long getOutput_underruns() {
        return output_underruns;
    }

    public void setOutput_underruns(long output_underruns) {
        this.output_underruns = output_underruns;
    }

    public long getPackets_received() {
        return packets_received;
    }

    public void setPackets_received(long packets_received) {
        this.packets_received = packets_received;
    }

    public long getPackets_sent() {
        return packets_sent;
    }

    public void setPackets_sent(long packets_sent) {
        this.packets_sent = packets_sent;
    }

    public long getParity_packets_received() {
        return parity_packets_received;
    }

    public void setParity_packets_received(long parity_packets_received) {
        this.parity_packets_received = parity_packets_received;
    }

    public long getResets() {
        return resets;
    }

    public void setResets(long resets) {
        this.resets = resets;
    }

    public long getRunt_packets_received() {
        return runt_packets_received;
    }

    public void setRunt_packets_received(long runt_packets_received) {
        this.runt_packets_received = runt_packets_received;
    }

    public long getSeconds_since_last_clear_counters() {
        return seconds_since_last_clear_counters;
    }

    public void setSeconds_since_last_clear_counters(long seconds_since_last_clear_counters) {
        this.seconds_since_last_clear_counters = seconds_since_last_clear_counters;
    }

    public long getSeconds_since_packet_received() {
        return seconds_since_packet_received;
    }

    public void setSeconds_since_packet_received(long seconds_since_packet_received) {
        this.seconds_since_packet_received = seconds_since_packet_received;
    }

    public long getSeconds_since_packet_sent() {
        return seconds_since_packet_sent;
    }

    public void setSeconds_since_packet_sent(long seconds_since_packet_sent) {
        this.seconds_since_packet_sent = seconds_since_packet_sent;
    }

    public long getThrottled_packets_received() {
        return throttled_packets_received;
    }

    public void setThrottled_packets_received(long throttled_packets_received) {
        this.throttled_packets_received = throttled_packets_received;
    }

    public long getUnknown_protocol_packets_received() {
        return unknown_protocol_packets_received;
    }

    public void setUnknown_protocol_packets_received(long unknown_protocol_packets_received) {
        this.unknown_protocol_packets_received = unknown_protocol_packets_received;
    }

    @Override
    public String toString() {
        return header + "," +source+ "," +node_id_str+ "," +subscription_id_str+ "," +encoding_path+ "," + collection_id+ "," + collection_start_time+ "," + msg_timestamp+ ","
                + collection_end_time+ "," +row_timestamp+ "," +interface_name+ "," + applique + "," + availability_flag+ "," + broadcast_packets_received+ ","
                + broadcast_packets_sent+ "," + bytes_received+ "," + bytes_sent+ "," + carrier_transitions+ "," + crc_errors+ "," + framing_errors_received+ ","
                + giant_packets_received+ "," + input_aborts+ "," + input_drops+ "," + input_errors+ "," + input_ignored_packets+ "," + input_overruns+ "," + input_queue_drops
                + "," + last_data_time+ "," + last_discontinuity_time+ "," + multicast_packets_received+ "," + multicast_packets_sent+ "," + output_buffer_failures+ ","
                + output_buffers_swapped_out+ "," + output_drops+ "," + output_errors+ "," + output_queue_drops+ "," + output_underruns+ "," + packets_received+ "," + packets_sent
                + "," + parity_packets_received+ "," + resets+ "," + runt_packets_received+ "," + seconds_since_last_clear_counters+ "," + seconds_since_packet_received+ ","
                + seconds_since_packet_sent+ "," + throttled_packets_received+ "," + unknown_protocol_packets_received;
    }
}
