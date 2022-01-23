package day1._01知识回顾;

public class InterfaceDemo01 {
    public static void main(String[] args) {
        Test test = new Test();
        test.play();
    }
}

class Test implements A, B{
    
    @Override
    public void run() {
    
    }
    
    @Override
    public void play() {
        A.super.play();
        B.super.play();
    }
}

interface A {
    void run();
    
    default void play() {
        System.out.println("play");
    }

    static void game() {
        System.out.println("game");
    }

    private void hello() {
        System.out.println("hello");
    }
}

interface B {
    void run();

    default void play() {
        System.out.println("play-2");
    }

    static void game() {
        System.out.println("game-2");
    }

    private void hello() {
        System.out.println("hello-2");
    }
}
