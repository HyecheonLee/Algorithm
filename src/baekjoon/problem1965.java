package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem1965 {
    static int[] dp;
    static int[] boxs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boxs = new int[N];
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            boxs[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = N - 1; i >= 1; i--) {
            int temp = countBox(i);
            max = max > temp ? max : temp;
        }
        System.out.println(max + 1);
    }

    private static int countBox(int n) {
        if (n < 0) return 0;
        int max = 0;
        int temp = 0;
        if (dp[n] != 0) return dp[n];
        for (int i = 1; i <= n; i++) {
            if (boxs[n - i] < boxs[n]) {
                temp = countBox(n - i) + 1;
            }
            max = max > temp ? max : temp;
        }
        dp[n] = max;
        return dp[n];
    }
}
