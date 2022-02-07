package day9._06IO流之字节流;

import java.io.*;

/**
 * 解决读取文件时的中文乱码问题
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\src\\day9\\test1.txt");
        InputStream fis = new FileInputStream(file);
    
        //001
//        System.out.println("文件大小为:" + file.length());
//        byte[] arr = new byte[(int) file.length()];
//        System.out.println("读取大小为:" + fis.read(arr));
//        String rs = new String(arr);
//        System.out.println(rs);
        
        //002
        byte[] arr2 = fis.readAllBytes();
        String rs2 = new String(arr2);
        System.out.println(rs2);
        
        fis.close();
    }
}
