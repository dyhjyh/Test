package day12._03反射_获取Field成员变量;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldDemo02 {
    @Test
    public void setField() throws Exception {
        Class<?> c = Dog.class;
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);  // 暴力反射!!
        
        Dog dog = new Dog();
        nameField.set(dog, "狗仔");
        System.out.println(dog);
        
        String value = nameField.get(dog) + "";
        System.out.println(value);
    }
}
