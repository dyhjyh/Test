package day12._10元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyTest
public class AnnotationDemo01 {
    @MyTest
    private String name;
    
    @MyTest
    public static void main(@MyTest String[] args) {
    
    }
    
    @MyTest
    public void testRun() {
    
    }
}

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})  // 申明只能注解方法、类（或接口）、成员变量、方法参数（形参）
@Retention(RetentionPolicy.RUNTIME)  // 申明注解从写代码一直到运行还在，永远存活!
@interface MyTest {

}