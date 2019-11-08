package lan.guomao.coreJava;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Languomao on 2018/4/17.
 */
public class ToStringTest {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int[] staff = new int[100];
        ArrayList<Employee>  al = new ArrayList<>();
        al.add(new Employee("languomao",1200,2017,5,5));
        String s = ""+array;
        System.out.println(staff.length);
        System.out.println(al.size());
        System.out.println(s);
        System.out.println(Arrays.toString(array));
    }
}
