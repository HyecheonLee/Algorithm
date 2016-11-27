package ProblemSoving;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 26..
 */
public class ProblemSolving_8_4_EX {
    static int[][] triangle = {
            {6, 0, 0, 0, 0},
            {1, 2, 0, 0, 0},
            {3, 7, 4, 0, 0},
            {9, 4, 1, 7, 0},
            {2, 7, 5, 9, 4}
    };
    static int[][] dp;

    public static void main(String[] args) {
        dp = new int[triangle.length][triangle[0].length];
        System.out.println(path(0, 0));
        for (int i = 0; i < triangle.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    private static int path(int y, int x) {
        if (y == triangle[0].length - 1) {
            return dp[y][x] = triangle[y][x];
        }
        if (dp[y][x] != 0) return dp[y][x];
        return dp[y][x] = Math.max(path(y + 1, x), path(y + 1, x + 1)) + triangle[y][x];
    }
}
