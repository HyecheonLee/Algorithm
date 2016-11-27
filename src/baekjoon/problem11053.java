package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem11053 {
    static int[] dp;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] temp = bufferedReader.readLine().split(" ");
        dp = new int[N + 1];
        A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(temp[i - 1]);
        }
        if (N > 1) {
            dp[0] = 0;
            dp[1] = 1;
        }
        int max = 0;
        for (int i = N; i >= 1; i--) {
            max = max > search(i) ? max : search(i);
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(max);
    }

    private static int search(int n) {
        if (n == 0) return 0;
        if (dp[n] != 0) return dp[n];
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (A[n] > A[n - i]) {
                temp = search(n - i) + 1;
            }
            dp[n] = dp[n] > temp ? dp[n] : temp;
        }
        return dp[n];
    }
}
