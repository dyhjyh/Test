package day11._07文件上传演示;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static final String DEST_SRC = "D:\\Users\\DYH\\Desktop\\图片服务器\\";
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        
        while (true) {
            new ReaderThread(ss.accept()).start();
        }
    }
}

class ReaderThread extends Thread {
    private Socket socket;
    
    public ReaderThread(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try (BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ServerDemo.DEST_SRC + UUID.randomUUID() + ".png"));
             PrintStream ps = new PrintStream(socket.getOutputStream())) {
            
            System.out.println(socket.getRemoteSocketAddress() + "上线了!!");
            
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) { //若客户端没有将output管道shutdown，则此处不会返回-1，而会一直等待客户端的消息
                bos.write(buffer, 0, len);
            }
            bos.flush();
            
            ps.println("服务端已经收到了图片!!");
            ps.flush();
            Thread.sleep(200);
            
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了!!");
        }
    }
}


