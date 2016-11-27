package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 30..
 */
public class problem1173 {
    static int N, m, M, T, R;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        m = scanner.nextInt();
        M = scanner.nextInt();
        T = scanner.nextInt();
        R = scanner.nextInt();

        int cnt = 0;
        int minute = 0;
        int p = m;
        while (N > cnt) {
            minute++;
            if (p + T <= M) {
                p += T;
                cnt++;
            } else if (p - R >= m) p -= R;
            else if (p != m) p = m;
            else break;
        }
        if (cnt == N) System.out.println(minute);
        else System.out.println("-1");
    }
}
