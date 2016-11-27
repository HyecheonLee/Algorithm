package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 7..
 */
public class problem11055 {
    static int[] row;
    static long[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        row = new int[N];
        for (int i = 0; i < N; i++) {
            row[i] = scanner.nextInt();
        }
        dp = new long[N];
        for (int i = 0; i < N; i++) {
            dp[i] = row[i];
            for (int j = 0; j < i; j++) {
                if (row[j] < row[i] && dp[j] + row[i] > dp[i]) {
                    dp[i] = dp[j] + row[i];
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (int) Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}

