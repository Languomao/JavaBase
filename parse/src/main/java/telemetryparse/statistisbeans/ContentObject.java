package telemetryparse.statistisbeans;

import java.math.BigDecimal;

/**
 * Classname ContentObject
 * Date 2020/6/15 16:28
 * Created by LanKorment
 */
public class ContentObject {
    public long aborted_packet_drops;
    public long buffer_underrun_packet_drops;
    public long dropped_ether_stats_fragments;
    public long dropped_ether_stats_undersize_pkts;
    public long dropped_giant_packets_greaterthan_mru;
    public long dropped_jabbers_packets_greaterthan_mru;
    public long dropped_miscellaneous_error_packets;
    public long dropped_packets_with_crc_align_errors;
    public long ether_stats_collisions;
    public long invalid_dest_mac_drop_packets;
    public long invalid_encap_drop_packets;
    public long miscellaneous_output_errors;
    public long number_of_aborted_packets_dropped;
    public long number_of_buffer_overrun_packets_dropped;
    public long number_of_miscellaneous_packets_dropped;
    public long numberof_invalid_vlan_id_packets_dropped;
    public long received_broadcast_frames;
    public BigDecimal received_good_bytes;
    public long received_good_frames;
    public long received_multicast_frames;
    public long received_pause_frames;
    public BigDecimal received_total_bytes;
    public long received_total_frames;
    public long received_total_octet_frames_from1024_to1518;
    public long received_total_octet_frames_from128_to255;
    public long received_total_octet_frames_from1519_to_max;
    public long received_total_octet_frames_from256_to511;
    public long received_total_octet_frames_from512_to1023;
    public long received_total_octet_frames_from65_to127;
    public long received_total64_octet_frames;
    public long received_unicast_frames;
    public long received_unknown_opcodes;
    public long received8021q_frames;
    public long rfc2819_ether_stats_crc_align_errors;
    public long rfc2819_ether_stats_jabbers;
    public long rfc2819_ether_stats_oversized_pkts;
    public long rfc3635dot3_stats_alignment_errors;
    public long symbol_errors;
    public BigDecimal total_bytes_transmitted;
    public long total_frames_transmitted;
    public BigDecimal total_good_bytes_transmitted;
    public long transmitted_broadcast_frames;
    public long transmitted_good_frames;
    public long transmitted_multicast_frames;
    public long transmitted_total_octet_frames_from1024_to1518;
    public long transmitted_total_octet_frames_from128_to255;
    public long transmitted_total_octet_frames_from1518_to_max;
    public long transmitted_total_octet_frames_from256_to511;
    public long transmitted_total_octet_frames_from512_to1023;
    public long transmitted_total_octet_frames_from65_to127;
    public long transmitted_total_pause_frames;
    public long transmitted_total64_octet_frames;
    public long transmitted_unicast_frames;
    public long transmitted8021q_frames;
    public long uncounted_dropped_frames;

    public long getAborted_packet_drops() {
        return aborted_packet_drops;
    }

    public void setAborted_packet_drops(long aborted_packet_drops) {
        this.aborted_packet_drops = aborted_packet_drops;
    }

    public long getBuffer_underrun_packet_drops() {
        return buffer_underrun_packet_drops;
    }

    public void setBuffer_underrun_packet_drops(long buffer_underrun_packet_drops) {
        this.buffer_underrun_packet_drops = buffer_underrun_packet_drops;
    }

    public long getDropped_ether_stats_fragments() {
        return dropped_ether_stats_fragments;
    }

    public void setDropped_ether_stats_fragments(long dropped_ether_stats_fragments) {
        this.dropped_ether_stats_fragments = dropped_ether_stats_fragments;
    }

    public long getDropped_ether_stats_undersize_pkts() {
        return dropped_ether_stats_undersize_pkts;
    }

    public void setDropped_ether_stats_undersize_pkts(long dropped_ether_stats_undersize_pkts) {
        this.dropped_ether_stats_undersize_pkts = dropped_ether_stats_undersize_pkts;
    }

