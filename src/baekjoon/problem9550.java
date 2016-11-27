package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 30..
 */
public class problem9550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] candy = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                candy[i] = scanner.nextInt();
                sum += candy[i] / K;
            }
            System.out.println(sum);
        }
    }
}
