package lan.guomao.StringUtils;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Languomao on 2018/9/19.
 *
 * 读取文件然后提取需要的内容
 */
public class ReadTxt2 {

    public static String HADOOP_HIVE = "E:/Tomcat/apache-tomcat-7.0.81/crawler4j-master/hive/";

    public static String GAMEDATA = "GameData";


    public Set<String> getAllLinks(String url)
    {
        HashSet objList = new HashSet();

        String currenttime = "2018-09-20";

        String domain = "android.d.cn";

        File path = new File(HADOOP_HIVE + currenttime);
        String tab = domain + "_" + GAMEDATA + ".txt";

        if (!path.exists()) {
            path.mkdirs();
        }

        File fileName = new File(HADOOP_HIVE + currenttime + "/" + tab);
        if (!fileName.exists()) {
            return null;
        }
        String gameData = "";
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
            BufferedReader in = new BufferedReader(isr);
            String link = "";

            while ((gameData = in.readLine()) != null)
            {
                String[] colums = gameData.split("[|]");
                if (colums.length > 3) {
                    link = colums[(colums.length - 3)];
                }

                if (link.contains(url)) {
                    objList.add(link);
                }

            }
            System.out.println(objList.size());
            Iterator it = objList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return objList;
    }

    public static void main(String[] args){
        String url="http://android.d.cn/game/";
        String url2 = "http://ng.d.cn/";
        ReadTxt2 rd2 = new ReadTxt2();
        HashSet objList = (HashSet) rd2.getAllLinks(url2);
    }
}
