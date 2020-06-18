package telemetryparse.interfacexrbeans;

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
    public List<RowsObject> row;

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

    public List<RowsObject> getRow() {
        return row;
    }

    public void setRow(List<RowsObject> row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "InterfaceXR[header = "+ header + ",Source = " + source + ",Telemetry = " + telemetry + ",Rows = " + row + "]";
    }
}
