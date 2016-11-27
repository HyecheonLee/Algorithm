package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem11060 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            int k = num[i];
            for (int j = i + 1; j <= i + k; j++) {
                if (j >= n) break;
                if (dp[j] == 0 && dp[i] != 0 || i == 0) {
                    dp[j] = dp[i] + 1;
                } else {
                    if (dp[j] > dp[i] + 1) {
                        dp[j] = dp[i] + 1;
                    }
                }
            }
        }
        if (dp[n - 1] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n - 1]);
        }
    }
}
