package lan.guomao.JsonParse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Languomao on 2018/9/4.
 */
/*
* 正则表达式解析Jason
* */
public class JsonTest {

    public static int jsonParse(String str,int j){
        List<String> list = extractMessageByRegular(str);
        String sCodea =list.toString();
        String sCode = sCodea.replace("{","").replace("}","").replace("[","").replace("]","");
        String[] sCodex = sCode.split(",");
        String[] sj = sCodex[j].split(":");
        String mj = sj[1].replace("\"", "");
        float commitnum = Float.parseFloat(mj.trim());
        int Number = (int)commitnum;
        System.out.println(Number);
       for(int i = 0;i<sCodex.length;i++){
            System.out.println(sCodex[i].toString());
        }
        return Number;
    }


    public static List<String> extractMessageByRegular(String msg){

        List<String> list=new ArrayList<String>();
        Pattern p = Pattern.compile("(\\[[^\\]]*\\])");
        Matcher m = p.matcher(msg);
        while(m.find()){
            list.add(m.group().substring(1, m.group().length()-1));
        }
        return list;
    }

    public static void main(String[] args){
        //String sCode1 = "{\"CommentsCount\":[{\"SkuId\":6432429,\"ProductId\":6432429,\"ShowCount\":34000,\"ShowCountStr\":\"3.4万+\",\"CommentCountStr\":\"59万+\",\"CommentCount\":590000,\"AverageScore\":5,\"DefaultGoodCountStr\":\"31万+\",\"DefaultGoodCount\":310000,\"GoodCountStr\":\"58万+\",\"GoodCount\":580000,\"AfterCount\":2900,\"OneYear\":0,\"AfterCountStr\":\"2900+\",\"VideoCount\":1000,\"VideoCountStr\":\"1000+\",\"GoodRate\":0.98,\"GoodRateShow\":98,\"GoodRateStyle\":147,\"GeneralCountStr\":\"4600+\",\"GeneralCount\":4600,\"GeneralRate\":0.014,\"GeneralRateShow\":1,\"GeneralRateStyle\":2,\"PoorCountStr\":\"3900+\",\"PoorCount\":3900,\"PoorRate\":0.0060,\"PoorRateShow\":1,\"PoorRateStyle\":1}]}";
        String sCode1 = "[{\"op\":\"449.00\",\"m\":\"459.00\",\"id\":\"J_4386779\",\"p\":\"399.00\"}]";
        jsonParse(sCode1,3);
    }
}
