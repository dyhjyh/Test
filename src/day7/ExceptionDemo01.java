package day7;

import java.util.Scanner;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("请输入你的年龄:");
                int age = input.nextInt();
                System.out.println("你的年龄为:" + age);
                break;
            } catch (Exception e) {
                System.err.print("你的年龄是瞎搞的，请重新输入!");
            }
        }
    }
}


