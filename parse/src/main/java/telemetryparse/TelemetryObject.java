package telemetryparse;

/**
 * Classname TelemetryObject
 * Date 2020/6/15 15:11
 * Created by LanKorment
 */
public class TelemetryObject {
    public String node_id_str;
    public String subscription_id_str;
    public String encoding_path;
    public int collection_id;
    public long collection_start_time;
    public long msg_timestamp;
    public long collection_end_time;

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

    @Override
    public String toString() {
        return "Telemetry[node_id_str = " + node_id_str + ",subscription_id_str = " + subscription_id_str + ",encoding_path = " + encoding_path + ",collection_id = " + collection_id
                + ",collection_start_time = " + collection_start_time + ",msg_timestamp = " + msg_timestamp + ",collection_end_time = " + collection_end_time + "]";
    }
}
