package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Collection集合的5种遍历方式
        Collection<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
    
        // 001:
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    
        // 002:
        for (String s : list) {
            System.out.println(s);
        }
        
        // 003:
        list.forEach(s -> {
            System.out.println(s);
        });
        
        // 004:
        list.forEach(s -> System.out.println(s));
        
        // 005:
        list.forEach(System.out::println);
    
        // 006:(只能用与List类型的集合)
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i)); // 报错
        }
    }
}
