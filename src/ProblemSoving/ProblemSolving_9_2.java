package ProblemSoving;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 29..
 */
public class ProblemSolving_9_2 {
    static String[][] items;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int W = scanner.nextInt();
            items = new String[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    items[i][j] = scanner.next();
                }
            }
            dp = new int[N][W + 1];
            LinkedList<String> picked = new LinkedList<>();
            reconstruct(N - 1, W, picked);
            System.out.println(takenItem(N - 1, W) + " " + picked.size());
            picked.forEach(System.out::println);
        }
    }

    private static int takenItem(int n, int w) {
        if (w < 0) {
            return Integer.MIN_VALUE;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n][w] != 0) return dp[n][w];
        int temp1 = takenItem(n - 1, w);
        int temp2 = takenItem(n - 1, w - Integer.parseInt(items[n][1])) + Integer.parseInt(items[n][2]);
        return dp[n][w] = Math.max(temp1, temp2);
    }

    private static void reconstruct(int n, int w, LinkedList<String> picked) {
        if (w < 0) {
            return;
        }
        if (n < 0) {
            return;
        }
        if (takenItem(n, w) == takenItem(n - 1, w)) {
            reconstruct(n - 1, w, picked);
        } else {
            picked.push(items[n][0]);
            reconstruct(n - 1, w - Integer.parseInt(items[n][1]), picked);
        }
    }
}
