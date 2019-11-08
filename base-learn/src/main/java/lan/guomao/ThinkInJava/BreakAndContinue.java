package lan.guomao.ThinkInJava;

import static net.mindview.util.Range.range;

/**
 * Created by Languomao on 2018/4/10.
 */
public class BreakAndContinue {
    public static void main(String[] args){
        for(int i : range(100)){
            if(i == 74) break;
            if(i % 9 != 0) continue;
            System.out.print(" i = " + i);
        }
    }
}
