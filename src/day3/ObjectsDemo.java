package day3;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student student1 = new Student("123", 18, '1');
        Student student2 = new Student("123", 18, '1');
        System.out.println(student1.equals(student2));
        System.out.println(student1 == student2);
        System.out.println(student1);
    }
}

class Student {
    private String name;
    private int age;
    private char sex;
    
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }
    
    
}
