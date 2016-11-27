package AlgorithmProblemSolving.chpater11;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 24..
 */
public class Section01 {
    static int[] P, W;
    static final int MaxValue = 10000;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int E = scanner.nextInt();
            int F = scanner.nextInt();
            int N = scanner.nextInt();
            P = new int[N];
            W = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = scanner.nextInt();
                W[i] = scanner.nextInt();
            }
            dp = new int[F - E + 1][N + 1];
            int temp = 0;
            if ((temp = function(F - E, N - 1)) >= MaxValue) {
                System.out.println(-1);
            } else {
                System.out.println(temp);
            }
        }
    }

    private static int function(int size, int n) {
        if (n == 0) {
            if (size % W[n] == 0) {
                return P[n] * size / W[n];
            } else {
                return MaxValue;
            }
        }
        if (dp[size][n] != 0) {
            return dp[size][n];
        }
        int ret = MaxValue;
        for (int i = 0; i <= size / W[n]; i++) {
            ret = Math.min(ret, function(size - (W[n] * i), n - 1) + (P[n] * i));
        }
        return dp[size][n] = ret;
    }
}
