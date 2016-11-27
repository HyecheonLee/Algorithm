package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 28..
 */
public class ProblemSolving_8_14 {
    static final int MOD = 10000000;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += poly(n, i);
        }
        System.out.println(sum);
    }

    private static int poly(int n, int first) {
        if (n == first) {
            return 1;
        }
        int sum = 0;
        for (int second = 1; second <= n - first; second++) {
            sum += (poly(n - first, second) * (second + first - 1));
        }
        return sum;
    }
}
