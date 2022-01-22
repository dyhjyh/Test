package Day1;

public class ExtendsDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new People();
        Animal a3 = new Boy();
//        System.out.println(people.getName());
//        System.out.println(people instanceof People);
//        select(a1);
        select(a2);
        select(a3);
        
        
    }
    
    public static void select(Animal animal) {
        System.out.println(animal.getName());
        if (!(animal instanceof Animal)) {
            Animal b1 = animal;
            b1.run();
        } else if (animal instanceof People b2) {
            b2.think();
        } else if (animal instanceof Boy b3) {
            b3.hhh();
        }
    }
}

class Animal {
    protected String name = "Animal";
    
    public String getName() {
        return name;
    }
    
    public void run() {
        System.out.println("Animal can run.");
    }
}

class People extends Animal{
    protected String name = "People";
    
    @Override
    public String getName() {
        return name;
    }
    
    public void think() {
        System.out.println("People can think.");
    }
}

class Boy extends Animal{
    protected String name = "Boy";
    
    @Override
    public String getName() {
        return name;
    }
    
    public void hhh() {
        System.out.println("Boy hhh.");
    }
}
