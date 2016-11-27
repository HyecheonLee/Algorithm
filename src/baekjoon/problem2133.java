package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 4..
 */
public class problem2133 {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[2] = 3;
        for (int i = 4; i <= n; i += 2) {
            dp[i] = 3 * dp[i - 2];
            for (int j = 4; j <= i; j += 2) {
                dp[i] += 2 * dp[i - j];
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}
