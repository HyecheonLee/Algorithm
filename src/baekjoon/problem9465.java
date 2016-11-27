package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 4..
 */
public class problem9465 {
    static int[][] save;
    static int[][] stamps;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            stamps = new int[2][N];
            save = new int[2][N];
            for (int i = 0; i < 2; i++) {
                String temp[] = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    stamps[i][j] = Integer.parseInt(temp[j]);
                }
            }

            int temp1 = calculator(0, N - 1);
            int temp2 = calculator(1, N - 1);
            System.out.println(temp1 > temp2 ? temp1 : temp2);
        }

    }

    private static int calculator(int N, int M) {
        if (M < 0) return 0;
        if (M == 0) {
            return stamps[N][M];
        } else {
            if (save[N][M] != 0) {
                return save[N][M];
            }
            int temp;
            int temp2;
            temp = calculator((N + 1) % 2, M - 1) + stamps[N][M];
            temp2 = calculator((N + 1) % 2, M - 2) + stamps[N][M];
            save[N][M] = temp > temp2 ? temp : temp2;
            return save[N][M];
        }
    }
}
