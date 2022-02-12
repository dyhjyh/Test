package day10._07序列化;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;
    
    private String name;
    private transient String password;
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
