package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem11052 {
    static int N;
    static int[] price;
    static int[] weight;
    static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        price = new int[N];
        weight = new int[N];
        dp = new long[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            price[i] = scanner.nextInt();
            weight[i] = i + 1;
        }
        System.out.println(search(N, N - 1));
    }

    private static long search(int W, int n) {
        if (W < 0 || n < 0) {
            return 0;
        }
        if (W == 0) {
            return 0;
        }
        if (dp[W][n] != 0) return dp[W][n];
        long temp = 0;
        for (int i = 0; i <= W / weight[n]; i++) {
            temp = temp > search(W - weight[n] * i, n - 1) + price[n] * i ?
                    temp : search(W - weight[n] * i, n - 1) + price[n] * i;
        }
        dp[W][n] = temp;
        return temp;
    }
}
