package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem1946 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[][] score = new int[N][2];
            for (int i = 0; i < N; i++) {
                score[i][0] = scanner.nextInt();
                score[i][1] = scanner.nextInt();
            }
            Arrays.sort(score, (o1, o2) -> o1[0] - o2[0]);
            int cnt = 1;
            int min = score[0][1];
            for (int i = 1; i < N; i++) {
                if (score[i][1] < min) {
                    cnt++;
                    min = score[i][1];
                }
            }
            System.out.println(cnt);
        }
    }
}
