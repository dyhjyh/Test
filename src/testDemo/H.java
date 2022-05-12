package testDemo;

import java.lang.reflect.Field;

public class H {
    private int age = 19;
    private String name = "hhb";
    
    @Override
    public String toString() {
        return "H{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) throws IllegalAccessException {
        
        Class<?> c = H.class;
        H h = new H();
        Field[] fields = c.getDeclaredFields();
        
        for (Field field : fields) {
            Class<?> type = field.getType();
            field.setAccessible(true);
            if (type == int.class) {
                field.set(h, 109);
            } else if (type == String.class) {
                field.set(h, "dyh");
            }
        }
    
        System.out.println(h);
    }
}
