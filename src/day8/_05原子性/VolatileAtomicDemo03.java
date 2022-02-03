package day8._05原子性;

import java.util.concurrent.atomic.AtomicInteger;

//002:使用原子类
public class VolatileAtomicDemo03 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable03();
        for (int i = 0; i < 1000; i++) {
            new Thread(runnable).start();
        }
    }
}

class MyRunnable03 implements Runnable {
    private final AtomicInteger atomicInteger = new AtomicInteger();
    
    @Override
    public void run() {
        synchronized ("DYH") {
            for (int i = 0; i < 1000; i++) {
                System.out.println("count============>" + atomicInteger.incrementAndGet());
            }
        }
    }
}