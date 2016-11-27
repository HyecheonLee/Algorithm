package baekjoon;

import java.util.Scanner;

public class problem2098 {
    static int[][] W;
    static int N;
    static int bitSet;
    static int[][] dp;
    static int maxValue = (int) 1e9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                W[i][j] = scanner.nextInt();
            }
        }
        bitSet = (1 << N) - 1;
        dp = new int[bitSet + 1][N];
        System.out.println(f(1, 0));
    }

    static int f(int x, int y) {
        if (x == (1 << N) - 1) return W[y][0] != 0 ? W[y][0] : maxValue;
        if (dp[x][y] == 0) {
            dp[x][y] = maxValue;
            for (int i = 0; i < N; i++)
                if (W[y][i] != 0 && ((x & 1 << i) == 0))
                    dp[x][y] = Math.min(dp[x][y], f(x | 1 << i, i) + W[y][i]);
        }
        return dp[x][y];
    }
}