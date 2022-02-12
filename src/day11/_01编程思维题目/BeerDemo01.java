package day11._01编程思维题目;

/**
 * 非规律化递归问题。
 *
 * 啤酒问题：啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶。
 */
public class BeerDemo01 {
    private static int totalNumber;
    private static int lastPingZiNumber;
    private static int lastGaiZiNumber;
    
    public static void main(String[] args) {
        buyBeer(103);
        System.out.println(totalNumber);
    }
    
    public static void buyBeer(int money) {
        int number = money / 2;
        totalNumber += number;
        //int lastMoney = money % 2;
        
        int currentPingZiNumber = lastPingZiNumber + number;
        int currentGaiZiNumber = lastGaiZiNumber + number;
        
        int totalMoney = 0;
        totalMoney += (currentPingZiNumber / 2) * 2;
        lastPingZiNumber = currentPingZiNumber % 2;
        totalMoney += (currentPingZiNumber / 4) * 2;
        lastGaiZiNumber = currentGaiZiNumber % 4;
        
        if(totalMoney >= 2) {
            buyBeer(totalMoney/* + lastMoney*/);
        }
    }
}


