package trafficmatrices;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 *
 * 解析欧洲教育网数据为CSV格式
 *
 * */
public class Parse {
        public static void main(String[] args) throws DocumentException {
                ArrayList<String> list= getAllFileName("G:\\data\\traffic-matrices");
                String path = "G:\\data\\output";
                for(String arr: list){
                        parse(arr,path);
                }
        }

        public static void parse(String inputPath,String path) throws DocumentException{
                //String inputPath,String path
                //String inputPath = "E:/data/traffic-matrices/IntraTM-2005-03-19-11-15.xml";
                //String outputPath = "G:/data/data2/IntraTM-2005-03-19-11-15.csv";
                //String file = getFileName(inputPath);
                String outputPath = path + "\\" + getFileName(inputPath).replace(".xml" , ".csv");
                String id = getDate(inputPath).replace("-","") + getTime(inputPath).replace(":","");

                //1. 创建DOM4J解析器对象
                SAXReader reader = new SAXReader();
                Document doc = reader.read(new File(inputPath));

                //获取根节点
                Element root = doc.getRootElement();
                Element Intratm = root.element("IntraTM");
                List<Element> srcs = Intratm.elements("src");

                String[] dstarr = new String[]{"12","13","19","23","8","18","4","1","5","3","10","22","7","2","6","16","14","20","11","9","17","21","15"};
                // id = 12,13,19,23,8,18,4,1,5,3,10,22,7,2,6,16,14,20,11,9,17,21,15
                for (Element src : srcs) {

                        String srcid = src.attributeValue("id");
                        String text = "";
                        text = id + "," + srcid;
                        List<Element> dsts = src.elements("dst");
                        ArrayList<String> dstlist = new ArrayList<>();
                        for(Element dst:dsts){
                                String dstid = dst.attributeValue("id");
                                dstlist.add(dstid);
                        }
                        if(dsts.size()==0){
                                text += ",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0";
                        }else{
                                for(String dstnum : dstarr){
                                        for(Element dst:dsts){
                                                String dstid = dst.attributeValue("id");
                                                String str = dst.getText();
                                                //System.out.println(dstlist.contains(dstnum));
                                                if(dstlist.contains(dstnum)&&dstid.equals(dstnum)){
                                                        text += "," + dst.getText();
                                                        //System.out.println(text);
                                                        break;
                                                }else if(dstlist.contains(dstnum)&&!dstid.equals(dstnum)){
                                                        continue;
                                                }else{
                                                        text += "," + "0";
                                                        break;
                                                        //System.out.println(text);
                                                }
                                        }
                                }
                        }
                        text += ","+ getDate(inputPath);
                        text += ","+ getTime(inputPath);
                        //System.out.println(text);
                        writeToNewFile(outputPath,text);
                }

        }

        public static String getFileName(String inputPath){
                //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
                String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
                //System.out.println(fileName);
                return  fileName;
        }

        public static String getDate(String inputPath){
                //String inputPath = "E:/data/traffic-matrices/IntraTM-2005-01-01-00-30.xml";
                //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
                String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
                String datetime = fileName.substring(8,18);
                //System.out.println(datetime);
                return datetime;

        }

        public static String getTime(String inputPath){
                //String inputPath = "E:/data/traffic-matrices/IntraTM-2005-01-01-00-30.xml";
                //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
                String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
                String datetime = fileName.substring(19,24).replace("-",":");
                //System.out.println(datetime);
                return datetime;

        }


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
                                //System.out.println("文     件：" + tempList[i]);
                                //fileNameList.add(tempList[i].toString());
                                fileNameList.add(tempList[i].toString());
                        }
                        /*if (tempList[i].isDirectory()) {
                                System.out.println("文件夹：" + tempList[i]);
                                getAllFileName(path + "\\" + tempList[i]);
                        }*/
                }
                return fileNameList;
        }
}
