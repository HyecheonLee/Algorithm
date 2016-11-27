package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 28..
 */
public class ProblemSolving_8_11 {
    static int m, n;
    static double dp[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        dp = new double[m + 1][n + 1];
        System.out.println(climb(m, n));
    }

    private static double climb(int day, int climbed) {
        if (day == 0 || climbed <= 0) return climbed <= 0 ? 1 : 0;
        if (dp[day][climbed] != 0) {
            return dp[day][climbed];
        }
        return dp[day][climbed] = 0.75 * climb(day - 1, climbed - 1) + 0.25 * climb(day - 1, climbed - 2);
    }
}
