package day8._05原子性;

//001:加锁
public class VolatileAtomicDemo02 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable02();
        for (int i = 0; i < 1000; i++) {
            new Thread(runnable).start();
        }
    }
}

class MyRunnable02 implements Runnable {
    private int count;
    
    @Override
    public void run() {
        synchronized ("DYH") {
            for (int i = 0; i < 1000; i++) {
                count++;
                System.out.println("count============>" + count);
            }
        }
    }
}
