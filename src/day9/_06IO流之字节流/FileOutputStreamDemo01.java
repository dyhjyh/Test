package day9._06IO流之字节流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream(".\\src\\day9\\test2.txt", false);
        
        os.write(99);
        os.write('a');
        os.write('o');
//        os.write('磊');
        os.write('\n');
        
        byte[] b1 = new byte[]{52, 95, 67, 105};
        os.write(b1);
        os.write('\r');
        
        byte[] b2 = "我爱Java哈哈哈！!".getBytes(StandardCharsets.UTF_8);
        os.write(b2);
        os.write("\r\n".getBytes());
        
        os.write(b2, 0, 10);
        //os.write("%n".getBytes()); //此方法不能换行
        
        os.flush();
        os.close(); //close前会包含flush刷新
    }
}
