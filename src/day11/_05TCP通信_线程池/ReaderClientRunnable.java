package day11._05TCP通信_线程池;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReaderClientRunnable implements Runnable {
    private Socket socket;
    
    public ReaderClientRunnable(Socket socket) {
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
