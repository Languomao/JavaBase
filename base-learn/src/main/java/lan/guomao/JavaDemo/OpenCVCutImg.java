/*
package lan.guomao.JavaDemo;

*/
/**
 * Created by Languomao on 2018/3/21.
 *//*

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;


public class OpenCVCutImg {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        String filename = "D:/test2.jpg";
        Mat image = Imgcodecs.imread(filename);
//                598.6869,165.47272,1054.9825,784.5689
//        1191.1521,306.32123,1306.551,458.31805
        List<Float> zb = new ArrayList<>();
        zb.add(new Float("1191.1521"));
        zb.add(new Float("306.32123"));
        zb.add(new Float("1306.551"));
        zb.add(new Float("458.31805"));

        opencvCutImg(zb,image,"d:/outfile.jpg",300);
    }

    */
/**
     * openCV方法进行图片的剪裁
     *
     * @param zb          图片的人脸区域坐标，为起止两个点
     * @param image       原始图片opencv对象
     * @param outfileName 输出的文件名
     * @param width_out   输出的图片宽度（方式人脸过小时截取的图片大小不一，前台展示时不统一）
     *//*

    public static boolean opencvCutImg(List<Float> zb, Mat image, String outfileName, int width_out) {

        boolean flag = true;
        if (zb.size() < 4) {
            System.out.println("输入的人脸坐标有误！");
            return false;
        }
        if (image == null) {
            System.out.println("输入的图片对象为空！");
            return false;
        }
        //取得坐标并进行等比例放大剪裁区域
        int x_start = Math.round(zb.get(0));
        int y_start = Math.round(zb.get(1));
        int x_end = Math.round(zb.get(2));
        int y_end = Math.round(zb.get(3));
        int width = (int) ((x_end - x_start) * 1.3);
        int heigth = (int) ((y_end - y_start) * 1.25);
        int detx = (int) (width * 0.2);
        int dety = (int) (width * 0.2);

        if ((x_start - detx / 2) < 0) {
            x_start = 0;
        } else {
            x_start = x_start - detx / 2;
        }
        if ((y_start - dety) < 0) {
            y_start = 0;
        } else {
            y_start = y_start - dety;
        }

        Rect rect = new Rect(x_start, y_start, width, heigth);//设置感兴趣的区域
        Mat roi_img = new Mat(image, rect);
        Mat tmp_img = new Mat();
        roi_img.copyTo(tmp_img);//复制内容之新建的图片对象
        int new_width = 0;
        //如果用户输入的宽度为0，则不进行缩放操作；否则按照用户提供的宽度进行等比例缩放
        if (width_out > 0) {
            new_width = width_out;
            Size s = new Size(new_width, tmp_img.height() * new_width / tmp_img.width());
            Imgproc.resize(roi_img, tmp_img, s);
        }

        Imgcodecs.imwrite(outfileName, tmp_img);//写出图片文件
        System.out.println("图片剪裁成功，保存路径为：" + outfileName);
        return flag;

    }
}
*/
