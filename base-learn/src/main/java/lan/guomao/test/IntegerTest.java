package lan.guomao.test;

/**
 * Created by Languomao on 2018/5/16.
 */
public class IntegerTest {
    public static void main(String[] args){
        Integer a = 129;
        Integer b = 129;
        int c = 129;
        System.out.println(a == b);
        System.out.println(a == c);
        byte d = -128;
        System.out.println(d>>2);
        System.out.println(d>>>2);
    }
}
