package day8._01线程通信;

public class DrawThread extends Thread {
    private Account account;
    
    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                account.drawMoney(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
