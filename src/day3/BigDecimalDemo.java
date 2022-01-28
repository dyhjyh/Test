package day3;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);
        
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        double c = c1.doubleValue();
        System.out.println(c);
    }
}
