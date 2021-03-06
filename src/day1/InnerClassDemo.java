package day1;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner.Inner2 outer = new Outer().new Inner().new Inner2();
        Outer2.Inner3.Inner4 outer2 = new Outer2.Inner3.Inner4();
    }
}

class Outer {
    private String name;
    class Inner {
        class Inner2 {
            static {
                System.out.println(1);
            }
            {
                System.out.println(name);
                System.out.println(2);
            }
            public Inner2() {
                System.out.println(3);
            }
        }
        static {
            System.out.println(4);
        }
        {
            System.out.println(5);
        }
        public Inner() {
            System.out.println(6);
        }
    }
    static {
        System.out.println(7);
    }
    {
        System.out.println(8);
    }
    public Outer() {
        System.out.println(9);
    }
}

class Outer2 {
    static class Inner3 {
        static class Inner4 {
            static {
                System.out.println(1);
            }
            {
                System.out.println(2);
            }
            public Inner4() {
                System.out.println(3);
            }
        }
        static {
            System.out.println(4);
        }
        {
            System.out.println(5);
        }
        public Inner3() {
            System.out.println(6);
        }
    }
    static {
        System.out.println(7);
    }
    {
        System.out.println(8);
    }
    public Outer2() {
        System.out.println(9);
    }
}


