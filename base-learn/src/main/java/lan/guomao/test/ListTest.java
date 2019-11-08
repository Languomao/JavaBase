package lan.guomao.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Languomao on 2018/9/17.
 */
public class ListTest {

    @Test
    public void test(){
        List<String> list = new ArrayList();
        String[] s= {"http://item.jd.com/1473579949.html","http://item.jd.com/1472577598.html","http://item.jd.com/1472577600.html","http://item.jd.com/1472577599.html","http://item.jd.com/14725775.html"};
        for(int i=0;i<5;i++){
            String ss = s[i];
            list.add(ss);
            list.remove("http://item.jd.com/14725774445.html");
        }
        System.out.println(list);
    }
}
