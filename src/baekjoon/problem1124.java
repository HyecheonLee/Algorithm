package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem1124 {
    static int A;
    static int B;
    static boolean[] primary;
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();

        primary = new boolean[B + 1];
        primary[0] = true;
        primary[1] = true;
        for (int i = 2; i <= B; i++) {
            if (!primary[i]) {
                for (int j = 2; j * i <= B; j++) {
                    primary[j * i] = true;
                }
            }
        }
        dp = new int[B + 1];
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (!primary[primeSearch(i)]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static int primeSearch(int b) {
        if (!primary[b]) {
            dp[b] = 1;
            return dp[b];
        }
        if (dp[b] != 0) return dp[b];
        int cnt = 0;
        int temp = b;
        for (int i = 2; i <= b && temp != 1; i++) {
            if (temp % i == 0) {
                cnt += primeSearch(i);
                temp /= i;
                i = 1;
            }
        }
        dp[b] = cnt;
        return dp[b];
    }
}
