package telemetryparse.interfacexrbeans;

/**
 * Classname InterfaceStatistics
 * Description TODO
 * Date 2020/6/19 10:46
 * Created by LanKorment
 */
public class InterfaceStatistics {
    public FullInterfaceStats fullInterfaceStats;
    public String stats_type;

    public FullInterfaceStats getFullInterfaceStats() {
        return fullInterfaceStats;
    }

    public void setFullInterfaceStats(FullInterfaceStats fullInterfaceStats) {
        this.fullInterfaceStats = fullInterfaceStats;
    }

    public String getStats_type() {
        return stats_type;
    }

    public void setStats_type(String stats_type) {
        this.stats_type = stats_type;
    }

    @Override
    public String toString() {
        return "interface-statistics[full-interface-stats = " + fullInterfaceStats + ",stats-type = " + stats_type + "]";
    }
}
