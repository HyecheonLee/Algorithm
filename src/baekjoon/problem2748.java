package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem2748 {
    static long[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new long[N + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[N]);
    }
}
