package day8._04volatile关键字;

public class VolatileDemo01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        while (true) {
//            Thread.sleep(1);
//            synchronized (VolatileDemo01.class) {
                if (t.isFlag()) {
                    System.out.println("主线程已经运行到这啦~~~~~~");
                }
//            }
        }
    }
}

class MyThread extends Thread {
    private boolean flag = false;
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = " + flag);
    }
    
    public boolean isFlag() {
        return flag;
    }
}
