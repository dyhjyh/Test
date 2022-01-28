package day5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<People> hashSet = new HashSet<>();
        hashSet.add(new People("DYH", 18, 10000));
        hashSet.add(new People("XZJ", 17, 8500));
        hashSet.add(new People("SXL", 19, 6325));
        hashSet.add(new People("HHB", 20, 15230));
    
        System.out.println(hashSet);
        
        Set<People> treeSet = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        treeSet.add(new People("DYH", 18, 10000.2));
        treeSet.add(new People("XZJ", 17, 8500.6));
        treeSet.add(new People("SXL", 19, 6325.5));
        treeSet.add(new People("HHB", 20, 15230.4));
    
        System.out.println(treeSet);
        
        
    }
}
