package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 6..
 */
public class problem10164 {
    static int dp[][];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        if (K == 0) {
            K = 1;
        }
        K--;
        int y = K / M;
        int x = K % M;
        x++;
        y++;
        int dx = x - 1;
        int dy = y - 1;
        int dx1 = M - x;
        int dy1 = N - y;
        int max = dx + dy > dx1 + dy1 ? dx + dy : dx1 + dy1;
        dp = new int[max + 1][max + 1];
        int temp = makeDp(dx + dy, dy) * makeDp(dy1 + dx1, dy1);
        System.out.println(temp);
    }

    private static int makeDp(int N, int K) {
        if (N < K) return dp[N][K] = 0;
        if (K == 0) return dp[N][K] = 1;
        if (dp[N][K] != 0) return dp[N][K];
        dp[N][K] = makeDp(N - 1, K) + makeDp(N - 1, K - 1);
        return dp[N][K];
    }
}