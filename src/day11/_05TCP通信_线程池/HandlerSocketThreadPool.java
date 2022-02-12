package day11._05TCP通信_线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HandlerSocketThreadPool {
    private ExecutorService executor;
    
    public HandlerSocketThreadPool(int maxPoolSize, int queueSize) {
        executor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(queueSize));
    }
    
    public void execute(Runnable task) {
        this.executor.submit(task);
    }
}
