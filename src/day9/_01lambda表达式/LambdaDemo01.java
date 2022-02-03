package day9._01lambda表达式;

public class LambdaDemo01 {
    public static void main(String[] args) {
        Thread t = new Thread(/*此处为Runnable的匿名内部类对象*/() -> System.out.println(Thread.currentThread().getName()));
        t.start();
        
        Runnable r1 = () -> {
            System.out.println(1);
        };
        
        Runnable r2 = (() -> System.out.println(1));
        
        MyInterface m1 = (() -> System.out.println(2));
        
        //lambda 转换的目标类型必须是接口
        //MyAbstractClass mc1 = (() -> System.out.println(3));
    }
}

@FunctionalInterface
interface MyInterface {
    void testA();
}

abstract class MyAbstractClass {
    public abstract void testA();
}
