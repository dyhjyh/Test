package testDemo;

public class SwapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("DYH", 18);
        Student s2 = new Student("HHB", 19);
        swap(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
    }
    
    public static void swap(Student s1, Student s2) {
    
    }
}

class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}