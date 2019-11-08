package lan.guomao.ThinkInJava;

import static net.mindview.util.Print.print;

/**
 * Created by Languomao on 2018/4/12.
 */
public class SwitchTest {
    public static void  main(String[] args){
        for(int i = 0; i < 50;i++){
            switch(i){
                //没有break的话，只有匹配了条件，下面的case全部执行
                case 15:print("第一个被15整除的自然数。。。。。。。。。。。。。。。。");
                //break;
                case 30:print("第二个。。。。。。。。。。。。。。。。。。。。。。。。");
                        print(i);
                //break;
                case 45:print("最后一个。。。。。。。。。。。。。。。。。。。。。。。");
                        print(i);
                //break;
                default:print("该数字不能被15整除");
                        print(i);
            }
        }
    }
}
