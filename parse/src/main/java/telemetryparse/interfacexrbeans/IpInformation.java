package telemetryparse.interfacexrbeans;

/**
 * Classname IpInformation
 * Description TODO
 * Date 2020/6/19 10:46
 * Created by LanKorment
 */
public class IpInformation {
    public String ip_address;
    public long subnet_mask_length;

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public long getSubnet_mask_length() {
        return subnet_mask_length;
    }

    public void setSubnet_mask_length(long subnet_mask_length) {
        this.subnet_mask_length = subnet_mask_length;
    }

    @Override
    public String toString() {
        return "ip-information[ ip-address = " + ip_address + ",subnet-mask-length = " + subnet_mask_length;
    }
}
