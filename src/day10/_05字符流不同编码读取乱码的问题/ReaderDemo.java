package day10._05字符流不同编码读取乱码的问题;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/day10/test3.txt"));
        
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
        br.close();
    }
    
}
