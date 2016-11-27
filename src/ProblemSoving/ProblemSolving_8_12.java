package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 28..
 */
public class ProblemSolving_8_12 {
    static int[] dp;
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            dp = new int[N + 1];
            System.out.println(asymmetric(N));

        }
    }

    private static int asymmetric(int n) {
        if (n % 2 == 1) {
            return ((tiling(n) - tiling(n / 2)) + MOD) % MOD;
        }
        int temp = tiling(n);
        temp = (temp - tiling(n / 2) + MOD) % MOD;
        temp = (temp - tiling(n / 2 - 1) + MOD) % MOD;
        return temp;
    }

    private static int tiling(int i) {
        if (dp[i] != 0) return dp[i];
        if (i == 0 || i == 1) {
            return dp[i] = 1;
        }
        return dp[i] = (tiling(i - 1) + tiling(i - 2)) % MOD;
    }
}
