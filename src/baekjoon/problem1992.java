package baekjoon;

import java.io.*;
import java.util.Objects;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem1992 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(reader.readLine());
            int[][] map = new int[N][N];
            for (int[] rowMap : map) {
                String[] num = reader.readLine().split("");
                for (int i = 0; i < rowMap.length; i++) {
                    rowMap[i] = Integer.parseInt(num[i]);
                }
            }
            writer.write(quadTree(map, N));
        }
    }

    private static String quadTree(int[][] map, int N) {
        return compose(map, 0, 0, N);
    }

    private static String compose(int[][] map, int y, int x, int N) {
        if (N == 1) {
            return String.valueOf(map[y][x]);
        }
        StringBuilder builder = new StringBuilder();
        String a = compose(map, y, x, N / 2);
        String b = compose(map, y, x + (N / 2), N / 2);
        String c = compose(map, y + (N / 2), x, N / 2);
        String d = compose(map, y + (N / 2), x + (N / 2), N / 2);
        if (Objects.equals(a, b) && Objects.equals(a, c) &&
                Objects.equals(a, d) && Objects.equals(b, d) && Objects.equals(c, d) && a.length() == 1) {
            builder.append(a);
        } else {
            builder.append("(");
            builder.append(a);
            builder.append(b);
            builder.append(c);
            builder.append(d);
            builder.append(")");
        }
        return String.valueOf(builder);
    }
}
