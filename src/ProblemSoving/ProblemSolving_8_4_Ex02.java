package ProblemSoving;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 26..
 */
public class ProblemSolving_8_4_Ex02 {
    static int[] dp;
    static int[] list = {1, 5, 2, 4, 7};

    public static void main(String[] args) {
        dp = new int[list.length + 1];
        System.out.println(lis(-1) - 1);
        System.out.println(Arrays.toString(dp));
    }

    private static int lis(int N) {
        if (dp[N + 1] != 0) return dp[N + 1];
        dp[N + 1] = 1;
        for (int i = N + 1; i < list.length; i++) {
            if (N == -1 || list[N] < list[i])
                dp[N + 1] = Math.max(dp[N + 1], lis(i) + 1);
        }
        return dp[N + 1];
    }
}
