package lan.guomao.ThinkInJava;

/**
 * Created by Languomao on 2018/4/10.
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ",");
        return result;
    }
    public static void main(String[] args){
        while(condition()){
            System.out.println("Inside while");
        }
        System.out.println("Exited while");
    }
}
