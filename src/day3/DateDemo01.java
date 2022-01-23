package day3;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
//        Date date = new Date();
//        long startTime = date.getTime();
        long startTime = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出: " + i);
        }
//        long endTime = date.getTime();
        long endTime = new Date().getTime();
        System.out.println((endTime - startTime) / 1000.0 + "s");
    }
}
