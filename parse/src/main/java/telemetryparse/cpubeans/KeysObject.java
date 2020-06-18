package telemetryparse.cpubeans;

/**
 * Classname KeysObject
 * Date 2020/6/16 9:52
 * Created by LanKorment
 */
public class KeysObject {
    public String node_name;

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    @Override
    public String toString() {
        return "Key[node-name = " + node_name + "]";
    }
}
