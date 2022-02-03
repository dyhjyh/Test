package day7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "==>" + i);
                }
                return 101;
            }
        };
        
        Callable<String> callable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "==>" + i);
                Thread.sleep(1);
            }
            return "121";
        };
    
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);
        
        Thread thread1 = new Thread(futureTask, "子线程1");
        Thread thread2 = new Thread(futureTask2, "子线程2");
        
        thread1.start();
        thread2.start();
    
        System.out.println(futureTask.get());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    
        System.out.println(futureTask2.get());
    }
}
