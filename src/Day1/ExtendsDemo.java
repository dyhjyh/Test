package Day1;

public class ExtendsDemo {
    public static void main(String[] args) {
        Animal boy = new Boy();
        System.out.println(boy.getName());
    }
}

class Animal {
    protected String name = "Animal";
    
    public String getName() {
        return name;
    }
}

class People extends Animal{
    protected String name = "People";
    
    @Override
    public String getName() {
        return name;
    }
}

class Boy extends People{
    protected String name = "Boy";
    
    @Override
    public String getName() {
        return super.name;
    }
}
