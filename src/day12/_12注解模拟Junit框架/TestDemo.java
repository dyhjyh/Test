package day12._12注解模拟Junit框架;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {
    @MyTest
    public void test01() {
        System.out.println("===test01===");
    }
    
    public void test02() {
        System.out.println("===test02===");
    }
    
    @MyTest
    public void test03() {
        System.out.println("===test03===");
    }
    
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestDemo td = new TestDemo();
        Class<?> c = TestDemo.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(td);
            }
        }
    }
}
