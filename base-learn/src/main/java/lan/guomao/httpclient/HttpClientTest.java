package lan.guomao.httpclient;

import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.junit.Test;

import java.io.File;

/**
 * Created by Languomao on 2018/9/26.
 */
public class HttpClientTest {

    @Test
    public void test(){
        String targetURL = null; // -- 指定URL
        //final String KEY = "27FB41B40E4EC1D528C64290E081AD2B";
        targetURL ="http://open.play.cn/dev/api/img_upload/uploadCoreFile?file_type=1002";
        File targetFile = new File("");
/*        String fileName = new String(targetFile.getName().getBytes(), "utf-8");;
        Part[] parts = { new FilePart(fileName, targetFile), new StringPart("md5", encryptForMD5(ss + time.toString())),
                new StringPart("time", time.toString())};*/
    }
}
