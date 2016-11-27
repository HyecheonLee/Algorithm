package baekjoon;

import java.util.Scanner;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] dp = new int[M + 1][N + 1];
            dp[0][0] = 1;
            dp[1][0] = 1;

            for (int i = 1; i <= M; i++) {
                for (int j = 0; j <= N; j++) {
                    if (j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    }
                }
            }
            System.out.println(dp[M][N]);
        }
    }
}
