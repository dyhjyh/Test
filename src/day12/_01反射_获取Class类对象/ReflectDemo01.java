package day12._01反射_获取Class类对象;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 反射的第一步永远是先得到类的Class文件对象: 字节码文件。
        // 1.类名.class
        Class<?> c1 = Student.class;
        System.out.println(c1);
    
        // 2.对象.getClass()
        Student s1 = new Student();
        Class<?> c2 = s1.getClass();
        System.out.println(c2);
    
        // 3.Class.forName("类的全限名")
        // 直接去加载该类的class文件。
        Class<?> c3 = Class.forName("day12._01反射_获取Class类对象.Student");
        System.out.println(c3);
    
        System.out.println(c1.getSimpleName()); // 获取类名本身（简名）
        System.out.println(c1.getName());       // 获取类的全限名
        // Student s2 = (Student) c1.newInstance(); // 调用无参数构造器得到对象，被淘汰了！
    }
}

class Student {

}
