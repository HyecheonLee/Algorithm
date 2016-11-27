package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2667 {
    static int cnt = 1;
    private static int[] dy = {1, -1, 0, 0};
    private static int[] dx = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        for (int i = 1; i <= N; i++) {
            String[] strings = scanner.next().split("");
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(strings[j - 1]);
            }
        }
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                labeling(arr, i, j);
            }
        }
        int[] count = new int[cnt - 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (arr[i][j] != 0)
                    count[arr[i][j] - 2]++;
            }
        }
        Arrays.sort(count);
        System.out.println(cnt - 1);
        for (int c : count) {
            System.out.println(c);
        }
    }

    private static void labeling(int[][] arr, int y, int x) {
        if (arr[y][x] == 1) {
            cnt++;
            checking(arr, y, x);
        }
    }

    private static void checking(int[][] arr, int y, int x) {
        if (arr[y][x] == 1) {
            arr[y][x] = cnt;
            for (int i = 0; i < 4; i++) checking(arr, y + dy[i], x + dx[i]);
        }
    }
}
