package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem11047 {
    private static int[] coin;
    static int[] dp;
    private static int maxValue;

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String temp = scanner.readLine();
        int N = Integer.parseInt(temp.split(" ")[0]);
        int K = Integer.parseInt(temp.split(" ")[1]);
        coin = new int[N + 1];
        maxValue = K;
        dp = new int[K + 1];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(scanner.readLine());
        }
        System.out.println(func(K));
    }

    private static int func(int K) {
        if (K == 0) {
            return 0;
        } else if (K < 0) {
            return maxValue;
        } else {
            if (dp[K] != 0) return dp[K];
            int count = maxValue;
            for (int i = 0; i < coin.length; i++) {
                int temp = func(K - coin[i]);
                if (K >= 0)
                    count = count < temp + 1 ? count : temp + 1;
            }
            return dp[K] = count;
        }
    }
}