    public long getDropped_giant_packets_greaterthan_mru() {
        return dropped_giant_packets_greaterthan_mru;
    }

    public void setDropped_giant_packets_greaterthan_mru(long dropped_giant_packets_greaterthan_mru) {
        this.dropped_giant_packets_greaterthan_mru = dropped_giant_packets_greaterthan_mru;
    }

    public long getDropped_jabbers_packets_greaterthan_mru() {
        return dropped_jabbers_packets_greaterthan_mru;
    }

    public void setDropped_jabbers_packets_greaterthan_mru(long dropped_jabbers_packets_greaterthan_mru) {
        this.dropped_jabbers_packets_greaterthan_mru = dropped_jabbers_packets_greaterthan_mru;
    }

    public long getDropped_miscellaneous_error_packets() {
        return dropped_miscellaneous_error_packets;
    }

    public void setDropped_miscellaneous_error_packets(long dropped_miscellaneous_error_packets) {
        this.dropped_miscellaneous_error_packets = dropped_miscellaneous_error_packets;
    }

    public long getDropped_packets_with_crc_align_errors() {
        return dropped_packets_with_crc_align_errors;
    }

    public void setDropped_packets_with_crc_align_errors(long dropped_packets_with_crc_align_errors) {
        this.dropped_packets_with_crc_align_errors = dropped_packets_with_crc_align_errors;
    }

    public long getEther_stats_collisions() {
        return ether_stats_collisions;
    }

    public void setEther_stats_collisions(long ether_stats_collisions) {
        this.ether_stats_collisions = ether_stats_collisions;
    }

    public long getInvalid_dest_mac_drop_packets() {
        return invalid_dest_mac_drop_packets;
    }

    public void setInvalid_dest_mac_drop_packets(long invalid_dest_mac_drop_packets) {
        this.invalid_dest_mac_drop_packets = invalid_dest_mac_drop_packets;
    }

    public long getInvalid_encap_drop_packets() {
        return invalid_encap_drop_packets;
    }

    public void setInvalid_encap_drop_packets(long invalid_encap_drop_packets) {
        this.invalid_encap_drop_packets = invalid_encap_drop_packets;
    }

    public long getMiscellaneous_output_errors() {
        return miscellaneous_output_errors;
    }

    public void setMiscellaneous_output_errors(long miscellaneous_output_errors) {
        this.miscellaneous_output_errors = miscellaneous_output_errors;
    }

    public long getNumber_of_aborted_packets_dropped() {
        return number_of_aborted_packets_dropped;
    }

    public void setNumber_of_aborted_packets_dropped(long number_of_aborted_packets_dropped) {
        this.number_of_aborted_packets_dropped = number_of_aborted_packets_dropped;
    }

    public long getNumber_of_buffer_overrun_packets_dropped() {
        return number_of_buffer_overrun_packets_dropped;
    }

    public void setNumber_of_buffer_overrun_packets_dropped(long number_of_buffer_overrun_packets_dropped) {
        this.number_of_buffer_overrun_packets_dropped = number_of_buffer_overrun_packets_dropped;
    }

    public long getNumber_of_miscellaneous_packets_dropped() {
        return number_of_miscellaneous_packets_dropped;
    }

    public void setNumber_of_miscellaneous_packets_dropped(long number_of_miscellaneous_packets_dropped) {
        this.number_of_miscellaneous_packets_dropped = number_of_miscellaneous_packets_dropped;
    }

    public long getNumberof_invalid_vlan_id_packets_dropped() {
        return numberof_invalid_vlan_id_packets_dropped;
    }

    public void setNumberof_invalid_vlan_id_packets_dropped(long numberof_invalid_vlan_id_packets_dropped) {
        this.numberof_invalid_vlan_id_packets_dropped = numberof_invalid_vlan_id_packets_dropped;
    }

