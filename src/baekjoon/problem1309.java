package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem1309 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 3;
        int temp = counter(N);
        System.out.println(temp);
    }

    private static int counter(int n) {
        if (n < 0) return 0;
        if (dp[n] != 0) return dp[n];
        dp[n] = (counter(n - 1) * 2 + counter(n - 2)) % 9901;
        return dp[n];
    }
}
