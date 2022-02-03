package day8._01线程通信;

public class ThreadCommunication {
    public static void main(String[] args) {
        Account account = new Account("AQBQ-001", 0);
        
        new DrawThread("小明", account).start();
        new DrawThread("小红", account).start();
        
        new SaveThread("亲爹", account).start();
        new SaveThread("干爹", account).start();
        new SaveThread("岳父", account).start();
    }
}
