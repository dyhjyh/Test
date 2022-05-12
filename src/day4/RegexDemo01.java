package day4;

public class RegexDemo01 {
    public static void main(String[] args) {
        System.out.println(checkTell("18178706612"));
        System.out.println(checkIdCard("42092119950615051#"));
    }
    
    public static boolean checkTell(String number) {
        return number.matches("1[0-9]{10}");
    }
    
    public static boolean checkIdCard(String idCard) {
        return idCard.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}[\\d|#]$") ||
                idCard.matches("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$");
    }
    
}
