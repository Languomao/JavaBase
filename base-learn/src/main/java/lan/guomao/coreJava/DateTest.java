package lan.guomao.coreJava;

import java.time.LocalDate;

/**
 * Created by Languomao on 2018/4/16.
 */
public class DateTest {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        LocalDate newYearsEve = LocalDate.of(1994,6,4);
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        int year = aThousandDaysLater.getYear();
        int month = aThousandDaysLater.getMonthValue();
        int day = aThousandDaysLater.getDayOfMonth();
        System.out.println(localDate);
    }
}
