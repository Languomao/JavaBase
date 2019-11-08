package lan.guomao.ThinkInJava;

/**
 * Created by Languomao on 2018/4/9.
 */
public class StringTest {
    public static void main(String[] args){
/*        String s1 = "languomao";
        String s2 = new String("languomao");
        System.out.println(s2);
        System.out.print(s1==s2);*/

/*        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = s1;
        String s4 = new String("Hello World");
        String s5 = new String("Hello World");*/

        long l = 21L;
        int num1 = 2;
        int num2 = 5;
        int num3 =(int)(num2+3.5);
        char a = '\u2122';
        char b = '\u005B';
        char c = '\u005D';
        System.out.println(num1+num2+" "+num3);
        System.out.println((int)l);
        System.out.println(2.0-1.1);
        System.out.println(a +" \n" + b +"\n"+ c);
        System.out.println("Languomao\nlanguomao");
    }
}
