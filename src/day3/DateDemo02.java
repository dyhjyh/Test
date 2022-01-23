package day3;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Date date1 = new Date();
            System.out.println(date1);
    
            long time = date1.getTime() + 121 * 1000;
    
            Date date2 = new Date(time);
            System.out.println(date2);
        }
        
        
        
    }
}
