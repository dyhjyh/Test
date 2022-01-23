package testDemo;

public class A {
    
    public String login(String user, String password) {
        if (user.equals("admin") && password.equals("123456")) {
            return "success";
        }
        return "fail";
    }
}
