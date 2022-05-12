package testDemo;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.next();
            
            if (s.equals("#")) {
                System.exit(0);
            }
            
            int countA = 0;
            int countE = 0;
            int countI = 0;
            int countO = 0;
            int countU = 0;
    
            for (int i = 0; i < s.length(); i++) {
    
                switch (s.charAt(i)) {
                    case 'a' -> countA++;
                    case 'e' -> countE++;
                    case 'i' -> countI++;
                    case 'o' -> countO++;
                    case 'u' -> countU++;
                }
                
            }
    
            System.out.println("输入字符串中a的个数为:" + countA);
        }
    }
}
