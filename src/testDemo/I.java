package testDemo;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.next();
        
        if (ID.length() == 8 && !ID.startsWith("0")) {
            System.out.println("ID is OK!");
        }
    }
}
