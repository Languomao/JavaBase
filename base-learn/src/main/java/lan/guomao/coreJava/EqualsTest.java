package lan.guomao.coreJava;

/**
 * Created by Languomao on 2018/4/17.
 */
public class EqualsTest {
    public static void main(String[] args){
        Employee a;
        Employee b;
        Employee e1 = new Employee("languomao",3000,1994,6,4);
        Employee e2 = new Employee("languomao",3000,1994,6,4);
        a = e1;
        //e1.setName("chengcaixia");
        b = e1;
        //b.setName("chengcaixia");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        b = e2;
        System.out.println(a.equals(b));    //Object中比较的不是对象的内容，而是对象的内存地址,一般需要重写该方法使得其比较的是内容。
        System.out.println(a==b);

/*    String s = "string equals test...";
    String s2 = "string equals";
    String s3 = s2 + " test...";
    System.out.println(s.equals(s3));   //比较的是内容
    System.out.println(s==s3);      //比较的是内存地址*/
    }
}
