package day9._07IO流之字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo03 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("src/day9/test3.txt", true);
        
        //001
        fw.write(97);
        fw.write('b');
        fw.write('航');
        fw.write("\r\n");
        
        //002
        fw.write("Java是最优美的语言");
        fw.write("\r\n");
    
        //003
        fw.write("我嘿嘿嘿".toCharArray());
        fw.write("\r\n");
    
        //004
        fw.write("Java是最优美的语言",0, 9);
        fw.write("\r\n");
    
        //005
        fw.write("我嘿嘿嘿".toCharArray(), 0, 2);
        fw.write("\r\n");
        fw.write("---------------");
        fw.write("\r\n");
    
        fw.close();
    }
}
