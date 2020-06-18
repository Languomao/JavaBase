package telemetryparse.cpubeans;

import java.util.List;

/**
 * Classname ContentObject
 * Date 2020/6/16 17:45
 * Created by LanKorment
 */
public class ContentObject {
    public List<ProcessCPU> processCPU;

    public List<ProcessCPU> getProcessCPU() {
        return processCPU;
    }

    public void setProcessCPU(List<ProcessCPU> processCPU) {
        this.processCPU = processCPU;
    }

    @Override
    public String toString() {
        return "Content[process-cpu_PIPELINE_EDIT = " + processCPU + "]";
    }
}
