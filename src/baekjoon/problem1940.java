package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 30..
 */
public class problem1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] items = new int[N];
        int cnt = 0;
        boolean[] check = new boolean[N];
        for (int i = 0; i < N; i++) {
            items[i] = scanner.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + 1; j < N; j++) {
                if (check[j]) {
                    continue;
                }
                if (items[i] + items[j] == M) {
                    check[i] = true;
                    check[j] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
