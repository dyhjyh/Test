package day10._08打印流;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("src/day10/test4.txt");
        
        pw.println(97);
        pw.println(false);
        pw.println("聚集");
        pw.println('的');
        pw.println(98.6);
        
        pw.write("大是大非");
        pw.write(97);
        
        pw.close();
    }
}
