package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 28..
 */
public class ProblemSolving_8_16 {
    static int[][] town;
    static double[][] probability;
    static double dp[][];
    static int D;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        while (C-- > 0) {
            int N = scanner.nextInt();
            D = scanner.nextInt();
            P = scanner.nextInt();
            town = new int[N][N];
            probability = new double[N][N];
            for (int i = 0; i < N; i++) {
                double sum = 0;
                for (int j = 0; j < N; j++) {
                    town[i][j] = scanner.nextInt();
                    sum += town[i][j];
                }
                for (int j = 0; j < N; j++) {
                    probability[i][j] = town[i][j] / sum;
                }
            }
            int T = scanner.nextInt();
            dp = new double[D + 1][N + 1];
            for (int i = 0; i < T; i++) {
                System.out.println(search(D, scanner.nextInt()));
            }
        }
    }

    private static double search(int d, int p) {
        if (d == 0) {
            return p == P ? 1.0 : 0.0;
        }
        if (dp[d][p] != 0) {
            return dp[d][p];
        }
        for (int i = 0; i < town.length; i++) {
            dp[d][p] += search(d - 1, i) * probability[i][p];
        }
        return dp[d][p];
    }
}
