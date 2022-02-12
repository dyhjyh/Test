package day12._08注解的属性;

@MyBook(name = "DYH's book", authors = {"DYH", "XZJ"}, price = 99.9)
public class AnnotationDemo01 {
    @MyBook(name = "DYH's book", authors = {"DYH", "XZJ"}, address = "广西", price = 99.8)
    public static void main(String[] args) {
    
    }
}

@interface MyBook {
    String name();
    String[] authors();
    double price();
    String address() default "广州";
}
