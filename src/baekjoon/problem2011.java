package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 17..
 */
public class problem2011 {
    static String str;
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        dp = new int[5001];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(search(str.length()));
    }

    private static int search(int N) {
        if (N == 0) {
            return dp[N] = 1;
        } else if (N == 1) {
            return dp[N] = 1;
        } else {
            int num;
            if (dp[N] != -1) {
                return dp[N];
            }
            if (str.charAt(N - 1) == '0') {
                if (str.charAt(N - 2) == '0') {
                    return dp[N] = 0;
                } else {
                    num = search(N - 2);
                }
            } else {
                if (str.charAt(N - 2) == '0') {
                    num = search(N - 1);
                } else {
                    String temp = "" + str.charAt(N - 2) + str.charAt(N - 1);
                    if (Integer.parseInt(temp) > 26) {
                        num = search(N-1);
                    } else {
                        num = search(N - 1) + search(N - 2);
                    }
                }
            }
            return dp[N] = (num % 1000000);
        }
    }
}
