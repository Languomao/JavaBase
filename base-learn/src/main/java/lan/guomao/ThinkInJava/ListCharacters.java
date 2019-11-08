package lan.guomao.ThinkInJava;

/**
 * Created by Languomao on 2018/4/10.
 */
public class ListCharacters {
    public static void main(String[] args){
        for(char c = 0 ; c < 128 ; c++){
            if(Character.isLowerCase(c)){
                System.out.println("value:" + (int)c + " Character:" + c);
            }
        }

        float a = 120;
        System.out.println((int)a);
    }
}
