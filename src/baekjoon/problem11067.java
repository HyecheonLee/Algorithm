package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem11067 {
    static int[][] point;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(bufferedReader.readLine());
            point = new int[N][2];
            for (int i = 1; i <= N; i++) {
                String[] temp = bufferedReader.readLine().split(" ");
                for (int j = 0; j < 2; j++) {
                    point[i][j] = Integer.parseInt(temp[j]);
                }
            }

            Arrays.sort(point, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            boolean check = true;
            int start = 0;
            for (int i = 1; i < N - 1; i++) {
                if (point[i][0] == point[i + 1][0] && check) {
                    start = i;
                    check = false;
                }
                if (!check && point[i][0] != point[i + 1][0]) {
                    if (point[start - 1][1] != point[start][1]) {
                        Arrays.sort(point, start, i + 1, new Comparator<int[]>() {
                            @Override
                            public int compare(int[] o1, int[] o2) {
                                return o1[1] - o2[1];
                            }
                        });
                    }
                    check = true;
                }
            }
            String[] temp = bufferedReader.readLine().split(" ");
            for (int i = 0; i < Integer.parseInt(temp[0]); i++) {
                int cnt = Integer.parseInt(temp[i + 1]);
                System.out.println(point[cnt - 1][0] + " " + point[cnt - 1][1]);
            }
        }
    }
}