    public long getReceived_broadcast_frames() {
        return received_broadcast_frames;
    }

    public void setReceived_broadcast_frames(long received_broadcast_frames) {
        this.received_broadcast_frames = received_broadcast_frames;
    }

    public BigDecimal getReceived_good_bytes() {
        return received_good_bytes;
    }

    public void setReceived_good_bytes(BigDecimal received_good_bytes) {
        this.received_good_bytes = received_good_bytes;
    }

    public long getReceived_good_frames() {
        return received_good_frames;
    }

    public void setReceived_good_frames(long received_good_frames) {
        this.received_good_frames = received_good_frames;
    }

    public long getReceived_multicast_frames() {
        return received_multicast_frames;
    }

    public void setReceived_multicast_frames(long received_multicast_frames) {
        this.received_multicast_frames = received_multicast_frames;
    }

    public long getReceived_pause_frames() {
        return received_pause_frames;
    }

    public void setReceived_pause_frames(long received_pause_frames) {
        this.received_pause_frames = received_pause_frames;
    }

    public BigDecimal getReceived_total_bytes() {
        return received_total_bytes;
    }

    public void setReceived_total_bytes(BigDecimal received_total_bytes) {
        this.received_total_bytes = received_total_bytes;
    }

    public long getReceived_total_frames() {
        return received_total_frames;
    }

    public void setReceived_total_frames(long received_total_frames) {
        this.received_total_frames = received_total_frames;
    }

    public long getReceived_total_octet_frames_from1024_to1518() {
        return received_total_octet_frames_from1024_to1518;
    }

    public void setReceived_total_octet_frames_from1024_to1518(long received_total_octet_frames_from1024_to1518) {
        this.received_total_octet_frames_from1024_to1518 = received_total_octet_frames_from1024_to1518;
    }

    public long getReceived_total_octet_frames_from128_to255() {
        return received_total_octet_frames_from128_to255;
    }

    public void setReceived_total_octet_frames_from128_to255(long received_total_octet_frames_from128_to255) {
        this.received_total_octet_frames_from128_to255 = received_total_octet_frames_from128_to255;
    }

    public long getReceived_total_octet_frames_from1519_to_max() {
        return received_total_octet_frames_from1519_to_max;
    }

    public void setReceived_total_octet_frames_from1519_to_max(long received_total_octet_frames_from1519_to_max) {
        this.received_total_octet_frames_from1519_to_max = received_total_octet_frames_from1519_to_max;
    }

    public long getReceived_total_octet_frames_from256_to511() {
        return received_total_octet_frames_from256_to511;
    }

    public void setReceived_total_octet_frames_from256_to511(long received_total_octet_frames_from256_to511) {
        this.received_total_octet_frames_from256_to511 = received_total_octet_frames_from256_to511;
    }

    public long getReceived_total_octet_frames_from512_to1023() {
        return received_total_octet_frames_from512_to1023;
    }

    public void setReceived_total_octet_frames_from512_to1023(long received_total_octet_frames_from512_to1023) {
        this.received_total_octet_frames_from512_to1023 = received_total_octet_frames_from512_to1023;
    }

    public long getReceived_total_octet_frames_from65_to127() {
        return received_total_octet_frames_from65_to127;
    }

    public void setReceived_total_octet_frames_from65_to127(long received_total_octet_frames_from65_to127) {
        this.received_total_octet_frames_from65_to127 = received_total_octet_frames_from65_to127;
    }

    public long getReceived_total64_octet_frames() {
        return received_total64_octet_frames;
    }

    public void setReceived_total64_octet_frames(long received_total64_octet_frames) {
        this.received_total64_octet_frames = received_total64_octet_frames;
    }

    public long getReceived_unicast_frames() {
        return received_unicast_frames;
    }

    public void setReceived_unicast_frames(long received_unicast_frames) {
        this.received_unicast_frames = received_unicast_frames;
    }

