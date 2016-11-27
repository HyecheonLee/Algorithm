package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 2..
 */
public class problem2193 {
    static long[] save;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        save = new long[N + 1];
        System.out.println(calculator(N));
    }

    private static long calculator(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            if (save[n] != 0) {
                return save[n];
            }
            save[n] = calculator(n - 1) + calculator(n - 2);
            return save[n];
        }
    }
}
