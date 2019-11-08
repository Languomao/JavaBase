package lan.guomao.test;

import org.junit.Test;

/**
 * Created by Languomao on 2018/9/20.
 */
public class ContainTest {

    @Test
    public void test(){
        String s ="http://ng.d.cn/jianxiashijieer/";
        String url="http://android.d.cn/game/";
        System.out.println(s.contains(url));
    }
}
