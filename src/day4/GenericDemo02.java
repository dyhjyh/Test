package day4;

import java.util.ArrayList;

public class GenericDemo02 {
    public static void main(String[] args) {
        ArrayList<BaoMa> bms = new ArrayList<>();
        bms.add(new BaoMa());
        arrayToString(bms);
        
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        //arrayToString(dogs);
    }
    
    public static void arrayToString(ArrayList<? extends Car> bm) {
    
    }
}

class Car {

}

class BaoMa extends Car{

}

class Dog {

}
