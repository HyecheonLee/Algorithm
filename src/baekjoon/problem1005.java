package baekjoon;

import java.util.*;

/**
 * Created by ihyecheon on 2016. 8. 3..
 */
public class problem1005 {
    static int[] price;
    static HashMap<Integer, List<Integer>> hashMap;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            hashMap = new HashMap<>();
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            dp = new int[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                List<Integer> list = new ArrayList<>();
                hashMap.put(i, list);
            }
            price = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                price[i] = scanner.nextInt();
            }
            for (int i = 0; i < K; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                hashMap.get(b).add(a);
                hashMap.put(b, hashMap.get(b));
            }
            int start = scanner.nextInt();
            System.out.println(search(start, start));
        }
    }

    private static int search(int start, int end) {
        if (start == 1) {
            return dp[start][end] = price[start];
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        List<Integer> list = hashMap.get(start);
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            int set = list.get(i);
            temp = Math.max(search(start, set) + price[start], temp);
        }
        return dp[start][end] = temp;
    }
}
