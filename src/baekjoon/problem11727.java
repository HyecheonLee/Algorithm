package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem11727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] dp = new long[N + 2];
        dp[0] = 1;
        dp[1] = 3;
        for (int i = 2; i < N; i++) {
            dp[i] = (dp[i - 1] + (2 * dp[i - 2])) % 10007;
        }
        System.out.println(dp[N - 1]);
    }
}
