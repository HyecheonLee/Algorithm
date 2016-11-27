package Else;

/**
 * Created by ihyecheon on 2016. 7. 1..
 */
public class DynamicProgramming2 {
    static int[] ws = {3, 4, 1, 2, 3};
    static int[] ps = {2, 3, 2, 3, 6};
    static int maxw = 10;
    static int[][] dp = new int[6][11];

    public static void main(String[] args) {
//        knapsack(0, 0);
//        int ret = 0;
//        for (int i = 0; i < ws.length; i++) {
//            for (int j = 0; j <= maxw; j++) {
//                if (j + ws[i] <= maxw) {
//                    dp[i + 1][j + ws[i]] = Math.max(dp[i + 1][j + ws[i]], dp[i][j] + ps[i]);
//                    ret = Math.max(dp[i + 1][j + ws[i]], ret);
//                }
//            }
//        }
//        System.out.println(dp[5][10]);
    }

//    static int knapsack(int n, int w) {
//        dp[][]
//    }
}
