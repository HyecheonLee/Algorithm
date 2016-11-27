package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem1735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int X = A * D + C * B;
        int Y = B * D;
        int div = func(Y, X);
        System.out.printf("%d %d", X / div, Y / div);
    }

    private static int func(int y, int x) {
        if (y % x == 0) {
            return x;
        } else {
            return func(x, y % x);
        }
    }
}
