package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 29..
 */
public class problem1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long d = c - b;
        if (d <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(a / d + 1);
        }
    }
}
