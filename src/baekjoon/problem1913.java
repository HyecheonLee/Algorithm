package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1913 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] map = new int[N][N];
        N++;
        N /= 2;
        map[N - 1][N - 1] = 1;
        for (int i = 0; i < N; i++) {
            int y = N, x = N;
            int temp = 2 * i + 1;
            int jump = temp - 1;
            temp *= temp;
            y -= (i + 1);
            x -= (i + 1);
            for (int j = 0; j < jump; j++) {
                map[y++][x] = temp--;
            }

            for (int j = 0; j < jump; j++) {
                map[y][x++] = temp--;
            }
            for (int j = 0; j < jump; j++) {
                map[y--][x] = temp--;
            }
            for (int j = 0; j < jump; j++) {
                map[y][x--] = temp--;
            }
        }
        int x = 0, y = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                writer.write(map[i][j] + " ");
                if (map[i][j] == K) {
                    x = j + 1;
                    y = i + 1;
                }
            }
            writer.write("\n");
        }
        writer.write(y + " " + x);
        writer.close();
    }
}
