package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */

public class problem1520 {
    static int[][] map;
    static int N, M;
    static int[][] dp;
    static int[] vx = {0, 0, 1, -1};
    static int[] vy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        map = new int[N][M];
        dp = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] temp2 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(temp2[j]);
            }
        }
        finderMap(N - 1, M - 1);
        System.out.println(dp[N - 1][M - 1]);
    }

    private static int finderMap(int y, int x) {
        if (y == 0 && x == 0) {
            return 1;
        } else {
            if (dp[y][x] != 0) {
                return dp[y][x];
            }
            for (int i = 0; i < 4; i++) {
                int Y = y + vy[i], X = x + vx[i];
                if (Y >= 0 && Y < N && X >= 0 && X < M) {
                    if (map[Y][X] > map[y][x]) {
                        dp[y][x] += finderMap(Y, X);
                    }
                }
            }
        }
        return dp[y][x];
    }
}
