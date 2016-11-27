package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 3..
 */
public class problem2167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int arr[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int K = scanner.nextInt();
        while (K-- > 0) {
            int i, j, x, y;
            i = scanner.nextInt();
            j = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            i = i < x ? i : x;
            x = i > x ? i : x;
            j = j < y ? j : y;
            y = j > y ? j : y;
            int sum = 0;
            for (int p = i - 1; p < x; p++) {
                for (int q = j - 1; q < y; q++) {
                    sum += arr[p][q];
                }
            }
            System.out.println(sum);
        }
    }
}
