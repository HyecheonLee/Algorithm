package ProblemSoving;

import java.util.*;

/**
 * Created by ihyecheon on 2016. 7. 26..
 */
public class ProblemSolving_8_5 {
    static int[] A, B;
    private static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }
            dp = new int[100][100];
            System.out.println(lis(-1, -1) - 2);
        }
    }

    private static int lis(int indexA, int indexB) {
        if (dp[indexA + 1][indexB + 1] != 0) return dp[indexA + 1][indexB + 1];
        dp[indexA + 1][indexB + 1] = 2;

        int a = (indexA == -1 ? Integer.MIN_VALUE : A[indexA]);
        int b = (indexB == -1 ? Integer.MIN_VALUE : B[indexB]);

        int maxElement = Math.max(a, b);

        for (int nextA = indexA + 1; nextA < A.length; nextA++) {
            if (maxElement < A[nextA])
                dp[indexA + 1][indexB + 1] = Math.max(dp[indexA + 1][indexB + 1], lis(nextA, indexB) + 1);
        }

        for (int nextB = indexB + 1; nextB < B.length; nextB++) {
            if (maxElement < B[nextB])
                dp[indexA + 1][indexB + 1] = Math.max(dp[indexA + 1][indexB + 1], lis(indexA, nextB) + 1);
        }

        return dp[indexA + 1][indexB + 1];
    }
}
