package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 8..
 */
public class problem11054 {
    static int bitonic[];
    static int upDP[];
    static int downDP[];
    static int dp[];
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        bitonic = new int[N];
        upDP = new int[N];
        downDP = new int[N];
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            bitonic[i] = scanner.nextInt();
        }
        int temp1;
        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp1 = downBitonic(i) + upBitonic(i) + 1;
            temp = Math.max(temp1, temp);

        }
        System.out.println(temp);
    }

    private static int upBitonic(int n) {
        if (n > N) {
            return 1;
        }
        if (upDP[n] != 0) return upDP[n];
        int temp1;
        int temp2 = 0;
        for (int i = n + 1; i < N; i++) {
            if (bitonic[i] < bitonic[n]) {
                temp1 = upBitonic(i) + 1;
                temp2 = Math.max(temp1, temp2);
            }
        }
        upDP[n] = temp2;
        return upDP[n];
    }

    private static int downBitonic(int n) {
        if (n < 0) {
            return 1;
        }
        if (downDP[n] != 0) return downDP[n];
        int temp1;
        int temp2 = 0;
        for (int i = 1; i <= n; i++) {
            if (bitonic[n - i] < bitonic[n]) {
                temp1 = downBitonic(n - i) + 1;
                temp2 = Math.max(temp1, temp2);
            }
        }
        downDP[n] = temp2;
        return downDP[n];
    }
}
