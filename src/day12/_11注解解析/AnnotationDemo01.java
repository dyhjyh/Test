package day12._11注解解析;

import org.junit.jupiter.api.Test;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo01 {
    @Test
    public void parseClass() {
        Class<?> c = BookStore.class;
        // 判断某个类上是否使用了某个注解
        if (c.isAnnotationPresent(Book.class)) {
            //获取这个注解对象
            Book book = c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
    
    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class<?> c = BookStore.class;
        Method run = c.getDeclaredMethod("run");
        // 判断某个类上是否使用了某个注解
        if (run.isAnnotationPresent(Book.class)) {
            //获取这个注解对象
            Book book = run.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}

@Book(value = "《Java基础到精通》", price = 99.5, authors = {"波仔", "波妞"})
class BookStore {
    @Book(value = "《Mybatis持久层框架》", price = 199.5, authors = {"DYH", "XZJ"})
    public void run() {
    
    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    String value();
    double price() default 100;
    String[] authors();
}
