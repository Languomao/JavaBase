package utils;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Classname JSON2CSV
 * Description TODO
 * Date 2020/8/19 15:45
 * Created by LanKorment
 */
public class JSON2CSV {

    public static void main(String[] args){
        String s = "{\"Source\":\"172.18.219.1:52279\",\"node_id_str\":\"ASR9001-PE3\"}";
        jsonTocsvAndSave(json2csv(s),"D:\\WorkSpace\\Telemetry\\test.txt");
    }

    private static void jsonTocsvAndSave(String provincesJsonString, String fileName) {
        try {
            //File file = new File(fileName);
            FileUtils.writeToNewFile(fileName, json2csv(provincesJsonString));
                    //writeStringToFile(file, json2csv(provincesJsonString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String json2csv(String provincesJsonString) throws JSONException {
        JSONArray jsonArray = new JSONArray(provincesJsonString);
        return CDL.toString(jsonArray);

    }
}
