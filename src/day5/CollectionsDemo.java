package day5;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Collections.addAll(list, 5.2, 6.3, 4.9, 10.23);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        List<Animal> animalList = new ArrayList<>();
        Animal a1 = new Animal("猴子", 8, 'a');
        Animal a2 = new Animal("猪", 6, 'b');
        Animal a3 = new Animal("猫", 7, 'a');
        Collections.addAll(animalList, a1, a2, a3);
        Collections.sort(animalList, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(animalList);
    }
}

class Animal implements Comparable<Animal>{
    private final String name;
    private final int age;
    private final char sex;
    
    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && sex == animal.sex && Objects.equals(name, animal.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
    
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}' + "\n";
    }
    
    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }
}
