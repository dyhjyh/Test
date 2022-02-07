package day9._04File类;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file1 = new File("D:\\Users\\DYH\\Desktop\\test.txt");
        File file2 = new File("D:/Users/DYH/Desktop/test");
        File file3 = new File("C:" + File.separator + "Users" + File.separator + "DYH" + File.separator + "Desktop" + File.separator + "test.txt");
        File file4 = new File("./../../../");
        File file5 = new File("D:/Users/DYH/Desktop/test2/d/fd/f/f/df/d/f/d");
        File file6 = new File("D:\\Users\\DYH\\Desktop\\test2.txt");
        
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());
        System.out.println(file4.exists());
        System.out.println(file4.getAbsolutePath());
    
        System.out.println(file1.createNewFile());
        //System.out.println(file2.createNewFile());
        System.out.println(file1.canWrite());
        //System.out.println(file1.setWritable(false));
        //System.out.println(file1.setReadable(false));
        System.out.println(file1.setLastModified(1000));
    
        System.out.println(file2.mkdir());
        System.out.println(file5.mkdirs());
        System.out.println(file6.mkdir());
        
        Thread.sleep(5000);
        System.out.println(file1.delete());
        System.out.println(file2.delete());
        System.out.println(file5.delete());
        System.out.println(file6.delete());
        
    }
}
