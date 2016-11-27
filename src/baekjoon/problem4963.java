package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem4963 {
    static int cnt = 1;
    private static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
    private static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        while (!(W == 0 && H == 0)) {
            int[][] map = new int[H + 2][W + 2];
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    labeling(map, i, j);
                }
            }
            System.out.println(cnt - 1);
            cnt = 1;
            W = scanner.nextInt();
            H = scanner.nextInt();
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
            for (int i = 0; i < 8; i++) checking(arr, y + dy[i], x + dx[i]);
        }
    }
}
