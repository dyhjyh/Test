package day8._06并发包;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo01 {
//    public static Map<String, String> map = new HashMap<>(); //线程不安全
//    public static Map<String, String> map = new Hashtable<>(); //线程安全，但性能较差（锁整个集合）
    public static Map<String, String> map = new ConcurrentHashMap<>(); //线程安全且性能很好（分段式锁）
    
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        System.out.println(map.size());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            ConcurrentMapDemo01.map.put(Thread.currentThread().getName() + i, Thread.currentThread().getName() + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "=====>" + (end - start) + "ms");
    }
}
