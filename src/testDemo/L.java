package testDemo;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int l = (int) (r / Math.sqrt(2));
        sc.close();
        
        int num = 0;
        for (int i = 1; i <= l; i++) {
            double x = Math.sqrt(r * r - i * i);
            if (x % 1 == 0) num++;
        }
        
        if (r == 0) {
            System.out.print(1);
        } else {
            System.out.print(num * 8 + 4);
        }
    }
}
