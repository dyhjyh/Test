package day10._04字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new FileReader("src/day10/test1.txt"));
        
        String line;
        
        while ((line = brf.readLine()) != null) {
            System.out.println(line);
        }
        
        brf.close();
    }
}
