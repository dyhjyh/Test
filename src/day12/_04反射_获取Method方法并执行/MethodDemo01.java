package day12._04反射_获取Method方法并执行;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class MethodDemo01 {
    @Test
    public void getDeclaredMethods() {
        Class<?> c = Dog.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "===>" + method.getParameterCount() + "===>" + method.getReturnType());
        }
    }
    
    @Test
    public void getDeclaredMethod() throws Exception {
        Class<?> c = Dog.class;
        Method runMethod = c.getDeclaredMethod("eat", String.class);
        runMethod.setAccessible(true);
        Dog dog = new Dog();
        Object rs = runMethod.invoke(dog, "骨头"); // 返回对象方法的返回值.
        // 如果方法没有返回值, 则返回null
        System.out.println(rs);
    }
}
