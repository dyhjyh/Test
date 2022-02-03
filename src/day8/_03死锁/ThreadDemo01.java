package day8._03死锁;

public class ThreadDemo01 {
    
    private static final Object resource01 = new Object();
    private static final Object resource02 = new Object();
    
    public static void main(String[] args) {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource01) {
                    System.out.println("线程1抢占资源1，请求资源2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource02) {
                        System.out.println("线程1抢占资源2成功!");
                    }
                }
            }
        }).start();
        
        new Thread(() -> {
            synchronized (resource02) {
                System.out.println("线程2抢占资源2，请求资源1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource01) {
                    System.out.println("线程抢占资源1成功!");
                }
            }
        }).start();
    }
}
