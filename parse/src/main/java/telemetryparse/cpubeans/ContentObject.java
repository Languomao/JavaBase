package telemetryparse.cpubeans;

import java.util.List;

/**
 * Classname ContentObject
 * Date 2020/6/16 17:45
 * Created by LanKorment
 */
public class ContentObject {
    public List<ProcessCPU> processCPU;

    public int total_cpu_fifteen_minute;
    public int total_cpu_five_minute;
    public int total_cpu_one_minute;

    public List<ProcessCPU> getProcessCPU() {
        return processCPU;
    }

    public void setProcessCPU(List<ProcessCPU> processCPU) {
        this.processCPU = processCPU;
    }

    public int getTotal_cpu_fifteen_minute() {
        return total_cpu_fifteen_minute;
    }

    public void setTotal_cpu_fifteen_minute(int total_cpu_fifteen_minute) {
        this.total_cpu_fifteen_minute = total_cpu_fifteen_minute;
    }

    public int getTotal_cpu_five_minute() {
        return total_cpu_five_minute;
    }

    public void setTotal_cpu_five_minute(int total_cpu_five_minute) {
        this.total_cpu_five_minute = total_cpu_five_minute;
    }

    public int getTotal_cpu_one_minute() {
        return total_cpu_one_minute;
    }

    public void setTotal_cpu_one_minute(int total_cpu_one_minute) {
        this.total_cpu_one_minute = total_cpu_one_minute;
    }

    @Override
    public String toString() {
        return "Content[process-cpu_PIPELINE_EDIT = " + processCPU + ",total-cpu-fifteen-minute = "+ total_cpu_fifteen_minute + ",total-cpu-five-minute = " + total_cpu_five_minute
                + ",total-cpu-one-minute = " + total_cpu_one_minute + "]";
    }
}
