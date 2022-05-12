package testDemo;

import java.util.Scanner;

public class sudoku {
    public static boolean check(int[][] b, int x, int y, int num) {                 //判断
        LoopCheck:for (int i = 1; i < b.length; i += 3) {
            for (int j = 1; j < b.length; j += 3) {
                if (x >= i && x < i + 3 && y >= j && y < j + 3) {
                    for (int k = i; k <= i+2; k++)
                        for (int l = j; l <= j+2; l++) if (b[k][l] == num && (k != x && l != y)) return false;
                    for (int k = 1; k < b.length; k++) if (b[k][y] == num && k != x) return false;
                    for (int l = 1; l < b[x].length; l++) if (b[x][l] == num && l != y) return false;
                    break LoopCheck;
                }
            }
        }
        return true;
    }

    public static int changeX(int x, int y) {
        if (y == 1) x = x - 1;
        return x;
    }

    public static int changeY(int y) {
        if (y != 1) y = y - 1;
        else y = 9;
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
            }
        }
        for (int p = 1; p < b.length; p++) {                                 //打印 p,q
            for (int q = 1; q < b[p].length; q++) {
                System.out.print(b[p][q] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int x, y;
        int num;
        for (x = 1; x < b.length; x++) {
            for (y = 1; y < b[x].length; y++) {
                if (a[x][y] != 0) continue;
                Loop:
                for (num = b[x][y] + 1; num < 10; num++) {
                    if (sudoku.check(b, x, y, num)) {
                        b[x][y] = num;
                        /*for (int p = 1; p < b.length; p++) {                 //打印 p,q
                            for (int q = 1; q < b[p].length; q++) {
                                System.out.print(b[p][q] + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println();*/
                        break;
                    }
                    if (num == 9) {
                        while (x > 0 && y > 0) {
                            b[x][y]=a[x][y];
                            x = changeX(x, y);
                            y = changeY(y);
                            if (b[x][y] == 9 && a[x][y] == 0) b[x][y] = 0;
                            else if (b[x][y] != 9 && a[x][y] == 0) {
                                x = changeX(x, y);
                                y = changeY(y);
                                break Loop;
                            }
                        }
                    }
                }
            }
        }
        for (int p = 1; p < b.length; p++) {                                    //打印 p,q
            for (int q = 1; q < b[p].length; q++) {
                System.out.print(b[p][q] + "\t");
            }
            System.out.println();
        }
    }
}
