package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 8..
 */
public class problem2302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] dp = new int[N + 2];
        int[] arr = new int[M + 2];
        for (int i = 1; i <= M; i++) {
            arr[i] = scanner.nextInt();
        }
        arr[M + 1] = N + 1;
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < N + 2; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int mul = 1;
        for (int i = 1; i <= M + 1; i++) {
            int temp = arr[i] - arr[i - 1] - 1;
            mul *= dp[temp];
        }
        System.out.println(mul);
    }
}
