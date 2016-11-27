package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 1..
 */
public class problem1003 {
    static int[] temp;
    static int[][] count;
    static int cnt = 0;
    static int cnt1 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            N += 2;
            temp = new int[N + 1];
            count = new int[N + 1][2];
            fibonacci(N);
            System.out.println(count[N - 2][0] + " " + count[N - 2][1]);
            cnt = 0;
            cnt1 = 0;
        }
    }

    static int fibonacci(int n) {
        if (n == 0) {
            count[n][0] = 1;
            return 0;
        } else if (n == 1) {
            count[n][1] = 1;
            return 1;
        } else {
            if (temp[n] != 0) {
                if (n >= 2) {
                    count[n][0] = count[n - 1][0] + count[n - 2][0];
                    count[n][1] = count[n - 1][1] + count[n - 2][1];
                }
                return temp[n];
            }
            if (n >= 2) {
                count[n][0] = count[n - 1][0] + count[n - 2][0];
                count[n][1] = count[n - 1][1] + count[n - 2][1];
            }
            return temp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
