package baekjoon;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 5..
 */
public class problem2096 {
    static int[][] arr;
    static int[][] dp;
    static int[] vx = {0, 1, -1};
    static int maxValue = 1000000000;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr = new int[N][3];
        dp = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            temp = temp > search(N - 1, i) ? temp : search(N - 1, i);
        }
        System.out.print(temp + " ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = maxValue;
            }
        }
        for (int i = 0; i < 3; i++) {
            temp = temp < searchMin(N - 1, i) ? temp : search(N - 1, i);
        }
        System.out.println(temp);
    }

    private static int searchMin(int y, int x) {
        if (y == 0) {
            return arr[y][x];
        } else {
            if (dp[y][x] != maxValue) return dp[y][x];
            int temp = maxValue;
            for (int i = 0; i < 3; i++) {
                int X = x + vx[i];
                if (X >= 0 && X < 3) {
                    temp = temp < searchMin(y - 1, X) + arr[y][x] ? temp : searchMin(y - 1, X) + arr[y][x];
                }
            }
            dp[y][x] = temp;
            return dp[y][x];
        }
    }

    private static int search(int y, int x) {
        if (y == 0) {
            return arr[y][x];
        } else {
            if (dp[y][x] != 0) return dp[y][x];
            int temp = 0;
            for (int i = 0; i < 3; i++) {
                int X = x + vx[i];
                if (X >= 0 && X < 3) {
                    temp = temp > search(y - 1, X) + arr[y][x] ? temp : search(y - 1, X) + arr[y][x];
                }
            }
            dp[y][x] = temp;
            return dp[y][x];
        }
    }
}
