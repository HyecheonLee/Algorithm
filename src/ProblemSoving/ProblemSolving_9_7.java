package ProblemSoving;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 8. 2..
 */
public class ProblemSolving_9_7 {
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            arr = new int[n + 2];
            arr[0] = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            arr[n + 1] = Integer.MAX_VALUE;
            dp = new int[n + 2];
            int num = search(n + 1) - 1;
            int N = search2(k, num) + 1;
            search3(N, num);
            System.out.println(Arrays.toString(dp));
        }
    }

    private static void search3(int n, int k) {
        for (int i = 0; i < n; i++) {
            if (dp[i] == k - 1) {
                search3(i, k - 1);
                System.out.println(arr[n]);
                break;
            }
        }
    }

    private static int search2(int n, int num) {
        int cnt = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == num) {
                cnt++;
            }
            if (n - cnt == 0) {
                return i;
            }
        }
        return search2(n - cnt, num - 1);
    }

    private static int search(int n) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) return dp[n];
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[n - i] < arr[n]) {
                ret = Math.max(search(n - i) + 1, ret);
            }
        }
        dp[n] = ret;
        return ret;
    }
}
