package day10._08打印流;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo01 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("src/day10/test4.txt");
        
        ps.println(97);
        ps.println(false);
        ps.println("聚集");
        ps.println('的');
        ps.println(98.6);
        
        ps.write('我');
        ps.write(97);
        
        ps.close();
    }
}
