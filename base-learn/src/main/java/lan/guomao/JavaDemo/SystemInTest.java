package lan.guomao.JavaDemo;

import javafx.scene.shape.Path;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Languomao on 2018/4/13.
 */
public class SystemInTest {
    public static void main(String[] args) throws IOException {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("What's youir name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println(name);
        System.out.println(age);*/
       /* Console cons = System.console();
        System.out.println("What's you passwords?");
        String key = scanner.nextLine();
        String username = cons.readLine("User name:");
        char[] passwd = cons.readPassword();*/

       Scanner scanner = new Scanner(Paths.get("E:\\IDEAWorkspace\\JavaBase\\src\\test.txt"),"UTF-8");
        String line="";
       for(int i=1;i<4;i++){
           if((line=scanner.nextLine())!=""){
               System.out.println("第"+i+"行： "+line);
           }else{
               System.out.println("文件阅读完毕....");
           }
       }
    }
}
