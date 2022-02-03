package day8._05原子性;

//原子性问题（最后一行输出的结果经常会比1000000小）
public class VolatileAtomicDemo01 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable01();
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
    }
}

class MyRunnable01 implements Runnable {
    private int count;
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("count============>" + count);
        }
    }
}