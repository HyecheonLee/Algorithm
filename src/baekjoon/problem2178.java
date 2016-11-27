package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 14..
 */
public class problem2178 {
    static boolean[][] visited;
    static int N = 0;
    static int M = 0;
    static int[] vy = {1, -1, 0, 0};
    static int[] vx = {0, 0, 1, -1};
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        int[][] graph = new int[N][M];
        dp = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] str = scanner.next().split("");
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
            }
        }
        visited = new boolean[N][M];
        System.out.println(BFS(graph, 0, 0) + 1);
    }

    private static int BFS(int[][] graph, int y, int x) {
        if (y == N - 1 && x == M - 1) {
            return 0;
        } else {
            if (dp[y][x] != 0) return dp[y][x];
            int max = M * N;
            for (int i = 0; i < 4; i++) {
                if ((y + vy[i] >= 0 && y + vy[i] < N) && (x + vx[i] >= 0 && x + vx[i] < M)) {
                    if (graph[y + vy[i]][x + vx[i]] == 1 && !visited[y + vy[i]][x + vx[i]]) {
                        visited[y + vy[i]][x + vx[i]] = true;
                        int temp = BFS(graph, y + vy[i], x + vx[i]) + 1;
                        visited[y + vy[i]][x + vx[i]] = false;
                        max = Math.min(temp, max);
                    }
                }
            }
            return dp[y][x] = max;
        }
    }
}
