package lan.guomao.ThinkInJava;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by Languomao on 2018/4/12.
 */
public class VowelsAndConsonants {
    public static void main(String[] args){
        Random rand = new Random(47);
        for(int i = 0;i < 100;i++){
            int c = rand.nextInt(26) + 'A';
            printnb((char)c + "," + c + ":");
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': print("Vowel");
                        break;
                case 'y':
                case 'w':print("Sometimes a vowel");
                        break;
                default:print("consonant");
            }
        }
    }
}
