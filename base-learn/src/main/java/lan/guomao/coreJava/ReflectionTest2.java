package lan.guomao.coreJava;

import java.lang.reflect.Field;

/**
 * Created by Languomao on 2018/4/18.
 */
public class ReflectionTest2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee e = new Employee("languomao",2000,2017,5,3);
        Class c1 = e.getClass();
        Field f = c1.getDeclaredField("name");
        //Object v= f.get(e); //返回一个对象，其值为e域的当前值
        //System.out.println(c1+"\n"+f+"\n"+v);
    }
}
