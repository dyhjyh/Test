package day3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        System.out.println(sdf.format(date));
        
        long time = date.getTime() + 43200 * 1000;
    
        System.out.println(sdf.format(time));
    }
}
