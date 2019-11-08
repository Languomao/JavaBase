package lan.guomao.coreJava;

import java.util.Scanner;

/**
 * Created by Languomao on 2018/4/18.
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER A SIZE:(SMALL,MEDIUN,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size = "+ size);
        System.out.println("abbreviation = "+size.getAbbreviation());
        if(size==Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the _.");
        }
        Size[] sizevalues = Size.values();
        for(Size eachsize:sizevalues){
            System.out.println(eachsize);
        }
    }
}

enum Size{

    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abbreviation;    //缩写
    private Size(String abbreviation){
        this.abbreviation= abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }


}
