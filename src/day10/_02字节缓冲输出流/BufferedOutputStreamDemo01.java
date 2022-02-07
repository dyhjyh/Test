package day10._02字节缓冲输出流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/day10/test2.txt"));
        
        bos.write('a');
        bos.write(98);
        bos.write('我');
        bos.write("我哈哈哈".getBytes());
        bos.write("我嘿嘿嘿".getBytes(), 0, 6);
        
        bos.close();
    }
}
