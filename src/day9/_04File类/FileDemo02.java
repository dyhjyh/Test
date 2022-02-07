package day9._04File类;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        File file = new File("D:\\Users\\DYH");
        System.out.println(file.exists());
        
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
        
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
        
    }
}