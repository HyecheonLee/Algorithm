package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem2355 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        long A = 1, B = 1;
        if (a % 2 == 0) {
            A *= (a / 2);
            A *= (a - 1);
        } else {
            A *= ((a - 1) / 2);
            A *= a;
        }
        if (b % 2 == 0) {
            B *= (b / 2);
            B *= (b + 1);
        } else {
            B *= ((b + 1) / 2);
            B *= b;
        }

        System.out.println(B - A);
    }
}
