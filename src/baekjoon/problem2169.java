package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 10. 21..
 */
public class problem2169 {
    static int[][] dp;
    static int N, M;
    static int[][] map;
    static int[] dy = {0, 0, 1};
    static int[] dx = {-1, 1, 0};
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] num = reader.readLine().split(" ");
            N = Integer.parseInt(num[0]);
            M = Integer.parseInt(num[1]);
            map = new int[N + 2][M + 2];
            dp = new int[N + 2][M + 2];
            boolean[][] checkedMap = new boolean[N + 2][N + 2];
            for (int i = 0; i < N + 2; i++) {
                for (int j = 0; j < M + 2; j++) {
                    map[i][j] = -1000;
                }
            }
            for (int i = 1; i <= N; i++) {
                num = reader.readLine().split(" ");
                for (int j = 1; j <= M; j++) {
                    map[i][j] = Integer.parseInt(num[j - 1]);
                }
            }
            for (int i = 0; i < map.length; i++) {
                map[0][i] = 0;
            }
            for (int y = 1; y <= N; y++) {
                for (int x = 1; x <= M; x++) {
                    int a = dp[y - 1][x] + map[y][x];
                    int b = dp[y][x - 1] + map[y][x];
                    int c = dp[y - 1][x + 1] + map[y][x] + map[y][x + 1];
                    dp[y][x] = Math.max(dp[y][x], a);
                    dp[y][x] = Math.max(dp[y][x], b);
                    dp[y][x] = Math.max(dp[y][x], c);
                    System.out.println(a + " , " + b + " ," + c);
                }
                System.out.println(Arrays.toString(dp[y]));
            }
            System.out.println(dp[N][M]);
//            System.out.println(search(1, 1, checkedMap));
        }
    }

    private static int search(int y, int x, boolean[][] checkedMap) {
        cnt++;
        if (y > N || x > M || y < 0 || x < 0) return -1000;
        if (y == N && x == M) {
            return map[y][x];
        }
        int max = 0;
        if ((checkedMap[y][x + 1]) && dp[y][x] != 0) return dp[y][x];
        for (int i = 0; i < 3; i++) {
            int tempY = y + dy[i];
            int tempX = x + dx[i];
            int temp = 0;
            if ((tempY <= N && tempX <= M && tempY >= 1 && tempX >= 1) && !checkedMap[tempY][tempX]) {
                checkedMap[tempY][tempX] = true;
                temp = search(y + dy[i], x + dx[i], checkedMap) + map[y][x];
                checkedMap[tempY][tempX] = false;
            }
            max = max > temp ? max : temp;
        }
        dp[y][x] = max;
        return dp[y][x];
    }
}
