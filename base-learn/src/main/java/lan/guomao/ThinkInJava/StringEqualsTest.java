package lan.guomao.ThinkInJava;

/**
 * Created by Languomao on 2018/4/13.
 */
public class StringEqualsTest {
    public static void main(String[] args){
        String s1 = "Languomao";
        //String s = "Lan";
        String s2 = "Lan"+"guomao";
        String s3 = s1.substring(0,3)+"guomao";
        String s4 = s1.substring(0,3);
        String s5 = "Lan";
        System.out.println(s4);
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s4==s5); //substring()方法产生的字符串不是共享的，所以s4与s5不是同一个对象
    }
}
