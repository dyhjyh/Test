package day9._04File类;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\DYH\\Desktop\\test.txt");
        File file2 = new File("C:/Users/DYH/Desktop/test.txt");
        File file3 = new File("C:" + File.separator + "Users" + File.separator + "DYH" + File.separator + "Desktop" + File.separator + "test.txt");
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists());
        System.out.println(file1.canWrite());
    }
}
