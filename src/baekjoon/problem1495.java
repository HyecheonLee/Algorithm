package baekjoon;

import java.io.*;

/**
 * Created by ihyecheon on 2016. 7. 9..
 */
public class problem1495 {
    static int[] diff;
    static int M;
    static int N;
    static int max = -1;
    static int dp[][];
    static int S;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] num = reader.readLine().split(" ");
            N = Integer.parseInt(num[0]);
            S = Integer.parseInt(num[1]);
            M = Integer.parseInt(num[2]);
            dp = new int[M + 1][N + 1];
            diff = new int[N];
            num = reader.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                diff[i] = Integer.parseInt(num[i]);
            }
            guitar(S, 0);

            writer.write(max + "");

        }
    }

    private static void guitar(int sound, int i) {
        if (i == N) {
            max = max > sound ? max : sound;
            return;
        }
        if (dp[sound][i] == 1) {
            return;
        }
        dp[sound][i] = 1;
        if (sound + diff[i] >= 0 && sound + diff[i] <= M) {
            guitar(sound + diff[i], i + 1);
        }
        if (sound - diff[i] >= 0 && sound - diff[i] <= M) {
            guitar(sound - diff[i], i + 1);
        }
    }
}