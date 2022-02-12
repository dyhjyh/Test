package day12._07自定义注解;

@Book
@MyTest
public class MyBook {
    @Book
    @MyTest
    private MyBook() {
    
    }
    
    @Book
    @MyTest
    public static void main(@Book @MyTest String[] args) {
        @Book
        @MyTest
        int i = 1;
    }
}

@interface Book {

}

@interface MyTest {

}
