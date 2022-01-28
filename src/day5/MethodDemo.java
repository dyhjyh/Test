package day5;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(1);
        sum(1, 2, 3, 4);
        sum(new int[]{1, 2, 3, 4, 5});
    }
    
    public static void sum(int...eles) {
        System.out.println(eles.length);
        System.out.println(Arrays.toString(eles));
        int sum = 0;
        for (int ele : eles) {
            sum += ele;
        }
        System.out.println(sum);
        System.out.println("------------------------");
    }
}
