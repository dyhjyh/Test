package day12._03反射_获取Field成员变量;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldDemo {
    @Test
    public void getDeclareFields() {
        Class<?> c = Dog.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());
        }
    }
    
    @Test
    public void getDeclareField() throws Exception {
        Class<?> c = Dog.class;
        Field field = c.getDeclaredField("color");
        System.out.println(field.getName() + "===>" + field.getType());
    }
}
