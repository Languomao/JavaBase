package lan.guomao.coreJava;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Languomao on 2018/4/16.
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private LocalDate hireDay;
    protected String sex="man";

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSlary(double slary) {
        this.salary = slary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(this==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(name,other.name)&&salary==other.salary&&Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }
}