package baekjoon;

import java.util.Scanner;

public class problem2294 {
    static int coin[];
    static int save[][];
    static int MaxValue = 100000;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        coin = new int[n];
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();

        save = new int[k + 1][n];

        int result = minimize(k, n - 1);
        if (result == MaxValue) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
        System.out.println(save[k][n]);
    }

    public static int minimize(int capacity, int item) {
        if (capacity == 0) {
            return 0;
        }
        if (item < 0) {
            return MaxValue;
        }
        if (save[capacity][item] != 0) return save[capacity][item];
        int count = Integer.MAX_VALUE;
        for (int i = 0; i <= capacity / coin[item]; i++) {
            count = count < minimize(capacity - coin[item] * i, item - 1) + i ?
                    count : minimize(capacity - coin[item] * i, item - 1) + i;
        }
        return save[capacity][item] = count;
    }
}