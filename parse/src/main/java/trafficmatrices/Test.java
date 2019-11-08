package trafficmatrices;

public class Test {

    @org.junit.Test
    public void getFileName(){
        //String inputPath
        String inputPath = "E:/data/traffic-matrices/IntraTM-2005-03-19-11-15.xml";
        //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
        String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
        System.out.println(fileName);
        //return  fileName;
    }

    @org.junit.Test
    public void getDate(){
        String inputPath = "E:/data/traffic-matrices/IntraTM-2005-01-01-00-30.xml";
        //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
        String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
        String datetime = fileName.substring(8,18);
        System.out.println(datetime);
        //return datetime;

    }

    @org.junit.Test
    public void getTime(){
        String inputPath = "E:/data/traffic-matrices/IntraTM-2005-01-01-00-30.xml";
        //String fileName = inputPath.split("/")[inputPath.split("/").length-1];
        String fileName = inputPath.substring(inputPath.length()-28,inputPath.length());
        String datetime = fileName.substring(19,24).replace("-",":");
        System.out.println(datetime);
        //return datetime;

    }
}
