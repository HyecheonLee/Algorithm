package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem2448 {

    static String[] template = {
            "  *  ",
            " * * ",
            "*****"};
    static StringBuilder[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new StringBuilder[N][N];
        makeStart(N / 3);
        for (int i = 0; i < N; i++) {
            System.out.println(dp[N / 3][i]);
        }

    }

    private static StringBuilder[] makeStart(int n) {
        if (n == 1) {
            StringBuilder[] builders = new StringBuilder[3];
            for (int i = 0; i < 3; i++) {
                builders[i] = new StringBuilder();
                builders[i].append(template[i]);
            }
            dp[n] = builders;
            return dp[n];
        } else {
            if (dp[n][0] != null) {
                return dp[n];
            }
            StringBuilder[] builders = new StringBuilder[n * 3];
            StringBuilder[] preTemplate = makeStart(n / 2);
            for (int i = 0; i < (n / 2) * 3; i++) {
                builders[i] = new StringBuilder();
                for (int j = 0; j < (n / 2) * 3; j++) {
                    builders[i].append(" ");
                }
                builders[i].append(preTemplate[i]);
                for (int j = 0; j < (n / 2) * 3; j++) {
                    builders[i].append(" ");
                }
            }
            for (int i = (n / 2) * 3; i < n * 3; i++) {
                builders[i] = new StringBuilder();
                builders[i].append(preTemplate[i - (n / 2) * 3]);
                builders[i].append(" ");
                builders[i].append(preTemplate[i - (n / 2) * 3]);
            }
            dp[n] = builders;
            return dp[n];
        }
    }
}
