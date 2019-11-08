package lan.guomao.coreJava;

import java.time.DayOfWeek;
import java.time.LocalDate;


/**
 * Created by Languomao on 2018/4/16.
 */

public class CalendarTest {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        localDate = localDate.minusDays(day-1);     //生成当前日期之前或者之后的n天的日期
        //int today = localDate.getDayOfMonth();
        //System.out.print(today);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.out.println(" Mon Teu Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++)
            System.out.print("    ");
        while(localDate.getMonthValue()==month){
            System.out.printf("%3d",localDate.getDayOfMonth());
            if(localDate.getDayOfMonth()==day)
                System.out.print("*");
            else
                System.out.print(" ");
            localDate = localDate.plusDays(1);
            if(localDate.getDayOfWeek().getValue()==1){
                System.out.println(" ");
            }
        }
        if(localDate.getDayOfWeek().getValue()!=1)
            System.out.println(" ");
    }
}
