package baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 9. 14..
 */
public class problem11403 {
    static int[][] dp;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[][] G = new int[N][N];
        dp = new int[N][N];
        IntStream.range(0, N)
                .forEach(value -> IntStream.range(0, N).forEach(value1 -> G[value][value1] = scanner.nextInt()));
        for (int i = 0; i < N; i++) {
            func(G, i, i);
        }
        IntStream.range(0, N)
                .forEach(value -> {
                            IntStream.range(0, N).forEach(value1 -> System.out.print(dp[value][value1] + " "));
                            System.out.println();
                        }
                );
    }

    private static void func(int[][] g, int start, int K) {
        IntStream.range(0, N)
                .filter(value -> g[start][value] == 1 && dp[K][value] == 0)
                .forEach(value -> {
                    dp[K][value] = 1;
                    func(g, value, K);
                });
    }
}
