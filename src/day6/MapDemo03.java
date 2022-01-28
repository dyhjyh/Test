package day6;

import java.util.*;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<Pig, String> pigs = new TreeMap<>(new Comparator<Pig>() {
            @Override
            public int compare(Pig o1, Pig o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        pigs.put(new Pig(5, 23.5, "14.5"), "GX\n");
        pigs.put(new Pig(4, 45.5, "54.12"), "GD\n");
        pigs.put(new Pig(8, 458.4, "54"), "CD\n");
        pigs.put(new Pig(8, 458.4, "54"), "CD\n");
        System.out.println(pigs);
        
        Set<Pig> pigs1 = new TreeSet<>();
        pigs1.add(new Pig(5, 23.5, "14.5"));
        pigs1.add(new Pig(4, 45.5, "54.12"));
        pigs1.add(new Pig(8, 458.4, "54"));
        pigs1.add(new Pig(8, 458.4, "54"));
        System.out.println(pigs1);
    }
}

class Pig implements Comparable<Pig> {
    private int age;
    private double price;
    private String weight;
    
    public Pig(int age, double price, String weight) {
        this.age = age;
        this.price = price;
        this.weight = weight;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getWeight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                ", price=" + price +
                ", weight='" + weight + '\'' +
                '}';
    }
    
    @Override
    public int compareTo(Pig o) {
        return Double.compare(this.price, o.price);
    }
}
