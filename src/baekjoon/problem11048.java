package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 6..
 */
public class problem11048 {
    static int[][] maze;
    static int[][] dp;
    static int[] vy = {-1, -1, 0}, vx = {0, -1, -1};
    static int[] vY = {1, 1, 0}, vX = {0, 1, 1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        maze = new int[N][M];
        dp = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] temp2 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(temp2[j]);
            }
        }

        dp[0][0] = maze[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < 3; k++) {
                    int Y = i + vy[k];
                    int X = j + vx[k];
                    if (X >= 0 && Y >= 0) {
                        dp[i][j] = dp[i][j] > dp[Y][X] + maze[i][j] ? dp[i][j] : dp[Y][X] + maze[i][j];
                    }
                }
            }
        }
        System.out.println(dp[N - 1][M - 1]);

//        System.out.println(findMaze(N - 1, M - 1));
    }

    private static int findMaze(int y, int x) {
        if (dp[y][x] != 0) {
            return dp[y][x];
        } else if (y == 0 && x == 0) {
            return dp[y][x] = maze[y][x];
        } else {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                int Y = y + vy[i];
                int X = x + vx[i];
                int temp = 0;
                if (X >= 0 && Y >= 0) {
                    temp = findMaze(Y, X) + maze[y][x];
                }
                max = max > temp ? max : temp;
            }
            return dp[y][x] = max;
        }
    }
}
