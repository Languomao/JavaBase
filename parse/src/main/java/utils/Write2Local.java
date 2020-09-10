package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classname Write2Local
 * Date 2020/7/29 14:34
 * Created by LanKorment
 */
public class Write2Local {

    public static void main(String[] aegs) {
        //write2Local();
    }

    public static void write2Local(String path,String source) throws IOException {
        //String path = "D:\\WorkSpace\\data&note";
        //String source = "test text......";

        /*LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date2 = date.format(formatter);*/
        /*Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DATE);*/

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String s = df.format(new Date()).replaceAll(" ","-").replace(":","-");// new Date()为获取当前系统时间

        File file = new File(path);
        FileWriter fw = null;
        try {
            //fw = new FileWriter(file + "/"+ year + "-"+ month + "-"+ day + "-" + ".csv", true);
            fw = new FileWriter(file + "/"+ s + ".csv", true);
            fw.write(source + "\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            fw.close();
        }
        fw.close();
    }
}
