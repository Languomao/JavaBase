package lan.guomao.StringUtils;

import org.junit.Test;

/**
 * Created by Languomao on 2018/9/18.
 */
public class SubStringTest {

    @Test
    public void test(){
        String s = "408_jdkasljda+dslamd";
        String s2 = s.substring(0,3);
        System.out.println(s2);
    }

    @Test
    public void getPageNum(){
        //PageModel p = obj.get(0);
        int num = 0;
        //NodeList pagediv = HtmlparseUtil.tagGet(p.getInfoContentToString().trim(),"utf-8", "div", "class", "pager");
        //NodeList liNodeList = HtmlparseUtil.getTargetHtmlByTagName(pagediv.elementAt(0).toHtml(), new LiTag());
        //NodeList alist = HtmlparseUtil.getTargetHtmlByTagName(liNodeList.elementAt(liNodeList.size()-1).toHtml(), new ATag());
        //Tag atag = (Tag)alist.elementAt(0);
        String href = "list 8.html";
        num = Integer.parseInt(href.substring(href.indexOf(".")-1, href.indexOf(".")));
        System.out.println(num);
    }
}
