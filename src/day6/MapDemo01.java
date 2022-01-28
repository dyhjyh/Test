package day6;

import java.util.*;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<Double, String> map = new HashMap<>();
        map.put(5.0, "4");
        map.put(10.59, "5");
        map.put(4.9, "9");
        System.out.println(map);
        System.out.println(map.get(6.9));
    
        Set<Double> sets = map.keySet();
        System.out.println(sets);
    
        Collection<String> list = map.values();
        System.out.println(list);
    }
}
