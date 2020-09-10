package telemetryparse.interfacexrbeans;

/**
 * Classname BurnedInAddress
 * Description TODO
 * Date 2020/6/19 10:43
 * Created by LanKorment
 */
public class BurnedInAddress {
    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "burned-in-address[address = " + address + "]";
    }
}
