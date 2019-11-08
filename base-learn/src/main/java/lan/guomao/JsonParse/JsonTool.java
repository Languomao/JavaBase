package lan.guomao.JsonParse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by Languomao on 2018/9/4.
 */
public class JsonTool {

    @Test
    public  void testJSONStrToJSONObject(){

        String JSON_OBJ_STR = "{\"CommentsCount\":[{\"SkuId\":6432429,\"ProductId\":6432429,\"ShowCount\":34000,\"ShowCountStr\":\"3.4万+\",\"CommentCountStr\":\"59万+\",\"CommentCount\":590000,\"AverageScore\":5,\"DefaultGoodCountStr\":\"31万+\",\"DefaultGoodCount\":310000,\"GoodCountStr\":\"58万+\",\"GoodCount\":580000,\"AfterCount\":2900,\"OneYear\":0,\"AfterCountStr\":\"2900+\",\"VideoCount\":1000,\"VideoCountStr\":\"1000+\",\"GoodRate\":0.98,\"GoodRateShow\":98,\"GoodRateStyle\":147,\"GeneralCountStr\":\"4600+\",\"GeneralCount\":4600,\"GeneralRate\":0.014,\"GeneralRateShow\":1,\"GeneralRateStyle\":2,\"PoorCountStr\":\"3900+\",\"PoorCount\":3900,\"PoorRate\":0.0060,\"PoorRateShow\":1,\"PoorRateStyle\":1}]}";
        JSONObject jsonObject = JSON.parseObject(JSON_OBJ_STR);
        //JSONObject jsonObject1 = JSONObject.parseObject(JSON_OBJ_STR); //因为JSONObject继承了JSON，所以这样也是可以的

        System.out.println(jsonObject.getString("CommentCountStr")+":"+jsonObject.getInteger("CommentCount"));

    }
}
