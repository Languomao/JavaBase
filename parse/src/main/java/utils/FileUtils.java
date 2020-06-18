package utils;

import java.io.*;
import java.util.ArrayList;

/**
 * Classname FileUtils
 * Date 2020/6/12 17:04
 * Created by LanKorment
 */
public class FileUtils {
    public static void writeToNewFile(String file, String conent) {
        //String file, String conent
        //String file = "G:\\data\\data2\\test2.txt";
        //String conent = "dqwfewfwefwe7u4893248924qwfew";
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(conent+"\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static ArrayList<String> getAllFileName(String path) {
        //String path
        //String path = "G:\\data\\data2";
        ArrayList<String> fileNameList = new ArrayList<String>();
        boolean flag = false;
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文件：" + tempList[i]);
                //fileNameList.add(tempList[i].toString());
                fileNameList.add(tempList[i].toString());
            }
                    if (tempList[i].isDirectory()) {
                            System.out.println("文件夹：" + tempList[i]);
                            getAllFileName(path + "\\" + tempList[i]);
                    }
        }
        return fileNameList;
    }
}
