package day11._04TCP通信;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("---服务端启动---");
        
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept(); //等待接收一个客户端的socket管道连接请求
            new ServerReadThread(socket).start();
        }
        
    }
}

class ServerReadThread extends Thread {
    private Socket socket;
    
    public ServerReadThread(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            System.out.println(socket.getRemoteSocketAddress() + "接入成功~~~");
            
            InputStream is = socket.getInputStream();
    
            InputStreamReader isr = new InputStreamReader(is);
    
            BufferedReader br = new BufferedReader(isr);
    
            String message;
            while ((message = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + ": " + message);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了~~~~~");
        }
        
    }
}
