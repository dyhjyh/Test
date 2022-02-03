package day9._02方法引用;

import java.util.ArrayList;
import java.util.List;

//实例方法的方法引用（对象::实例方法）
//静态方法的方法引用（类名::静态方法）
public class MethodDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        
        list.forEach(System.out::println);
    }
}
