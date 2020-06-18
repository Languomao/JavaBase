package telemetryparse.cpubeans;

/**
 * Classname ProcessCPU
 * Date 2020/6/17 10:15
 * Created by LanKorment
 */
public class ProcessCPU {
    public int process_cpu_fifteen_minute;
    public int process_cpu_five_minute;
    public int process_cpu_one_minute;
    public int process_id;
    public String process_name;

    public int getProcess_cpu_fifteen_minute() {
        return process_cpu_fifteen_minute;
    }

    public void setProcess_cpu_fifteen_minute(int process_cpu_fifteen_minute) {
        this.process_cpu_fifteen_minute = process_cpu_fifteen_minute;
    }

    public int getProcess_cpu_five_minute() {
        return process_cpu_five_minute;
    }

    public void setProcess_cpu_five_minute(int process_cpu_five_minute) {
        this.process_cpu_five_minute = process_cpu_five_minute;
    }

    public int getProcess_cpu_one_minute() {
        return process_cpu_one_minute;
    }

    public void setProcess_cpu_one_minute(int process_cpu_one_minute) {
        this.process_cpu_one_minute = process_cpu_one_minute;
    }

    public int getProcess_id() {
        return process_id;
    }

    public void setProcess_id(int process_id) {
        this.process_id = process_id;
    }

    public String getProcess_name() {
        return process_name;
    }

    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    @Override
    public String toString() {
        return "process-cpu_PIPELINE_EDIT[process_cpu_fifteen_minute = "+ process_cpu_fifteen_minute + ",process_cpu_five_minute = " + process_cpu_five_minute
                + ",process_cpu_one_minute = " + process_cpu_one_minute + ",process_id = " + process_id + ",process_name = " + process_name + "]";
    }
}
