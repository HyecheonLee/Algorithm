package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1051 {
    static int[][] map;
    static int N, M;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] num = reader.readLine().split(" ");
            N = Integer.parseInt(num[0]);
            M = Integer.parseInt(num[1]);
            map = new int[N][M];
            for (int[] rowMap : map) {
                num = reader.readLine().split("");
                for (int i = 0; i < rowMap.length; i++) {
                    rowMap[i] = Integer.parseInt(num[i]);
                }
            }
            int size = N < M ? N : M;
            while (size != 1) {
                for (int y = 0; y < N; y++) {
                    for (int x = 0; x < M; x++) {
                        if (isCheck(y, x, size)) {
                            System.out.println(size * size);
                            return;
                        }
                    }
                }
                size--;
            }
            System.out.println(size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isCheck(int y, int x, int size) {
        size -= 1;
        if (y + size < N && x + size < M) {
            if (map[y][x] == map[y + size][x]
                    && map[y][x] == map[y][x + size]
                    && map[y][x] == map[y + size][x + size]) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }
}
