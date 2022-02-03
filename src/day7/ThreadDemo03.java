package day7;

public class ThreadDemo03 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        
        Thread t1 = new Thread(r1, "001");
        t1.start();
        
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "==>" + i);
                }
            }
        };
        
        Thread t2 = new Thread(r2, "002");
        t2.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}

class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
