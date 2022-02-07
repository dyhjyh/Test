package day9._06IO流之字节流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream(".\\src\\day9\\test.txt");
        byte[] arr = new byte[3];
        int len;
        while ((len = fis.read(arr)) != -1) {
            String rs = new String(arr, 0, len);
            System.out.print(rs);
        }
        System.out.println();
        fis.close();
    }
}
