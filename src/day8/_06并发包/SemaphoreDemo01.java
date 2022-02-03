package day8._06并发包;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo01 {
    public static void main(String[] args) {
        Server server = new Server();
        for (int i = 0; i < 5; i++) {
            new MyThread(server).start();
        }
    }
}

class MyThread extends Thread {
    private final Server server;
    
    public MyThread(Server server) {
        this.server = server;
    }
    
    @Override
    public void run() {
        server.testMethod();
    }
}

class Server {
    private final Semaphore semaphore = new Semaphore(2, true);
    
    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "进入 时间:" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "离开 时间:" + System.currentTimeMillis());
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
