package lan.guomao.StringUtils;

import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Test;

/**
 * Created by Languomao on 2018/9/7.
 */
public class StringUtilsTest1 {

    @Test
    public void test1(){
        String s = "https://detail.tmall.com/item.htm?id=565115417972&amp;skuId=3968869475067&amp;standard=1&amp;user_id=2616970884&amp;cat_id=50936003&amp;is_b=1&amp;rn=13c0d3f92e974a51ed2477d3031127ea";
        String s2 = StringEscapeUtils.unescapeHtml(s);
        System.out.println(s+"\n"+s2);
    }
}
