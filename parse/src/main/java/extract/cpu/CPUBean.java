package extract.cpu;

/**
 * Classname CPUBean
 * Description TODO
 * Date 2020/7/28 15:32
 * Created by LanKorment
 */
public class CPUBean {

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
    public String node_name;
    public int process_cpu_fifteen_minute;
    public int process_cpu_five_minute;
    public int process_cpu_one_minute;
    public int process_id;
    public String process_name;
    public int total_cpu_fifteen_minute;
    public int total_cpu_five_minute;
    public int total_cpu_one_minute;

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

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public int getProcess_cpu_fifteen_minute() {
        return process_cpu_fifteen_minute;
    }

    public void setProcess_cpu_fifteen_minute(int process_cpu_fifteen_minute) {
        this.process_cpu_fifteen_minute = process_cpu_fifteen_minute;
    }

    public int getProcess_cpu_five_minute() {
        return process_cpu_five_minute;
    }

    public void setProcess_cpu_five_minute(int process_cpu_five_minute) {
        this.process_cpu_five_minute = process_cpu_five_minute;
    }

    public int getProcess_cpu_one_minute() {
        return process_cpu_one_minute;
    }

    public void setProcess_cpu_one_minute(int process_cpu_one_minute) {
        this.process_cpu_one_minute = process_cpu_one_minute;
    }

    public int getProcess_id() {
        return process_id;
    }

    public void setProcess_id(int process_id) {
        this.process_id = process_id;
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    public int getTotal_cpu_fifteen_minute() {
        return total_cpu_fifteen_minute;
    }

    public void setTotal_cpu_fifteen_minute(int total_cpu_fifteen_minute) {
        this.total_cpu_fifteen_minute = total_cpu_fifteen_minute;
    }

    public int getTotal_cpu_five_minute() {
        return total_cpu_five_minute;
    }

    public void setTotal_cpu_five_minute(int total_cpu_five_minute) {
        this.total_cpu_five_minute = total_cpu_five_minute;
    }

    public int getTotal_cpu_one_minute() {
        return total_cpu_one_minute;
    }

    public void setTotal_cpu_one_minute(int total_cpu_one_minute) {
        this.total_cpu_one_minute = total_cpu_one_minute;
    }

    @Override
    public String toString() {
        return  header + "," + source + "," + node_id_str + "," + subscription_id_str + "," + encoding_path + "," + collection_id + "," + collection_start_time + "," + msg_timestamp + ","
                + collection_end_time + "," + row_timestamp + "," + node_name + "," + process_cpu_fifteen_minute + "," + process_cpu_five_minute + ","
                + process_cpu_one_minute + "," + process_id + "," + process_name + "," + total_cpu_fifteen_minute + "," + total_cpu_five_minute + "," + total_cpu_one_minute;
    }
}
