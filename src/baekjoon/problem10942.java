package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 8..
 */
public class problem10942 {
    static int[] arrNum;
    static int[][] dp;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arrNum = new int[N];
        for (int i = 0; i < N; i++) {
            arrNum[i] = scanner.nextInt();
        }
        dp = new int[N][N];
        int M = scanner.nextInt();
        while (M-- > 0) {
            int temp = palindrome(scanner.nextInt() - 1, scanner.nextInt() - 1);
            if (temp == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static int palindrome(int start, int end) {
        if (start == end) {
            return dp[start][end] = 1;
        } else {
            if (dp[start][end] != 0) return dp[start][end];

            if (arrNum[start] == arrNum[end]) {
                if (start + 1 == end) {
                    dp[start][end] = 1;
                    return dp[start][end];
                }
                if (palindrome(start + 1, end - 1) == 1) {
                    dp[start][end] = 1;
                    return dp[start][end];
                } else {
                    dp[start][end] = -1;
                    return dp[start][end];
                }
            } else {
                dp[start][end] = -1;
                return dp[start][end];
            }
        }
    }
}
