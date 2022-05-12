package test;

/**
 * 证明java值传递demo
 *
 * @author miao
 */
public class PassValueDemo {
    
    public static void main(String[] args) {
        
        int a = 1;
        String str = "1";
        User user = new User("阿花", 6);
        
        System.out.println("调用方法前a为：" + a);
        System.out.println("调用方法前str为：" + str);
        System.out.println("调用方法前user为：" + user);
        
        System.out.println("------------------------------------------");
        convert(a, str, user);
        System.out.println("------------------------------------------");
        
        System.out.println("调用方法后a为：" + a);
        System.out.println("调用方法后str为：" + str);
        System.out.println("调用方法后user为：" + user);
    }
    
    private static void convert(int a, String str, User user) {
        a = 2;
        str = "2";
        user = new User("小美", 18);
        user.setAge(9);
        user.setUsername("大壮");
        
        System.out.println("调用方法中a为：" + a);
        System.out.println("调用方法中str为：" + str);
        System.out.println("调用方法中user为：" + user);
    }
    
}

/**
 * @author miao
 */
class User {
    
    public String username;
    
    public int age;
    
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