    public long getReceived_unknown_opcodes() {
        return received_unknown_opcodes;
    }

    public void setReceived_unknown_opcodes(long received_unknown_opcodes) {
        this.received_unknown_opcodes = received_unknown_opcodes;
    }

    public long getReceived8021q_frames() {
        return received8021q_frames;
    }

    public void setReceived8021q_frames(long received8021q_frames) {
        this.received8021q_frames = received8021q_frames;
    }

    public long getRfc2819_ether_stats_crc_align_errors() {
        return rfc2819_ether_stats_crc_align_errors;
    }

    public void setRfc2819_ether_stats_crc_align_errors(long rfc2819_ether_stats_crc_align_errors) {
        this.rfc2819_ether_stats_crc_align_errors = rfc2819_ether_stats_crc_align_errors;
    }

    public long getRfc2819_ether_stats_jabbers() {
        return rfc2819_ether_stats_jabbers;
    }

    public void setRfc2819_ether_stats_jabbers(long rfc2819_ether_stats_jabbers) {
        this.rfc2819_ether_stats_jabbers = rfc2819_ether_stats_jabbers;
    }

    public long getRfc2819_ether_stats_oversized_pkts() {
        return rfc2819_ether_stats_oversized_pkts;
    }

    public void setRfc2819_ether_stats_oversized_pkts(long rfc2819_ether_stats_oversized_pkts) {
        this.rfc2819_ether_stats_oversized_pkts = rfc2819_ether_stats_oversized_pkts;
    }

    public long getRfc3635dot3_stats_alignment_errors() {
        return rfc3635dot3_stats_alignment_errors;
    }

    public void setRfc3635dot3_stats_alignment_errors(long rfc3635dot3_stats_alignment_errors) {
        this.rfc3635dot3_stats_alignment_errors = rfc3635dot3_stats_alignment_errors;
    }

    public long getSymbol_errors() {
        return symbol_errors;
    }

    public void setSymbol_errors(long symbol_errors) {
        this.symbol_errors = symbol_errors;
    }

    public BigDecimal getTotal_bytes_transmitted() {
        return total_bytes_transmitted;
    }

    public void setTotal_bytes_transmitted(BigDecimal total_bytes_transmitted) {
        this.total_bytes_transmitted = total_bytes_transmitted;
    }

    public long getTotal_frames_transmitted() {
        return total_frames_transmitted;
    }

    public void setTotal_frames_transmitted(long total_frames_transmitted) {
        this.total_frames_transmitted = total_frames_transmitted;
    }

    public BigDecimal getTotal_good_bytes_transmitted() {
        return total_good_bytes_transmitted;
    }

    public void setTotal_good_bytes_transmitted(BigDecimal total_good_bytes_transmitted) {
        this.total_good_bytes_transmitted = total_good_bytes_transmitted;
    }

    public long getTransmitted_broadcast_frames() {
        return transmitted_broadcast_frames;
    }

    public void setTransmitted_broadcast_frames(long transmitted_broadcast_frames) {
        this.transmitted_broadcast_frames = transmitted_broadcast_frames;
    }

    public long getTransmitted_good_frames() {
        return transmitted_good_frames;
    }

    public void setTransmitted_good_frames(long transmitted_good_frames) {
        this.transmitted_good_frames = transmitted_good_frames;
    }

    public long getTransmitted_multicast_frames() {
        return transmitted_multicast_frames;
    }

    public void setTransmitted_multicast_frames(long transmitted_multicast_frames) {
        this.transmitted_multicast_frames = transmitted_multicast_frames;
    }

    public long getTransmitted_total_octet_frames_from1024_to1518() {
        return transmitted_total_octet_frames_from1024_to1518;
    }

    public void setTransmitted_total_octet_frames_from1024_to1518(long transmitted_total_octet_frames_from1024_to1518) {
        this.transmitted_total_octet_frames_from1024_to1518 = transmitted_total_octet_frames_from1024_to1518;
    }

