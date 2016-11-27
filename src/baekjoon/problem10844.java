package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 4..
 */
public class problem10844 {
    static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new long[N + 1][10];
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + calculator(N - 1, i)) % 1000000000;
        }
        System.out.println(sum);
    }

    private static long calculator(int n, int i) {
        if (i < 0 || i > 9) return 0;
        if (n == 0) {
            if (i <= 0 || i > 9) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (dp[n][i] != 0) {
                return dp[n][i];
            }
            dp[n][i] = ((calculator(n - 1, i + 1) + calculator(n - 1, i - 1)) % 1000000000);
            return dp[n][i];
        }
    }
}
