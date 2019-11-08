package lan.guomao.coreJava;

/**
 * Created by Languomao on 2018/4/16.
 */
public class Manager extends Employee{
    private double bouns;

    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bouns = 0;
    }

    public double getBouns() {
        return super.getSalary()+bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
}
