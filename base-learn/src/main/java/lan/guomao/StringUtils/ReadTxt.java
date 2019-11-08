package lan.guomao.StringUtils;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Languomao on 2018/9/17.
 *
 * 读取文件的文本内容
 *
 */
public class ReadTxt {

    @Test
    public void getTxt(){
        try{
            String temp = null;
            File f = new File("E:\\Tomcat\\apache-tomcat-7.0.81\\crawler4j-master\\failure\\2018-09-17\\item.jd.com_level0.txt");
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f),"utf-8");
            ArrayList<String> readList = new ArrayList<String>();
            BufferedReader reader=new BufferedReader(read);
            while((temp=reader.readLine())!=null &&!"".equals(temp)){
                readList.add(temp);
            }
            for(int i=0;i<readList.size();i++){
                System.out.println(readList.get(i));
            }
            read.close();
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
        }
    }
}
