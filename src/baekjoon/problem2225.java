package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 9..
 */
public class problem2225 {
    static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        dp = new long[N + 1][K + 1];
        for (int i = 0; i < N; i++) {
            dp[i][1] = 1;
        }
        System.out.println(sumDivide(N, K));
    }

    private static long sumDivide(int n, int k) {
        if (k == 0) {
            if (n == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (dp[n][k] != 0) return dp[n][k];
            else {
                for (int i = n; i >= 0; i--) {
                    dp[n][k] += sumDivide(n - i, k - 1);
                    dp[n][k] %= 1000000000;
                }
                return dp[n][k];
            }
        }
    }
}
