package day7;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println(useFinally());
        try {
            System.out.println("age = " + checkAge(1000));
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println("age = " + checkAge2(1000));
    }
    
    public static int checkAge(int age) throws AgeException {
        if (age < 0 || age > 100) {
            throw new AgeException("年龄有误!");
        }
        return age;
    }
    
    public static int checkAge2(int age) {
        if (age < 0 || age > 100) {
            throw new AgeException2("年龄有误!");
        }
        return age;
    }
    
    public static int useFinally() {
        try {
            System.out.println(1 / 0);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            System.out.println(3);
        }
    }
}

class AgeException extends Exception {
    public AgeException() {
    }
    
    public AgeException(String message) {
        super(message);
    }
}

class AgeException2 extends RuntimeException {
    public AgeException2() {
    }
    
    public AgeException2(String message) {
        super(message);
    }
}
