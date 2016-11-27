package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 4..
 */
public class problem9461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            long save[] = new long[N];
            if (N <= 3) {
                System.out.println(1);
            } else {
                save[0] = save[1] = save[2] = 1;

                for (int i = 3; i < N; i++) {
                    save[i] = save[i - 2] + save[i - 3];
                }
                System.out.println(save[N - 1]);
            }
        }
    }
}
