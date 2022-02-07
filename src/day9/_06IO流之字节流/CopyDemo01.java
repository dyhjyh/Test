package day9._06IO流之字节流;

import java.io.*;

public class CopyDemo01 {
    public static void main(String[] args) {
        //使用字节流复制文件（使用了try的自动资源管理机制）
        try (InputStream is = new FileInputStream("D:\\Users\\DYH\\Videos\\God of War\\God of War 2022.02.06 - 16.10.44.09.DVR.mp4");
             OutputStream os = new FileOutputStream("D:\\Users\\DYH\\Desktop\\test.mp4")) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            is = new FileInputStream("D:\\Users\\DYH\\Videos\\God of War\\God of War 2022.02.06 - 16.10.44.09.DVR.mp4");
//            os = new FileOutputStream("D:\\Users\\DYH\\Desktop\\test.mp4");
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = is.read(buffer)) != -1) {
//                os.write(buffer, 0, len);
//            }
//            System.out.println("复制完成!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
