package day12._02反射_获取Constructor构造器;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestStudent02 {
    // 反射无参数构造器
    @Test
    public void createObject01() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Student.class;
        Constructor<?> constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true); // 暴力打开私有构造器的访问权限
        Student student = (Student) constructor.newInstance();
        System.out.println(student);
    }
    
    // 反射有参数构造器
    @Test
    public void createObject02() throws Exception {
        Class<?> c = Student.class;
        Constructor<?> constructor = c.getDeclaredConstructor(String.class, int.class);
        Student student = (Student) constructor.newInstance("小明", 1000);
        System.out.println(student);
    }
}
