package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int coins[][] = new int[N][3];
        int max = 0;
        for (int i = 0; i < N; i++) {
            int[] dic = new int[7];
            for (int j = 0; j < 3; j++) {
                coins[i][j] = scanner.nextInt();
                dic[coins[i][j]]++;
            }

            for (int j = 1; j < 7; j++) {
                if (dic[j] == 3) {
                    max = max > (j * 1_000) + 10_000 ? max : (j * 1_000) + 10_000;
                } else if (dic[j] == 2) {
                    max = max > j * 100 + 1_000 ? max : j * 100 + 1_000;
                } else if (dic[j] == 1) {
                    max = max > j * 100 ? max : j * 100;
                }
            }
        }
        System.out.println(max);
    }
}
