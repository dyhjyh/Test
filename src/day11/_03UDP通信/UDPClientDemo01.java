package day11._03UDP通信;

import java.io.IOException;
import java.net.*;

public class UDPClientDemo01 {
    public static void main(String[] args) throws IOException {
        byte[] buffer = "嘿￥￥嘿 %%% 6&&嘿8（（*&……*&*R%$#%^几 点   几   @@##第四季apple".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, InetAddress.getLocalHost(), 8998);
        DatagramSocket socket = new DatagramSocket();
        
        socket.send(packet);
        socket.close();
    }
}
