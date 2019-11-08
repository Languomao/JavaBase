package lan.guomao.ThinkInJava;

import java.util.Date;

/**
 * Created by Languomao on 2018/4/13.
 */
public class StringTest2 {
    public static void main(String[] args){
        String name = "Languomao";
        int age = 24;
        //int n = name.codePointCount(0,name.length());
        System.out.printf("Hello,%s.Next year you will be %s.",name,age);
        System.out.printf("\n现在时间为：%tc",new Date());
    }
}
