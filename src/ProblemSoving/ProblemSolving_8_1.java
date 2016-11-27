package ProblemSoving;

/**
 * Created by ihyecheon on 2016. 7. 22..
 */
public class ProblemSolving_8_1 {
    static int[][] map = {
            {2, 5, 1, 6, 1, 4, 1},
            {6, 1, 1, 2, 2, 9, 3},
            {7, 2, 3, 2, 1, 3, 1},
            {1, 1, 3, 1, 7, 1, 2},
            {4, 1, 2, 3, 4, 1, 2},
            {3, 3, 1, 2, 3, 4, 1},
            {1, 5, 2, 9, 4, 7, 0}
    };
    static int[][] dp;

    public static void main(String[] args) {
        dp = new int[map.length][map[0].length];
        System.out.println(jump(0, 0));
    }

    private static int jump(int y, int x) {
        if (y >= map.length || x >= map[0].length) {
            return 0;
        } else if (y == map.length - 1 && x == map[0].length - 1) {
            return 1;
        } else {
            if (dp[y][x] != 0) {
                return dp[y][x];
            }
            dp[y][x] = 1;
            int dx = dp[y][x];
            int dy = dp[y][x];
            jump(y + dy, x);
            jump(y, x + dx);
            return 1;
        }
    }
}
