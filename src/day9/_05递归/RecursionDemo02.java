package day9._05递归;

import jdk.jfr.Enabled;

import java.lang.annotation.Native;

/**
 * 计算n的阶乘
 * f(n) = f(n - 1) * n
 * f(1) = 1
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(f(6));
    }
    
    private static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }
}
