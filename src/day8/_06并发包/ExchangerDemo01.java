package day8._06并发包;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExchangerDemo01 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Boy(exchanger).start();
        new Girl(exchanger).start();
    }
}

class Boy extends Thread {
    private final Exchanger<String> exchanger;
    
    public Boy(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("男孩开始制作定情信物:🔒");
            Thread.sleep(2000);
            System.out.println("男孩的定情信物制作完毕，准备与女孩交换");
            String result = exchanger.exchange("🔒", 5, TimeUnit.SECONDS);
            System.out.println("男孩收到女孩的信物:" + result);
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}

class Girl extends Thread {
    private final Exchanger<String> exchanger;
    
    public Girl(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("女孩开始制作定情信物:🔑");
            Thread.sleep(7000);
            System.out.println("女孩的定情信物制作完毕，准备与男孩交换");
            String result = exchanger.exchange("🔑");
            System.out.println("女孩收到男孩的信物:" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
