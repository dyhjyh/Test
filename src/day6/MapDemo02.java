package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("HHB", 1);
        map.put("DYH", 2);
        map.put("DYH", 3);
        map.put("XZJ", 2);
        
        //遍历的3种方法
        //001:键找值
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------");
        //002:键值对
        Set<Map.Entry<String, Integer>> elements = map.entrySet();
        for (Map.Entry<String, Integer> ele : elements) {
            String key = ele.getKey();
            Integer value = ele.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------");
        //003:lambda表达式
        map.forEach((K, V) -> System.out.println(K + "=" + V));
        System.out.println("--------------------");
        //004:lambda语句
        map.forEach((K, V) -> {
            System.out.println(K + "=" + V);
        });
    }
}
