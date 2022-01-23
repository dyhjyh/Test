package day2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            class Inner {
                private String name;
                private static double age;
                static class Inner2 {
                    static {
                        System.out.println(age);
                    }
                }
            }
        }
    }
}
