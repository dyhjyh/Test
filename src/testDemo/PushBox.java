package testDemo;

import java.util.Objects;
import java.util.Scanner;

public class PushBox {
    public static void main(String[] args) {
        int a = 1, b = 1;      //玩家位置
        int c = 6, d = 5;      //目标位置1
        int c1 = 0, d1 = 0;    //目标位置2
        int c2 = 0, d2 = 0;    //目标位置3
        int x = 2, y = 2;      //生成箱子1
        int x1 = 0, y1 = 0;    //生成箱子2
        int x2 = 0, y2 = 0;    //生成箱子3
        int level = 1;         //关卡
        
        while (true) {
            Scanner in = new Scanner(System.in);
            String[][] map = {
                    {"H", "H", "H", "H", "H", "H", "H", "H", "H", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", " ", " ", " ", " ", " ", " ", " ", " ", "H"},
                    {"H", "H", "H", "H", "H", "H", "H", "H", "H", "H"}
            };      //生成围墙
            switch (level) {                                                     //level地图变化
                case 1:
                    map[1][3] = map[2][3] = map[3][3] = map[2][5] = map[3][6] = map[3][5] = map[3][8] = map[4][8] = map[5][4] = map[5][5] = map[5][6] = map[6][4] = "H";   //生成障碍
                    map[7][1] = map[7][2] = map[7][3] = map[7][4] = map[7][5] = map[7][6] = map[7][7] = map[7][8] = "H";
                    a = 1;
                    b = 1;      //玩家位置
                    c = 6;
                    d = 5;      //目标位置1
                    c1 = 0;
                    d1 = 0;    //目标位置2
                    c2 = 0;
                    d2 = 0;    //目标位置3
                    x = 2;
                    y = 2;      //箱子位置1
                    x1 = 0;
                    y1 = 0;    //箱子位置2
                    x2 = 0;
                    y2 = 0;    //箱子位置3
                    map[c][d] = "*";  //生成目标
                    map[x][y] = "o";  //生成箱子
                    map[a][b] = "&";  //生成玩家
                    break;
                case 2:
                    map[1][1] = map[5][1] = map[5][5] = map[1][5] = "H";   //生成障碍
                    map[1][6] = map[2][6] = map[3][6] = map[4][6] = map[5][6] = "H;";
                    map[6][1] = map[6][2] = map[6][3] = map[6][4] = map[6][5] = map[6][6] = map[6][7] = map[6][8] = "H";
                    map[2][3] = "H";
                    a = 3;
                    b = 1;
                    c = 3;
                    d = 3;
                    c1 = 4;
                    d1 = 3;
                    c2 = 5;
                    d2 = 3;
                    x = 3;
                    y = 3;
                    x1 = 3;
                    y1 = 2;
                    x2 = 3;
                    y2 = 4;
                    map[c][d] = "*";  //生成目标
                    map[c1][d1] = "*";
                    map[c2][d2] = "*";
                    map[x][y] = "o";  //生成箱子
                    map[x1][y1] = "o";
                    map[x2][y2] = "o";
                    map[a][b] = "&";  //生成玩家
                    break;
                case 3:
                    break;
            }
            
            Loop:
            do {
                for (int k = 0; k < map.length; k++) {
                    for (int l = 0; l < map[k].length; l++) {
                        System.out.print(map[k][l] + "\t");                       //逐行打印地图
                    }
                    System.out.println();
                }                                                                 //地图刷新
                System.out.println("输入你的指令：");
                char move = in.next().charAt(0);
                switch (move) {                                                   //控制移动
                    case 'w':
                        switch (map[a - 1][b]) {
                            case "*":
                            case " ":
                                map[a - 1][b] = "&";
                                if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                    map[a][b] = "*";
                                } else {
                                    map[a][b] = " ";
                                }
                                a--;
                                break;
                            case "o":
                                if (map[a - 2][b] == " " || Objects.equals(map[a - 2][b], "*")) {
                                    map[a - 2][b] = "o";
                                    map[a - 1][b] = "&";
                                    if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                        map[a][b] = "*";
                                    } else {
                                        map[a][b] = " ";
                                    }
                                    a--;
                                    break;
                                }
                            default:
                                System.out.println("无效移动");
                                break;
                        }
                        break;
                    case 's':
                        switch (map[a + 1][b]) {
                            case "*":
                            case " ":
                                map[a + 1][b] = "&";
                                if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                    map[a][b] = "*";
                                } else {
                                    map[a][b] = " ";
                                }
                                a++;
                                break;
                            case "o":
                                if (map[a + 2][b] == " " || map[a + 2][b] == "*") {
                                    map[a + 2][b] = "o";
                                    map[a + 1][b] = "&";
                                    if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                        map[a][b] = "*";
                                    } else {
                                        map[a][b] = " ";
                                    }
                                    a++;
                                    break;
                                }
                            default:
                                System.out.println("无效移动");
                                break;
                        }
                        break;
                    case 'a':
                        switch (map[a][b - 1]) {
                            case " ":
                            case "*":
                                map[a][b - 1] = "&";
                                if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                    map[a][b] = "*";
                                } else {
                                    map[a][b] = " ";
                                }
                                b--;
                                break;
                            case "o":
                                if (map[a][b - 2] == " " || map[a][b - 2] == "*") {
                                    map[a][b - 2] = "o";
                                    map[a][b - 1] = "&";
                                    if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                        map[a][b] = "*";
                                    } else {
                                        map[a][b] = " ";
                                    }
                                    b--;
                                    break;
                                }
                            default:
                                System.out.println("无效移动");
                                break;
                        }
                        break;
                    case 'd':
                        switch (map[a][b + 1]) {
                            case " ":
                            case "*":
                                map[a][b + 1] = "&";
                                if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                    map[a][b] = "*";
                                } else {
                                    map[a][b] = " ";
                                }
                                b++;
                                break;
                            case "o":
                                if (map[a][b + 2] == " " || map[a][b + 2] == "*") {
                                    map[a][b + 2] = "o";
                                    map[a][b + 1] = "&";
                                    if (a == c && b == d || a == c1 && b == d1 || a == c2 && b == d2) {
                                        map[a][b] = "*";
                                    } else {
                                        map[a][b] = " ";
                                    }
                                    b++;
                                    break;
                                }
                            default:
                                System.out.println("无效移动");
                        }
                        break;
                    case 'r':
                        break Loop;
                    default:
                        System.out.println("重新输入");
                }
                if (map[c][d] == "o" && (map[c1][d1] == "o" || map[c1][d1] == "H") && (map[c1][d1] == "o" || map[c2][d2] == "H")) {
                    System.out.println("通过level" + level);
                    level++;
                    break;
                }
            } while (1 + 1 == 2);
        }
    }
}
