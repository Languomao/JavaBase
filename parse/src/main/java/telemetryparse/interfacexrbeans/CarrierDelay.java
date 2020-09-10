package telemetryparse.interfacexrbeans;

/**
 * Classname CarrierDelay
 * Description TODO
 * Date 2020/6/19 10:43
 * Created by LanKorment
 */
public class CarrierDelay {
    public int carrier_delay_down;
    public int carrier_delay_up;

    public int getCarrier_delay_down() {
        return carrier_delay_down;
    }

    public void setCarrier_delay_down(int carrier_delay_down) {
        this.carrier_delay_down = carrier_delay_down;
    }

    public int getCarrier_delay_up() {
        return carrier_delay_up;
    }

    public void setCarrier_delay_up(int carrier_delay_up) {
        this.carrier_delay_up = carrier_delay_up;
    }

    @Override
    public String toString() {
        return "carrier-delay[carrier-delay-down = " + carrier_delay_down + ",carrier-delay-up = " + carrier_delay_up + "]";
    }
}
