package day10._04字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new FileReader("src/day10/test1.txt"));
        
        char[] buffer = new char[1024];
        int len;
        while ((len = brf.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        
        brf.close();
    }
}
