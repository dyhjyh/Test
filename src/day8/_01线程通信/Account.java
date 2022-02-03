package day8._01线程通信;

public class Account {
    private String cardId;
    private double money;
    
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name + "来取钱:" + money + "余额为:" + this.money);
            }
            this.notifyAll();
            this.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public synchronized void saveMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money <= 0) {
                this.money += money;
                System.out.println(name + "来存钱:" + money + "余额为:" + this.money + "=====");
            }
            this.notifyAll();
            this.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
