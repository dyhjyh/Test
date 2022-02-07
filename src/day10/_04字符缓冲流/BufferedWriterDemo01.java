package day10._04字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/day10/test3.txt", true));
        
        bw.write("我爱Java");
        bw.newLine();
        bw.write("嘿嘿嘿");
        bw.write(System.lineSeparator());
        bw.write("-------------");
        bw.write("\r\n");
        bw.write("🔒🔑🐱🐕");
        
        bw.close();
    }
}
