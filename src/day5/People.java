package day5;

public class People implements Comparable<People>{
    private final String name;
    private final int age;
    private final double salary;
    
    public People(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "[name = " + name + ", age = " + age + ", salary = " + salary + "]";
    }
    
    @Override
    public int compareTo(People o) {
        return this.age - o.age;
    }
}
