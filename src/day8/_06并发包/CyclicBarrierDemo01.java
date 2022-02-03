package day8._06并发包;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo01 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Meeting());
        for (int i = 1; i <= 9; i++) {
            new Employee("员工" + i, cyclicBarrier).start();
        }
    }
}

class Meeting implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "会议现在开始!");
    }
}

class Employee extends Thread {
    private final CyclicBarrier cyclicBarrier;
    
    public Employee(String name, CyclicBarrier cyclicBarrier) {
        super(name);
        this.cyclicBarrier = cyclicBarrier;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "进入会议室");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
