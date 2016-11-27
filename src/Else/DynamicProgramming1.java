package Else;

/**
 * Created by ihyecheon on 2016. 7. 1..
 */
public class DynamicProgramming1 {
    static int h = 5, w = 4;
    static int[][] dp = new int[h + 1][w + 1];

    public static void main(String[] args) {
        calc();
        System.out.println(dp[h][w]);
        System.out.println(dfs(0, 0));
    }

    static int dfs(int nowh, int noww) {
        if (nowh > h || noww > w) return 0;
        if (nowh == h && noww == w) return 1;
        if (dp[nowh][noww] != 0) return dp[nowh][noww];
        return dp[nowh][noww] = dfs(nowh + 1, noww) + dfs(nowh, noww + 1);
    }

    static void calc() {
        int i, j;
        dp[0][0] = 1;
        for (i = 0; i <= h; i++) {
            for (j = 0; j <= w; j++) {
                if (i != 0) dp[i][j] += dp[i - 1][j];
                if (j != 0) dp[i][j] += dp[i][j - 1];
            }
        }
    }
}
