package day2;

public class AnonymityDemo {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };
        cat.run();
        cat.run2();
        
        Computer mouse = new Computer() {
            @Override
            public void run3() {
                System.out.println(3_2);
            }
        };
        mouse.run3();
        
        Human boy = new Human() {
            @Override
            public void run4() {
                System.out.println(4);
            }
        };
        boy.run4();
    }
}

abstract class Animal {
    public abstract void run();
    public void run2() {
        System.out.println(2);
    }
}

class Computer {
    public void run3() {
        System.out.println(3);
    }
}

interface Human {
    void run4();
}
