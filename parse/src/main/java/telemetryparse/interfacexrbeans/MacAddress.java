package telemetryparse.interfacexrbeans;

/**
 * Classname MacAddress
 * Description TODO
 * Date 2020/6/19 10:47
 * Created by LanKorment
 */
public class MacAddress {
    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "mac-address[address = " + address ;
    }
}
