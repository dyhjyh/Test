package day10._08打印流;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo02 {
    public static void main(String[] args) throws IOException {
        System.out.println(1);
    
        System.setOut(new PrintStream("src/day10/log.txt"));
    
        System.out.println(2);
        System.out.println(3);
    }
}
