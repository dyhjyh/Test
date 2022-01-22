package Day1;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner.Inner2 outer = new Outer.Inner.Inner2();
    }
}

class Outer {
    static class Inner {
        static class Inner2 {
            static {
                System.out.println(1);
            }
            
            public Inner2() {
                System.out.println(2);
            }
        }
    }
}
