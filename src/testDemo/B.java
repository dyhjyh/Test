package testDemo;

public class B {
    public static void main(String[] args) {
        int[][] a = new int[10][];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 10 - i; j++) {
                a[i][j] = 1 + i * j;
            }
        }
    }
}
