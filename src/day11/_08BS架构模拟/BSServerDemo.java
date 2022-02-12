package day11._08BS架构模拟;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 之前客户端和服务端都需要自己开发，也就是CS架构。
 *
 * BS架构：
 *      客户端：浏览器。（无需开发）
 *      服务端：自己开发。
 *      需求：在浏览器中请求本程序，响应一个网页文字给浏览器显示。
 */
public class BSServerDemo {
    public static void main(String[] args) {
        try {
            // 1.注册端口
            ServerSocket ss = new ServerSocket(8080);
            // 2.创建一个循环接收多个客户端的请求
            while (true) {
                Socket socket = ss.accept();
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ServerReaderThread extends Thread {
    private Socket socket;
    
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        // 响应消息给浏览器显示。
        // 浏览器是基于HTTP协议通信! 响应格式必须满足HTTP数据格式的要求，浏览器才能识别，否则消息浏览器根本不认识!
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");  // 响应数据的响应头数据!
            ps.println("Content-Type:text/html;charset=UTF-8");  // 响应数据的类型：网页或者文本内容!
            ps.println();  // 必须换一行
            // 以下开始响应真实的数据!!
            ps.println("<span style='color:green;font-size:60px;'>最牛逼的我!</span>");
            Thread.sleep(1000);
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
