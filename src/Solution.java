public class Solution{
    static int[][] dp;
    public int solution(int[] coinTypes, int money) {
        dp = new int[money+1][coinTypes.length+1];
        return count(coinTypes,money,0);
    }

    static public int count(int[] coinTypes, int money, int N) {
        if (money == 0) return 1;
        if (N >= coinTypes.length) return 0;
        if (dp[money][N] != 0) return dp[money][N];
        int cnt = money / coinTypes[N];
        int sum = 0;
        for (int i = 0; i <= cnt; i++) {
            sum += count(coinTypes, money - coinTypes[N] * i, N + 1);
        }
        dp[money][N] = sum;
        return sum;
    }
}