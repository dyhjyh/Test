package day7;

public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.setName("1号线程");
//        System.out.println(thread1.getName());
        thread1.start();
    
        Thread thread2 = new MyThread("2号线程");
        thread2.start();
        
//        Thread main = Thread.currentThread();
//        System.out.println(main.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            System.out.println(Thread.currentThread().getName() + ":" + i);
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class MyThread extends Thread {
    
    public MyThread() {
        super();
    }
    
    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ":" + i);
            System.out.println(super.getName() + ":" + i);
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
