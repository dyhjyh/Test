package day4;

public class RegexDemo01 {
    public static void main(String[] args) {
        System.out.println(checkTell("18178706612"));
    }
    
    public static boolean checkTell(String number) {
        return number.matches("1[0-9]{10}");
    }
}
