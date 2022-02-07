package day9._07IO流之字符流;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader(".\\src\\day9\\test1.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
