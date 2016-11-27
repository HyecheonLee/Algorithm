package ProblemSoving;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 28..
 */
public class ProblemSolving_8_9 {
    static int[] numArr;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int S = scanner.nextInt();
            numArr = new int[N];
            for (int i = 0; i < N; i++) {
                numArr[i] = scanner.nextInt();
            }
            dp = new int[N + 1][S + 1];
            Arrays.sort(numArr);
            System.out.println(quantization(0, S));
        }
    }

    private static int quantization(int start, int s) {
        if (dp[start][s] != 0) return dp[start][s];
        if (s == 1) {
            return calculator(start, numArr.length);
        }
        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i <= numArr.length - s; i++) {
            min = Math.min(min, quantization(i, s - 1) + calculator(start, i));
        }
        return dp[start][s] = min;
    }

    private static int calculator(int start, int end) {
        double mean = 0;
        for (int i = start; i < end; i++) {
            mean += numArr[i];
        }
        mean /= (end - start);
        mean = Math.round(mean);
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += (int) Math.pow(mean - numArr[i], 2);
        }
        return sum;
    }
}
