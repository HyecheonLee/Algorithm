package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 3..
 */
public class problem1932 {
    static int[][] pyramid;
    static int save[][];
    static int max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        pyramid = new int[N + 2][N + 2];
        save = new int[N + 2][N + 2];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                pyramid[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                save[i][j] = pyramid[i][j] + save[i - 1][j];
                save[i][j] = save[i][j] > pyramid[i][j] + save[i - 1][j - 1] ?
                        save[i][j] : pyramid[i][j] + save[i - 1][j - 1];
                max = max > save[i][j] ? max : save[i][j];
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(save[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(max);
    }

    private static int findMaxValue(int N) {
        for (int i = 0; i < N; i++) {

        }
        return 0;
    }
}
