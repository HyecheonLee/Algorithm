package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 1..
 */
public class problem1149 {
    static int[][] ps;
    static int N;
    static int cost[];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        ps = new int[N + 1][3];
        cost = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            cost[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                ps[i][j] = scanner.nextInt();
            }
        }
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            temp = temp < painting(N - 1, i) ? temp : painting(N - 1, i);
        }
        System.out.println(temp);
    }

    private static int painting(int n, int k) {
        if (n == 0) {
            return ps[n][k];
        }
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (i != k)
                temp = painting(n - 1, i) + ps[n][k];
            cost[n] = cost[n] < temp ? cost[n] : temp;
        }
        return cost[n];
    }
}
