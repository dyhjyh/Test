package day10._01字节缓冲输入流;

import java.io.*;

public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/day10/test1.txt");
    
        BufferedInputStream bis = new BufferedInputStream(is);
        
        byte[] buffer = new byte[1024];
        int len;
        
        while ((len = bis.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }
        
        is.close();
        bis.close();
    }
}
