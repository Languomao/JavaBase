package lan.guomao.test;

import java.io.File;

/**
 * Created by Languomao on 2018/8/22.
 */
public class FileExitsTest {

    public static void main(String[] args){
        File file = new File("E:\\hive-schema-2.1.0.mysql.sql");
        File file2 = new File("E:"+File.separator+"hive-schema-2.1.0.mysql.sql");
        File file3 = new File("E:\\webstorm\\Project2\\foot.html");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());
    }
}
