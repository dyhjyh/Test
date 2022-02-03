package day8._06并发包;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo01 {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(2);
        new ThreadA(cdl).start();
        new ThreadB(cdl).start();
    }
}

class ThreadA extends Thread {
    private CountDownLatch cdl;
    
    public ThreadA(CountDownLatch cdl) {
        this.cdl = cdl;
    }
    
    @Override
    public void run() {
        System.out.println("A");
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}

class ThreadB extends Thread {
    private CountDownLatch cdl;
    
    public ThreadB(CountDownLatch cdl) {
        this.cdl = cdl;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B");
        cdl.countDown();
        cdl.countDown();
    }
}
