package telemetryparse.topologybeans;

import telemetryparse.TelemetryObject;

import java.util.List;

/**
 * Classname TopologyObject
 * Date 2020/6/15 15:10
 * Created by LanKorment
 */
public class DataModel {
    public String header;
    public String source;
    public TelemetryObject telemetry;
    public List<telemetryparse.topologybeans.RowsObject> row;

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

    public TelemetryObject getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(TelemetryObject telemetry) {
        this.telemetry = telemetry;
    }

    public List<telemetryparse.topologybeans.RowsObject> getRow() {
        return row;
    }

    public void setRow(List<RowsObject> row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Topology[header = "+ header + ",Source = " + source + ",Telemetry = " + telemetry + ",Rows = " + row + "]";
        /*return header + "," + source + "," + telemetry.node_id_str + "," + telemetry.subscription_id_str + ","+ telemetry.encoding_path + ","
                + "," + row.get(0).row_timestamp+ "," + row.get(0).keys+ ","
                + telemetry.collection_id + ","+ telemetry.collection_start_time + ","+ telemetry.msg_timestamp + ","+ telemetry.collection_end_time
                + "," + row.get(0).content.adjacency_sids+ "," + row.get(0).content.links+ "," + row.get(0).content.nodes
                + "," + row.get(0).content.prefix_sids+ "," + row.get(0).content.prefixes;*/
    }
}
