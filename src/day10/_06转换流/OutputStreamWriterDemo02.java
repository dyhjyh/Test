package day10._06转换流;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/day10/test3.txt", true), "GBK"));
        
        bw.newLine();
        bw.write("abc我是嘿嘿嘿");
        bw.newLine();
        
        bw.close();
        
    }
}
