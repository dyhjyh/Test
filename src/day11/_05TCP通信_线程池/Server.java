package day11._05TCP通信_线程池;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("---服务端启动---");
        
        ServerSocket ss = new ServerSocket(8888);
        
        HandlerSocketThreadPool threadPool = new HandlerSocketThreadPool(3, 100);
        
        
        while (true) {
            Socket socket = ss.accept(); //等待接收一个客户端的socket管道连接请求
            threadPool.execute(new ReaderClientRunnable(socket));
        }
        
    }
}