    public long getTransmitted_total_octet_frames_from128_to255() {
        return transmitted_total_octet_frames_from128_to255;
    }

    public void setTransmitted_total_octet_frames_from128_to255(long transmitted_total_octet_frames_from128_to255) {
        this.transmitted_total_octet_frames_from128_to255 = transmitted_total_octet_frames_from128_to255;
    }

    public long getTransmitted_total_octet_frames_from1518_to_max() {
        return transmitted_total_octet_frames_from1518_to_max;
    }

    public void setTransmitted_total_octet_frames_from1518_to_max(long transmitted_total_octet_frames_from1518_to_max) {
        this.transmitted_total_octet_frames_from1518_to_max = transmitted_total_octet_frames_from1518_to_max;
    }

    public long getTransmitted_total_octet_frames_from256_to511() {
        return transmitted_total_octet_frames_from256_to511;
    }

    public void setTransmitted_total_octet_frames_from256_to511(long transmitted_total_octet_frames_from256_to511) {
        this.transmitted_total_octet_frames_from256_to511 = transmitted_total_octet_frames_from256_to511;
    }

    public long getTransmitted_total_octet_frames_from512_to1023() {
        return transmitted_total_octet_frames_from512_to1023;
    }

    public void setTransmitted_total_octet_frames_from512_to1023(long transmitted_total_octet_frames_from512_to1023) {
        this.transmitted_total_octet_frames_from512_to1023 = transmitted_total_octet_frames_from512_to1023;
    }

    public long getTransmitted_total_octet_frames_from65_to127() {
        return transmitted_total_octet_frames_from65_to127;
    }

    public void setTransmitted_total_octet_frames_from65_to127(long transmitted_total_octet_frames_from65_to127) {
        this.transmitted_total_octet_frames_from65_to127 = transmitted_total_octet_frames_from65_to127;
    }

    public long getTransmitted_total_pause_frames() {
        return transmitted_total_pause_frames;
    }

    public void setTransmitted_total_pause_frames(long transmitted_total_pause_frames) {
        this.transmitted_total_pause_frames = transmitted_total_pause_frames;
    }

    public long getTransmitted_total64_octet_frames() {
        return transmitted_total64_octet_frames;
    }

    public void setTransmitted_total64_octet_frames(long transmitted_total64_octet_frames) {
        this.transmitted_total64_octet_frames = transmitted_total64_octet_frames;
    }

    public long getTransmitted_unicast_frames() {
        return transmitted_unicast_frames;
    }

    public void setTransmitted_unicast_frames(long transmitted_unicast_frames) {
        this.transmitted_unicast_frames = transmitted_unicast_frames;
    }

    public long getTransmitted8021q_frames() {
        return transmitted8021q_frames;
    }

    public void setTransmitted8021q_frames(long transmitted8021q_frames) {
        this.transmitted8021q_frames = transmitted8021q_frames;
    }

    public long getUncounted_dropped_frames() {
        return uncounted_dropped_frames;
    }

    public void setUncounted_dropped_frames(long uncounted_dropped_frames) {
        this.uncounted_dropped_frames = uncounted_dropped_frames;
    }

