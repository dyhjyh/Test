package day11._02InetAddress类;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo01 {
    public static void main(String[] args) throws IOException {
    
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());
        System.out.println("-------------------");
        
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.println("-------------------");
        
        InetAddress ip3 = InetAddress.getByName("www.google.com");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        System.out.println("-------------------");
    
        System.out.println(ip2.isReachable(5000));
        System.out.println(ip3.isReachable(5000));
    
    }
}
