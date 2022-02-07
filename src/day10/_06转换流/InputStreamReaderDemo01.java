package day10._06转换流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day10/test3.txt"), "GBK"));
        
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
        br.close();
    }
}
