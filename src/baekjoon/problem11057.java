package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 6..
 */
public class problem11057 {
    static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;
        dp = new long[N + 1][10];
        for (int i = 0; i <= 9; i++) {
            sum += incrementNum(N - 1, i);
        }

        System.out.println(sum % 10007);
    }

    private static long incrementNum(int n, int i) {
        if (i < 0) return 0;
        if (n == 0) {
            dp[n][i] = 1;
            return 1;
        }
        if (n == 1) {
            return dp[n][i] = i + 1;
        } else {
            if (dp[n][i] != 0) return dp[n][i];
            long temp = 0;
            for (int j = 0; j <= i; j++) {
                temp += incrementNum(n - 1, i - j);
            }
            dp[n][i] = temp % 10007;
            return dp[n][i];
        }
    }
}
