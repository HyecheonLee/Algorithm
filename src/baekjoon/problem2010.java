package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 23..
 */
public class problem2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] concent = new int[N];
        for (int i = 0; i < N; i++) {
            concent[i] = scanner.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            concent[i]--;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += concent[i];
        }
        System.out.println(cnt);
    }
}
