package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1012 {
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, 1, -1};
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(reader.readLine());
            while (T-- > 0) {
                String[] num = reader.readLine().split(" ");
                int M = Integer.parseInt(num[0]);
                int N = Integer.parseInt(num[1]);
                int K = Integer.parseInt(num[2]);
                int[][] map = new int[N + 2][M + 2];
                for (int i = 0; i < K; i++) {
                    num = reader.readLine().split(" ");
                    map[Integer.parseInt(num[1]) + 1][Integer.parseInt(num[0]) + 1] = 1;
                }
                cnt = 1;
                for (int i = 0; i <= N; i++) {
                    for (int j = 0; j <= M; j++) {
                        if (map[i][j] == 1) {
                            labeling(map, i, j);
                        }
                    }
                }
                writer.write((cnt - 1) + "\n");
            }
        }
    }

    private static void labeling(int[][] map, int y, int x) {
        cnt++;
        isCheck(map, y, x);
    }

    private static void isCheck(int[][] map, int y, int x) {
        if (map[y][x] == 1) {
            map[y][x] = cnt;
            for (int i = 0; i < 4; i++) {
                isCheck(map, y + dy[i], x + dx[i]);
            }
        }
    }
}
