package day11._05TCP通信_线程池;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("---客户端启动---");
        
        Socket socket = new Socket("127.0.0.1", 8888);
        
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            ps.println(sc.nextLine());
            ps.flush();
        }
    }
}
