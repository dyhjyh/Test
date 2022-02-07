package day9._05递归;

/**
 * 1-n的和
 * 1+2+3+4+...+n
 * f(n) = f(n-1) + n
 * 终止点: f(1) = 1
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    
    private static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + n;
        }
    }
    
    //死循环递归（最终会栈内存溢出而报错）
//    private static int f(int n) {
//        return f(9);
//    }
}
