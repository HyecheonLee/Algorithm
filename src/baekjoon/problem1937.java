package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 7..
 */
public class problem1937 {
    static int maze[][];
    static int N;
    static int[] vY = {1, -1, 0, 0}, vX = {0, 0, 1, -1};
    static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bufferedReader.readLine());

        maze = new int[N][N];
        dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] temp = bufferedReader.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                maze[i][j] = Integer.parseInt(temp[j]);
            }
        }
        int max = 0;
        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp = mazeExit(i, j) + 1;
                max = max > temp ? max : temp;
            }
        }
        System.out.println(max);
    }

    private static int mazeExit(int y, int x) {
        if (y < 0 || y > N || x < 0 || x > N) {
            return 0;
        } else {
            if (dp[y][x] != 0) return dp[y][x];
            int max = 0;
            int temp = 0;
            for (int i = 0; i < 4; i++) {
                int Y = y + vY[i];
                int X = x + vX[i];
                if (Y >= 0 && Y < N && X >= 0 && X < N) {
                    if (maze[y][x] < maze[Y][X]) {
                        temp = mazeExit(Y, X) + 1;
                    }
                }
                max = max > temp ? max : temp;
            }
            dp[y][x] = max;
            return dp[y][x];
        }
    }
}
