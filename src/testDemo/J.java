package testDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner[] sc = new Scanner[10];
        sc[6] = new Scanner(System.in);
        sc[5] = new Scanner(new FileInputStream("8787"));
        sc[4] = new Scanner(new File("www"));
        sc[3] = new Scanner(System.in);
    }
}
