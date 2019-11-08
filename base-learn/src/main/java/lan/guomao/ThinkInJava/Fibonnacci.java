package lan.guomao.ThinkInJava;

import static net.mindview.util.Print.print;

/**
 * Created by Languomao on 2018/4/12.
 */
public class Fibonnacci {
    public static void main(String[] args){
        Fibonnacci f = new Fibonnacci();
        f.calculate(9);
    }

    public void calculate(int i){
        int[] k = new int[i+1];
        for(int j=1;j<=i;j++){
            if(j==1||j==2){
                k[j] = 1;
                print(k[j]);
            }else{
                k[j] = k[j-1]+k[j-2];
                print(k[j]);
            }

        }
    }
}
