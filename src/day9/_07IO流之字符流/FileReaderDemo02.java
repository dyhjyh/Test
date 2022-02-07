package day9._07IO流之字符流;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader(".\\src\\day9\\test1.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }
        fr.close();
    }
}
