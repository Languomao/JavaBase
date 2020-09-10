package telemetryparse.interfacexrbeans;

/**
 * Classname DataRates
 * Description TODO
 * Date 2020/6/19 10:45
 * Created by LanKorment
 */
public class DataRates {
    public int bandwidth;
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

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
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

    @Override
    public String toString() {
        return "data-rates[bandwidth = " + bandwidth + ",input-data-rate = " + input_data_rate + ",input-load = " + input_load + ",input-packet-rate = " + input_packet_rate
                + ",load-interval = " + load_interval + ",output-data-rate = " + output_data_rate + ",output-load = " + output_load + ",output-packet-rate = " + output_packet_rate
                + ",peak-input-data-rate = " + peak_input_data_rate + ",peak-input-packet-rate = " + peak_input_packet_rate + ",peak-output-data-rate = " + peak_output_data_rate
                + ",peak-output-packet-rate = " + peak_output_packet_rate + ",reliability = " + reliability + "]";
    }
}
