package day7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeDemo01 {
    public static void main(String[] args) {
        Account account = new Account("123", 10000);
        
        Thread thread1 = new BankThread("小明", account);
        Thread thread2 = new BankThread("小红", account);
        thread1.start();
        thread2.start();
    }
}

class Account {
    private String cardId;
    private int money;
    private final Lock lock;
    
    public Account(String cardId, int money) {
        this.cardId = cardId;
        this.money = money;
        this.lock = new ReentrantLock();
    }
    
    //002: 🔒方法
    public synchronized void takeMoney(int money) {
        String name = Thread.currentThread().getName();
        System.out.println("当前用户为:" + name);
        
        //001: 用代码块🔒线程（同步代码块）
        synchronized (this) {
            //003: Lock锁
            lock.lock();
            try {
                if (this.money >= money) {
                    System.out.println(name + "的余额为" + this.money);
                    this.money -= money;
                    System.out.println(name + "取钱" + money + "成功，余额为:" + this.money);
                } else {
                    System.out.println(name+ "取钱失败，余额不足，当前余额为:" + this.money);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

class BankThread extends Thread{
    private Account account;
    
    public BankThread(String name, Account account) {
        super(name);
        this.account = account;
    }
    
    @Override
    public void run() {
        account.takeMoney(10000);
    }
}
