package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 6..
 */
public class problem2875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, M, K;
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();
        int sum;
        if (N > M * 2) {
            sum = M;
            K -= N - M * 2;
            sum = cal(sum, K);
        } else if (N < M * 2) {
            sum = N / 2;
            K -= M - N / 2;
            sum = cal(sum, K);
        } else {
            sum = M;
            sum = cal(sum, K);
        }
        System.out.println(sum);
    }

    private static int cal(int sum, int K) {
        if (K <= 0) return sum;
        K = K + 2;
        sum -= K / 3;
        return sum;
    }
}
