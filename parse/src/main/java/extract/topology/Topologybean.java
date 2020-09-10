package extract.topology;

/**
 * Classname Topologybean
 * Description TODO
 * Date 2020/7/28 11:30
 * Created by LanKorment
 */

public class Topologybean {
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
    public String keys;
    public int adjacency_sids;
    public int links;
    public int nodes;
    public int prefix_sids;
    public int prefixes;

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

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public int getAdjacency_sids() {
        return adjacency_sids;
    }

    public void setAdjacency_sids(int adjacency_sids) {
        this.adjacency_sids = adjacency_sids;
    }

    public int getLinks() {
        return links;
    }

    public void setLinks(int links) {
        this.links = links;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public int getPrefix_sids() {
        return prefix_sids;
    }

    public void setPrefix_sids(int prefix_sids) {
        this.prefix_sids = prefix_sids;
    }

    public int getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(int prefixes) {
        this.prefixes = prefixes;
    }

    @Override
    public String toString() {
        return  header + "," + source + "," + node_id_str + "," + subscription_id_str + "," + encoding_path + "," + collection_id + "," + collection_start_time + "," + msg_timestamp + "," + source + ","
                + collection_end_time + "," + row_timestamp + "," + keys + "," + adjacency_sids + "," + links + "," + nodes + "," + prefix_sids + "," + prefixes;
    }
}
