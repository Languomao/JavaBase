package telemetryparse.interfacexrbeans;

/**
 * Classname ARPInformation
 * Date 2020/6/19 10:43
 * Created by LanKorment
 */
public class ARPInformation {
    public String arp_is_learning_disabled;
    public int arp_timeout;
    public String arp_type_name;

    public String getArp_is_learning_disabled() {
        return arp_is_learning_disabled;
    }

    public void setArp_is_learning_disabled(String arp_is_learning_disabled) {
        this.arp_is_learning_disabled = arp_is_learning_disabled;
    }

    public int getArp_timeout() {
        return arp_timeout;
    }

    public void setArp_timeout(int arp_timeout) {
        this.arp_timeout = arp_timeout;
    }

    public String getArp_type_name() {
        return arp_type_name;
    }

    public void setArp_type_name(String arp_type_name) {
        this.arp_type_name = arp_type_name;
    }

    @Override
    public String toString() {
        return "arp-information[arp-is-learning-disabled = " + arp_is_learning_disabled + ",arp-timeout = " + arp_timeout + ",arp-type-name = " + arp_type_name + "]";
    }
}
