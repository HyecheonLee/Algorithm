package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem1699 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new int[N + 1];

        System.out.println(search(N));
    }

    private static int search(int n) {
        if (n == 0) {
            dp[0] = 0;
            return dp[0];
        }
        if (n == 1) {
            dp[n] = 1;
            return dp[n];
        }
        int temp = 100000;
        if (dp[n] != 0) return dp[n];
        for (int i = 1; n >= i * i; i++) {
            temp = temp < search(n - i * i) + 1 ? temp : search(n - i * i) + 1;
        }
        dp[n] = temp;
        return dp[n];
    }
}
