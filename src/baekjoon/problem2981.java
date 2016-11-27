package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 19..
 */
public class problem2981 {
    static int N;
    static int[] arr;
    static int first = -1;
    static int second;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (first == -1) {
                    first = Math.abs(arr[i] - arr[j]);
                }
                second = Math.abs(arr[i] - arr[j]);
                int a = Math.max(first, second);
                int b = Math.min(first, second);
                first = gcd(a, b);
            }
        }
        for (int i = 2; i <= first; i++) {
            if (first % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void subSet(int n, int count, boolean[] check) {
        if (count == 2) {
            int[] num = new int[2];
            int cnt = 0;
            for (int i = 0; i < check.length; i++) {
                if (check[i]) {
                    num[cnt++] = arr[i];
                }
            }

            if (first == -1) {
                first = Math.abs(num[0] - num[1]);
            }
            second = Math.abs(num[0] - num[1]);
            int a = Math.max(first, second);
            int b = Math.min(first, second);
            first = gcd(a, b);
            return;
        }
        if (n >= N) {
            return;
        }
        check[n] = true;
        subSet(n + 1, count + 1, check);
        check[n] = false;
        subSet(n + 1, count, check);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
