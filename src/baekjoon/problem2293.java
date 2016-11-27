package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class problem2293 {
    static int[] coin;
    static int[][] save;
    private static int[] result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = scanner.nextInt();
        }
        result = new int[k + 1];
        coinDP(k, n);
        System.out.println(result[k]);
    }

    static public void coinDP(int k, int n) {
        result[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (coin[i] <= j) {
                    result[j] += result[j - coin[i]];
                }
            }
            System.out.println(Arrays.toString(result));
        }
    }
}
