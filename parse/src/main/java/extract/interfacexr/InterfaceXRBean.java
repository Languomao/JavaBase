package extract.interfacexr;

/**
 * Classname InterfaceXRBean
 * Description TODO
 * Date 2020/7/28 16:30
 * Created by LanKorment
 */
public class InterfaceXRBean {
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
    public String arp_is_learning_disabled;
    public int arp_timeout;
    public String arp_type_name;
    public int bandwidth;
    public String burned_in_address;
    public int carrier_delay_down;
    public int carrier_delay_up;
    //public int bandwidth;
    public int input_data_rate;
    public int input_load;
    public int input_packet_rate;
    public int load_interval;
    public int output_data_rate;
    public int output_load;
    public int output_packet_rate;
    public int peak_input_data_rate;
    public int peak_input_packet_rate;
    public int peak_output_data_rate;
    public int peak_output_packet_rate;
    public int reliability;
    public String description;
    public String duplexity;
    public String encapsulation;
    public String encapsulation_type_string;
    public String fast_shutdown;
    public String hardware_type_string;
    public int if_index;
    public String in_flow_control;
    public String interface_handle;
    public long applique;
    public long availability_flag;
    public long broadcast_packets_received;
    public long broadcast_packets_sent;
    public double bytes_received;
    public double bytes_sent;
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
    public String stats_type;
    public String interface_type;
    public String ip_address;
    public long subnet_mask_length;
    public String is_dampening_enabled;
    public String is_l2_looped;
    public String is_l2_transport_enabled;
    public long last_state_transition_time;
    public String line_state;
    public String link_type;
    public String mac_address;
    public int max_bandwidth;
    public String media_type;
    public int mtu;
    public String out_flow_control;
    public String parent_interface_name;
    public int speed;
    public String state;
    public int state_transition_count;

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

    public void setRow_timestamp(Long row_timestamp) {
        this.row_timestamp = row_timestamp;
    }

    public String getInterface_name() {
        return interface_name;
    }

    public void setInterface_name(String interface_name) {
        this.interface_name = interface_name;
    }

    public String getArp_is_learning_disabled() {
        return arp_is_learning_disabled;
    }

    public void setArp_is_learning_disabled(String arp_is_learning_disabled) {
        this.arp_is_learning_disabled = arp_is_learning_disabled;
    }

    public int getArp_timeout() {
        return arp_timeout;
    }

    public void setArp_timeout(int arp_timeout) {
        this.arp_timeout = arp_timeout;
    }

    public String getArp_type_name() {
        return arp_type_name;
    }

