package day10._09Properties属性集对象;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        //实际为一个map集合
        Properties properties = new Properties();
        properties.setProperty("admin", "123456");
        properties.setProperty("DYH", "544556");
        System.out.println(properties);
    
        System.out.println(properties.getProperty("admin"));
    
        Set<String> set = properties.stringPropertyNames();
    
        System.out.println(set);
    
        OutputStream os = new FileOutputStream("src/day10/users.properties");
        properties.store(os, "I am very happy!!我快乐的保存了用户数据");
        
        os.close();
    }
}
