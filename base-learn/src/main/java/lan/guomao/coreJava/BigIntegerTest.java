package lan.guomao.coreJava;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Languomao on 2018/4/13.
 */
public class BigIntegerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much numbers do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("What's the highest number you can draw?");
        int n = scanner.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i =1;i<=k;i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));

            System.out.println("You odds are 1 in "+lotteryOdds + ".Good luck!");

        }
    }
}
