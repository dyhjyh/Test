package day11._03UDP通信;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo01 {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        DatagramSocket socket = new DatagramSocket(8998);
        socket.receive(packet);
        
        String rs = new String(packet.getData(), 0, packet.getLength());
        System.out.println(rs);
        System.out.println(packet.getAddress().getHostAddress() + "-------" + packet.getPort());
    
        socket.close();
    }
}