    public String toString() {
        return "Content[aborted-packet-drops = " + aborted_packet_drops + ",buffer-underrun-packet-drops = " + buffer_underrun_packet_drops + ",dropped-ether-stats-fragments = "
                + dropped_ether_stats_fragments + ",dropped-ether-stats-undersize-pkts = " + dropped_ether_stats_undersize_pkts + ",dropped-giant-packets-greaterthan-mru = "
                + dropped_giant_packets_greaterthan_mru + ",dropped-jabbers-packets-greaterthan-mru = " + dropped_jabbers_packets_greaterthan_mru + ",dropped-miscellaneous-error-packets = "
                + dropped_miscellaneous_error_packets + ",dropped-packets-with-crc-align-errors = " + dropped_packets_with_crc_align_errors + ",ether-stats-collisions = " + ether_stats_collisions
                + ",invalid-dest-mac-drop-packets = " + invalid_dest_mac_drop_packets + ",invalid-encap-drop-packets = " + invalid_encap_drop_packets + ",miscellaneous-output-errors = "
                + miscellaneous_output_errors + ",number-of-aborted-packets-dropped = " + number_of_aborted_packets_dropped + ",number-of-buffer-overrun-packets-dropped = "
                + number_of_buffer_overrun_packets_dropped + ",number-of-miscellaneous-packets-dropped = " + number_of_miscellaneous_packets_dropped + ",numberof-invalid-vlan-id-packets-dropped = "
                + numberof_invalid_vlan_id_packets_dropped + ",received-broadcast-frames = " + received_broadcast_frames + ",received-good-bytes = " + received_good_bytes
                + ",received-good-frames = " + received_good_frames + ",received-multicast-frames = " + received_multicast_frames + ",received-pause-frames = " + received_pause_frames
                + ",received-total-bytes = " + received_total_bytes + ",received-total-frames = " + received_total_frames + ",received-total-octet-frames-from1024-to1518 = "
                + received_total_octet_frames_from1024_to1518 + ",received-total-octet-frames-from128-to255 = " + received_total_octet_frames_from128_to255
                + ",received-total-octet-frames-from1519-to-max = " + received_total_octet_frames_from1519_to_max + ",received-total-octet-frames-from256-to511 = "
                + received_total_octet_frames_from256_to511 + ",received-total-octet-frames-from512-to1023 = " + received_total_octet_frames_from512_to1023
                + ",received-total-octet-frames-from65-to127 = " + received_total_octet_frames_from65_to127 + ",received-total64-octet-frames = " + received_total64_octet_frames
                + ",received-unicast-frames = " + received_unicast_frames + ",received-unknown-opcodes = " + received_unknown_opcodes + ",received8021q-frames + " + received8021q_frames
                + ",rfc2819-ether-stats-crc-align-errors = " + rfc2819_ether_stats_crc_align_errors + ",rfc2819-ether-stats-jabbers = " + rfc2819_ether_stats_jabbers
                + ",rfc2819-ether-stats-oversized-pkts = " + rfc2819_ether_stats_oversized_pkts + ",rfc3635dot3-stats-alignment-errors = " + rfc3635dot3_stats_alignment_errors
                + ",symbol-errors = " + symbol_errors + ",total-bytes-transmitted = " + total_bytes_transmitted + ",total-frames-transmitted = " + total_frames_transmitted
                + ",total-good-bytes-transmitted = " + total_good_bytes_transmitted + ",transmitted-broadcast-frames = " + transmitted_broadcast_frames + ",transmitted-good-frames = "
                + transmitted_good_frames + ",transmitted-multicast-frames = " + transmitted_multicast_frames + ",transmitted-total-octet-frames-from1024-to1518 = " + transmitted_total_octet_frames_from1024_to1518
                + ",transmitted-total-octet-frames-from128-to255 = " + transmitted_total_octet_frames_from128_to255 + ",transmitted-total-octet-frames-from1518-to-max = " + transmitted_total_octet_frames_from1518_to_max
                + ",transmitted-total-octet-frames-from256-to511 = " + transmitted_total_octet_frames_from256_to511 + ",transmitted-total-octet-frames-from512-to1023 = " + transmitted_total_octet_frames_from512_to1023
                + ",transmitted-total-octet-frames-from65-to127 = " + transmitted_total_octet_frames_from65_to127 + ",transmitted-total-pause-frames = " + transmitted_total_pause_frames
                + ",transmitted-total64-octet-frames = " + transmitted_total64_octet_frames + ",transmitted-unicast-frames = " + transmitted_unicast_frames
                + ",transmitted8021q-frames = " + transmitted8021q_frames + ",uncounted-dropped-frames = " + uncounted_dropped_frames;
    }
}