    public void setArp_type_name(String arp_type_name) {
        this.arp_type_name = arp_type_name;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getBurned_in_address() {
        return burned_in_address;
    }

    public void setBurned_in_address(String burned_in_address) {
        this.burned_in_address = burned_in_address;
    }

    public int getCarrier_delay_down() {
        return carrier_delay_down;
    }

    public void setCarrier_delay_down(int carrier_delay_down) {
        this.carrier_delay_down = carrier_delay_down;
    }

    public int getCarrier_delay_up() {
        return carrier_delay_up;
    }

    public void setCarrier_delay_up(int carrier_delay_up) {
        this.carrier_delay_up = carrier_delay_up;
    }

    public int getInput_data_rate() {
        return input_data_rate;
    }

    public void setInput_data_rate(int input_data_rate) {
        this.input_data_rate = input_data_rate;
    }

    public int getInput_load() {
        return input_load;
    }

    public void setInput_load(int input_load) {
        this.input_load = input_load;
    }

    public int getInput_packet_rate() {
        return input_packet_rate;
    }

    public void setInput_packet_rate(int input_packet_rate) {
        this.input_packet_rate = input_packet_rate;
    }

    public int getLoad_interval() {
        return load_interval;
    }

    public void setLoad_interval(int load_interval) {
        this.load_interval = load_interval;
    }

    public int getOutput_data_rate() {
        return output_data_rate;
    }

    public void setOutput_data_rate(int output_data_rate) {
        this.output_data_rate = output_data_rate;
    }

    public int getOutput_load() {
        return output_load;
    }

    public void setOutput_load(int output_load) {
        this.output_load = output_load;
    }

    public int getOutput_packet_rate() {
        return output_packet_rate;
    }

    public void setOutput_packet_rate(int output_packet_rate) {
        this.output_packet_rate = output_packet_rate;
    }

    public int getPeak_input_data_rate() {
        return peak_input_data_rate;
    }

    public void setPeak_input_data_rate(int peak_input_data_rate) {
        this.peak_input_data_rate = peak_input_data_rate;
    }

    public int getPeak_input_packet_rate() {
        return peak_input_packet_rate;
    }

    public void setPeak_input_packet_rate(int peak_input_packet_rate) {
        this.peak_input_packet_rate = peak_input_packet_rate;
    }

    public int getPeak_output_data_rate() {
        return peak_output_data_rate;
    }

    public void setPeak_output_data_rate(int peak_output_data_rate) {
        this.peak_output_data_rate = peak_output_data_rate;
    }

    public int getPeak_output_packet_rate() {
        return peak_output_packet_rate;
    }

    public void setPeak_output_packet_rate(int peak_output_packet_rate) {
        this.peak_output_packet_rate = peak_output_packet_rate;
    }

    public int getReliability() {
        return reliability;
    }

    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuplexity() {
        return duplexity;
    }

    public void setDuplexity(String duplexity) {
        this.duplexity = duplexity;
    }

    public String getEncapsulation() {
        return encapsulation;
    }

    public void setEncapsulation(String encapsulation) {
        this.encapsulation = encapsulation;
    }

    public String getEncapsulation_type_string() {
        return encapsulation_type_string;
    }

    public void setEncapsulation_type_string(String encapsulation_type_string) {
        this.encapsulation_type_string = encapsulation_type_string;
    }

    public String getFast_shutdown() {
        return fast_shutdown;
    }

    public void setFast_shutdown(String fast_shutdown) {
        this.fast_shutdown = fast_shutdown;
    }

    public String getHardware_type_string() {
        return hardware_type_string;
    }

    public void setHardware_type_string(String hardware_type_string) {
        this.hardware_type_string = hardware_type_string;
    }

    public int getIf_index() {
        return if_index;
    }

    public void setIf_index(int if_index) {
        this.if_index = if_index;
    }

    public String getIn_flow_control() {
        return in_flow_control;
    }

    public void setIn_flow_control(String in_flow_control) {
        this.in_flow_control = in_flow_control;
    }

    public String getInterface_handle() {
        return interface_handle;
    }

    public void setInterface_handle(String interface_handle) {
        this.interface_handle = interface_handle;
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

    public double getBytes_received() {
        return bytes_received;
    }

    public void setBytes_received(double bytes_received) {
        this.bytes_received = bytes_received;
    }

    public double getBytes_sent() {
        return bytes_sent;
    }

    public void setBytes_sent(double bytes_sent) {
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

    public String getStats_type() {
        return stats_type;
    }

    public void setStats_type(String stats_type) {
        this.stats_type = stats_type;
    }

    public String getInterface_type() {
        return interface_type;
    }

    public void setInterface_type(String interface_type) {
        this.interface_type = interface_type;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public long getSubnet_mask_length() {
        return subnet_mask_length;
    }

    public void setSubnet_mask_length(long subnet_mask_length) {
        this.subnet_mask_length = subnet_mask_length;
    }

    public String getIs_dampening_enabled() {
        return is_dampening_enabled;
    }

    public void setIs_dampening_enabled(String is_dampening_enabled) {
        this.is_dampening_enabled = is_dampening_enabled;
    }

    public String getIs_l2_looped() {
        return is_l2_looped;
    }

    public void setIs_l2_looped(String is_l2_looped) {
        this.is_l2_looped = is_l2_looped;
    }

    public String getIs_l2_transport_enabled() {
        return is_l2_transport_enabled;
    }

    public void setIs_l2_transport_enabled(String is_l2_transport_enabled) {
        this.is_l2_transport_enabled = is_l2_transport_enabled;
    }

    public long getLast_state_transition_time() {
        return last_state_transition_time;
    }

    public void setLast_state_transition_time(long last_state_transition_time) {
        this.last_state_transition_time = last_state_transition_time;
    }

    public String getLine_state() {
        return line_state;
    }

    public void setLine_state(String line_state) {
        this.line_state = line_state;
    }

    public String getLink_type() {
        return link_type;
    }

    public void setLink_type(String link_type) {
        this.link_type = link_type;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public int getMax_bandwidth() {
        return max_bandwidth;
    }

    public void setMax_bandwidth(int max_bandwidth) {
        this.max_bandwidth = max_bandwidth;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public int getMtu() {
        return mtu;
    }

    public void setMtu(int mtu) {
        this.mtu = mtu;
    }

    public String getOut_flow_control() {
        return out_flow_control;
    }

    public void setOut_flow_control(String out_flow_control) {
        this.out_flow_control = out_flow_control;
    }

    public String getParent_interface_name() {
        return parent_interface_name;
    }

    public void setParent_interface_name(String parent_interface_name) {
        this.parent_interface_name = parent_interface_name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getState_transition_count() {
        return state_transition_count;
    }

    public void setState_transition_count(int state_transition_count) {
        this.state_transition_count = state_transition_count;
    }

    @Override
    public String toString() {
        return header + "," +source+ "," +node_id_str+ "," +subscription_id_str+ "," +encoding_path+ "," + collection_id+ "," + collection_start_time+ "," + msg_timestamp+ ","
                + collection_end_time+ "," +row_timestamp+ "," +interface_name+ "," +arp_is_learning_disabled+ "," + arp_timeout+ "," +arp_type_name+ "," +bandwidth+ ","
                +burned_in_address+ "," + carrier_delay_down+ "," + carrier_delay_up+ "," + input_data_rate+ "," + input_load+ "," + input_packet_rate+ "," + load_interval+ ","
                + output_data_rate+ "," + output_load+ "," + output_packet_rate+ "," + peak_input_data_rate+ "," + peak_input_packet_rate+ "," + peak_output_data_rate+ ","
                + peak_output_packet_rate+ "," + reliability+ "," +description+ "," +duplexity+ "," +encapsulation+ "," +encapsulation_type_string+ "," +fast_shutdown+ ","
                +hardware_type_string+ "," + if_index+ "," +in_flow_control+ "," +interface_handle+ "," + applique+ "," + availability_flag+ "," + broadcast_packets_received+ ","
                + broadcast_packets_sent+ "," + bytes_received+ "," + bytes_sent+ "," + carrier_transitions+ "," + crc_errors+ "," + framing_errors_received+ ","
                + giant_packets_received+ "," + input_aborts+ "," + input_drops+ "," + input_errors+ "," + input_ignored_packets+ "," + input_overruns+ "," + input_queue_drops
                + "," + last_data_time+ "," + last_discontinuity_time+ "," + multicast_packets_received+ "," + multicast_packets_sent+ "," + output_buffer_failures+ ","
                + output_buffers_swapped_out+ "," + output_drops+ "," + output_errors+ "," + output_queue_drops+ "," + output_underruns+ "," + packets_received+ "," + packets_sent
                + "," + parity_packets_received+ "," + resets+ "," + runt_packets_received+ "," + seconds_since_last_clear_counters+ "," + seconds_since_packet_received+ ","
                + seconds_since_packet_sent+ "," + throttled_packets_received+ "," + unknown_protocol_packets_received+ "," +stats_type+ "," +interface_type+ "," +ip_address+ ","
                + subnet_mask_length+ "," +is_dampening_enabled+ "," +is_l2_looped+ "," +is_l2_transport_enabled+ "," + last_state_transition_time+ "," +line_state+ ","
                +link_type+ "," +mac_address+ "," + max_bandwidth+ "," +media_type+ "," + mtu+ "," +out_flow_control+ "," +parent_interface_name+ "," +speed+ "," +state+ ","
                + state_transition_count;
    }
}
