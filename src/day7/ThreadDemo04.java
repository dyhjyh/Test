package day7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo04 {
    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    
        try {
            System.out.println("子线程的返回值为" + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
    }
}

class MyCallable implements Callable<Integer> {
    
    @Override
    public Integer call() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
            Thread.sleep(100);
        }
        return 100;
    }
}
