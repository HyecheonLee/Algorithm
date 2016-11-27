package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 7..
 */
public class problem2631 {
    static int[] row;
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        row = new int[N];
        for (int i = 0; i < N; i++) {
            row[i] = scanner.nextInt();
        }
        dp = new int[N];
        int max = 0;
        int temp;
        for (int i = N - 1; i >= 0; i--) {
            temp = LIS(i);
            max = max > temp ? max : temp;
        }
        System.out.println(N - max);
    }

    private static int LIS(int n) {
        if (n == 0) {
            dp[n] = 1;
            return dp[n];
        } else {
            int temp = 0;
            int max = 1;
            if (dp[n] != 0) return dp[n];
            for (int i = 1; i <= n; i++) {
                if (row[n] - row[n - i] > 0) {
                    temp = LIS(n - i) + 1;
                }
                max = max > temp ? max : temp;
            }
            dp[n] = max;
            return max;
        }
    }
}
