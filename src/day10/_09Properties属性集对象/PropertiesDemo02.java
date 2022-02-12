package day10._09Properties属性集对象;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        //实际为一个map集合
        Properties properties = new Properties();
        System.out.println(properties);
        
        properties.load(new FileInputStream("src/day10/users.properties"));
        System.out.println(properties);
    
        System.out.println(properties.getProperty("admin"));
        System.out.println(properties.getProperty("DYH"));
    
        System.out.println(properties.getProperty("as"));
    }
}
