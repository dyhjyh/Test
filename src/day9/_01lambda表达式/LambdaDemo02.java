package day9._01lambda表达式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo02 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("小明", 18, '男');
        Student s2 = new Student("小红", 15, '女');
        Student s3 = new Student("小杰", 20, '男');
        Collections.addAll(list, s1, s2, s3);
        Collections.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());
        //或: Collections.sort(list, (Student o1, Student o2) -> o1.getAge() - o2.getAge());
        //或: list.sort(Comparator.comparingInt(Student::getAge));
        System.out.println(list);
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
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}' + "\n";
    }
}
