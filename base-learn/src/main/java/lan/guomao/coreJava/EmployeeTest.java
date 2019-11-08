package lan.guomao.coreJava;

import java.util.Arrays;

/**
 * Created by Languomao on 2018/4/16.
 */
public class EmployeeTest {
    public static void main(String[] args){

/*        Manager[] manager = new Manager[2];
        Employee[] staff = manager;


        staff[0] = new Manager("languomao",2000,2017,7,14);
        staff[1] = new Manager("chencaixia",2000,2018,6,1);
        for(Employee e :staff){
            System.out.println("\nname:"+e.getName()+"\nsalsry:"+e.getSalary()+"\nhireDay:"+e.getHireDay());
            e.raiseSalary(5);
            System.out.println("升职后...");
            System.out.println("name:"+e.getName()+"\nsalsry:"+e.getSalary()+"\nhireDay:"+e.getHireDay());


        }*/
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("languomao",3000,2017,7,14);
        staff[1] = new Manager("chencaixia",2500,2018,6,1);
        staff[2] = new Employee("sunshangxiang",3500,2017,5,5);

        staff[1].setSex("women");

        System.out.println(staff[0].sex);

        Arrays.sort(staff);

        for(Employee e : staff){
            System.out.println("\nname:"+ e.getName()+"\nsalary:"+e.getSalary());
        }
    }
}

