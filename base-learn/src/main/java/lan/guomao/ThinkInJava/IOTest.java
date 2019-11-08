package lan.guomao.ThinkInJava;

import java.io.*;

/**
 * Created by Languomao on 2018/4/10.
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
/*        FileReader fr = new FileReader("E:\\IDEAWorkspace\\JavaBase\\src\\test.txt");
        char[] buf = new char[1024];
        while(fr.read(buf)>0){
            StringBuffer sb = new StringBuffer();
            sb.append(buf);
            System.out.println(sb);
        }*/

    InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\IDEAWorkspace\\JavaBase\\src\\test.txt"));
    char[] buf = new char[1024];
    while(isr.read(buf)>0){
        StringBuffer sb = new StringBuffer();
        sb.append(buf);
        System.out.println(sb);
    }
    }
}
