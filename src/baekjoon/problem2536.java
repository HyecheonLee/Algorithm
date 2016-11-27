package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem2536 {
    public static void main(String[] args) {
        int[][] map = new int[101][101];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(reader.readLine().trim());
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                String[] num = reader.readLine().trim().split(" ");
                int X = Integer.parseInt(num[0]);
                int Y = Integer.parseInt(num[1]);
                for (int y = Y; y < Y + 10; y++) {
                    for (int x = X; x < X + 10; x++) {
                        if (map[y][x] == 0) {
                            cnt++;
                            map[y][x]++;
                        }
                    }
                }
            }
            writer.write(cnt + "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
