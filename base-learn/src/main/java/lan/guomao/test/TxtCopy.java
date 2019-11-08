package lan.guomao.test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;


/**
 * Created by Languomao on 2018/9/20.
 */
public class TxtCopy {

    @Test
    public void copyFileUsingJava7Files() throws IOException {
        File source = new File("E:\\Tomcat\\apache-tomcat-7.0.81\\crawler4j-master\\hive\\2018-09-20\\android.d.cn_GameData.txt");
        File dest = new File("E:\\Tomcat\\apache-tomcat-7.0.81\\crawler4j-master\\hive\\2018-09-20\\ng.d.cn_GameData.txt");
        Files.copy(source.toPath(), dest.toPath());
        }

    @Test
    public void copyFileUsingFileChannels() throws IOException {
        File source = new File("E:\\Tomcat\\apache-tomcat-7.0.81\\crawler4j-master\\hive\\2018-09-20\\android.d.cn_GameData.txt");
        File dest = new File("E:\\Tomcat\\apache-tomcat-7.0.81\\crawler4j-master\\hive\\2018-09-20\\ng.d.cn_GameData.txt");
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }

    @Test
    public void copyFileUsingFileChannels2() throws IOException {

        String currenttime = "2018-09-20";

       String domain1 = "android.d.cn";
       String domain2 = "ng.d.cn";

        //File path = new File("../crawler4j-master/hive/" + currenttime);

        String tab1 = domain1 + "_" + "GameData" + ".txt";
        String tab2 = domain2 + "_" + "GameData" + ".txt";
        //File fileName = new File(HADOOP_HIVE + currenttime + "/" + tab);
        File source = new File("../crawler4j-master/hive/" + currenttime + "/" + tab1);
        File dest = new File("../crawler4j-master/hive/" + currenttime + "/" + tab2);

        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }
}
