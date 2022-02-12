package day12._02反射_获取Constructor构造器;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class TestStudent {
    @Test
    public void getConstructors() {
        Class<?> c = Student.class;
    
        Constructor<?>[] cons = c.getConstructors();
    
        for (Constructor<?> con : cons) {
            System.out.println(con.getName() + "===>" + con.getParameterCount());
        }
    }
    
    @Test
    public void getDeclaredConstructors() {
        Class<?> c = Student.class;
        
        Constructor<?>[] cons = c.getDeclaredConstructors();
        
        for (Constructor<?> con : cons) {
            System.out.println(con.getName() + "===>" + con.getParameterCount());
        }
    }
    
    @Test
    public void getConstructor() throws NoSuchMethodException {
        Class<?> c = Student.class;
        
        Constructor<?> con = c.getConstructor(String.class, int.class);
        
        System.out.println(con.getName() + "===>" + con.getParameterCount());
        
    }
    
    @Test
    public void getDeclaredConstructor() throws NoSuchMethodException {
        Class<?> c = Student.class;
        
        Constructor<?> con = c.getDeclaredConstructor();
        
        System.out.println(con.getName() + "===>" + con.getParameterCount());
    }
}
