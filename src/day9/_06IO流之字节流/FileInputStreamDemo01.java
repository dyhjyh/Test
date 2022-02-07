package day9._06IO流之字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/day9/test.txt");
        InputStream fis = new FileInputStream(file);
        
        int ele;
        while ((ele = fis.read()) != -1) {
            System.out.print((char) ele);
        }
        
        fis.close();
    }
}
