package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem2352 {
    static int[] ports;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        ports = new int[N];
        String[] num = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            ports[i] = Integer.parseInt(num[i]);
        }
        int[] dp = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (ports[i] > ports[j]) {
                    dp[i] = dp[i] > 1 + dp[j] ? dp[i] : 1 + dp[j];
                    max = max > dp[i] ? max : dp[i];
                }
            }
        }
        System.out.println(max);
    }
}
