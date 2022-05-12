package testDemo;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
    
        String[] elements = line.split(" ");
    
        if (elements.length != 2) {
            System.out.println("Not valid");
        }
        
        Double max = Double.MAX_VALUE;
    }
}
