package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 8..
 */
public class problem9084 {
    static int[] coins;
    static int N, M;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            N = scanner.nextInt();
            coins = new int[N];
            for (int i = 0; i < N; i++) {
                coins[i] = scanner.nextInt();
            }
            M = scanner.nextInt();
            dp = new int[M + 1][N + 1];
            int sum = coninCounter(M, N - 1);
            System.out.println(sum);
        }
    }

    private static int coninCounter(int m, int n) {
        if (m == 0) {
            return 1;
        } else if (m < 0 || n < 0) {
            return 0;
        } else {
            if (dp[m][n] != 0) return dp[m][n];
            int temp = 0;
            for (int i = 0; i <= m / coins[n]; i++) {
                temp += coninCounter(m - coins[n] * i, n - 1);
            }
            dp[m][n] = temp;
            return dp[m][n];
        }
    }
}
