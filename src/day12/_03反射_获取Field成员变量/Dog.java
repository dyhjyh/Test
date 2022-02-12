package day12._03反射_获取Field成员变量;

public class Dog {
    private String name;
    private int age;
    private String color;
    public static String school;
    public static final String SCHOOL_1 = "宠物学校";
    
    public Dog() {
    
    }
    
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
