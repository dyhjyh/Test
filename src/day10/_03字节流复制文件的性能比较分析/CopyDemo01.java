package day10._03字节流复制文件的性能比较分析;

import java.io.*;

public class CopyDemo01 {
    //文件大小:1.34GB
    private static final String SRC_FILE = "D:\\Users\\DYH\\Videos\\God of War\\God of War 2022.02.06 - 15.54.32.07.mp4";
    private static final String DEST_FILE = "F:\\学习\\";
    
    public static void main(String[] args) {
        copy01();   //普通字节流一个一个字节复制     >2小时
        copy02();   //普通字节流按字节数组复制         =10.138s
        copy03();   //高级缓冲字节流一个一个字节复制    =40.049s
        copy04();   //高级缓冲字节流按字节数组复制      =1.945s
    }
    
    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(SRC_FILE); OutputStream os = new FileOutputStream(DEST_FILE + "01.mp4")) {
            int ch;
            while ((ch = is.read()) != -1) {
                os.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通字节流一个一个字节复制用时:" + (endTime - startTime) / 1000.0 + "s");
    }
    
    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try (InputStream is = new FileInputStream(SRC_FILE); OutputStream os = new FileOutputStream(DEST_FILE + "02.mp4")) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通字节流按字节数组复制用时:" + (endTime - startTime) / 1000.0 + "s");
    }
    
    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FILE + "03.mp4"))) {
            int ch;
            while ((ch = bis.read()) != -1) {
                bos.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级缓冲字节流一个一个字节复制用时:" + (endTime - startTime) / 1000.0 + "s");
    }
    
    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FILE + "04.mp4"))) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级缓冲字节流按字节数组复制用时:" + (endTime - startTime) / 1000.0 + "s");
    }
}
