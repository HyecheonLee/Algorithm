package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem7567 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String[] num = reader.readLine().split(" ");
            int M = Integer.parseInt(num[0]);
            int N = Integer.parseInt(num[1]);
            Queue<Integer> queueX = new ArrayDeque<>();
            Queue<Integer> queueY = new ArrayDeque<>();
            int[][] map = new int[N][M];
            int sum = M * N;
            for (int i = 0; i < N; i++) {
                num = reader.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(num[j]);
                    if (map[i][j] == 1) {
                        queueY.add(i);
                        queueX.add(j);
                        sum--;
                    } else if (map[i][j] == -1) {
                        sum--;
                    }
                }
            }
            int cnt = 0;
            while (true) {
                cnt++;
                Queue<Integer> tempX = new ArrayDeque<>();
                Queue<Integer> tempY = new ArrayDeque<>();
                tempX.addAll(queueX);
                tempY.addAll(queueY);
                queueX.clear();
                queueY.clear();
                while (!tempX.isEmpty()) {
                    int x = tempX.poll();
                    int y = tempY.poll();
                    for (int i = 0; i < 4; i++) {
                        int vy = y + dy[i];
                        int vx = x + dx[i];
                        if (vy >= 0 && vy < N && vx >= 0 && vx < M && map[vy][vx] == 0) {
                            map[vy][vx] = 1;
                            sum--;
                            queueX.add(vx);
                            queueY.add(vy);
                        }
                    }
                }
                if (sum == 0 || queueX.isEmpty()) break;
            }
            if (sum == 0) {
                System.out.println(cnt);
            } else {
                System.out.println(-1);
            }
        }
    }
}
