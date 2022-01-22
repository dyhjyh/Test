package Day1._01知识回顾;

public class CodeDemo01 {
    {
        System.out.println(1);
    }
    
    static {
        System.out.println(2);
    }
    
    public CodeDemo01() {
        System.out.println(3);
    }
    
    public static void main(String[] args) {
        System.out.println(4);
        new CodeDemo01();
    }
}
