package day8._02线程池;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo01 {
    public static void main(String[] args) throws InterruptedException {
//        JOptionPane.showMessageDialog(null, "除夕快乐!", "@You", JOptionPane.INFORMATION_MESSAGE);
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        Runnable runnable = new MyRunnable();
        
        threadPool.submit(runnable);
        threadPool.submit(runnable);
        threadPool.submit(runnable);
        threadPool.submit(runnable);
        
        Thread.sleep(8);
        threadPool.shutdownNow();
        threadPool.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
