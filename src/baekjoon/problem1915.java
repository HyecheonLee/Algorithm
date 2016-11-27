package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 7..
 */
public class problem1915 {
    static int dp[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        dp = new int[N + 1][M + 1];
        int max = 0;
        for (int i = 1; i <= N; i++) {
            String temp = scanner.next();
            for (int j = 1; j <= M; j++) {
                dp[i][j] = temp.charAt(j - 1) - '0';
                if (dp[i][j] != 0) {
                    int min = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                    dp[i][j] = min + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        System.out.println(max * max);
    }
}
