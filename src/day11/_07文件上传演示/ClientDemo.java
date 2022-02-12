package day11._07文件上传演示;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static final String SRC_IMAGE = "D:\\Users\\DYH\\Videos\\God of War\\God of War Screenshot 2022.02.09 - 15.38.29.74.png";
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.9", 7777);
    
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
    
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SRC_IMAGE));
        
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.flush();
        bis.close();
        socket.shutdownOutput(); //告知服务端数据已经发送完毕，不要再等了。
        System.out.println("客户端传输图片数据完毕!!");
        
        //接受服务端的响应消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
        System.out.println(br.readLine());
    }
}
