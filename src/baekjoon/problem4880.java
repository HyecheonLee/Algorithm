package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 30..
 */
public class problem4880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        while (!(a == 0 && b == 0 && c == 0)) {
            int d1 = b - a;
            int d2 = c - b;
            if (d1 == d2) {
                System.out.println("AP " + (c + d1));
            } else {
                int r1 = b / a;
                int r2 = c / b;
                if (r1 == r2) {
                    System.out.println("GP " + (c * r1));
                }
            }
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
    }
}
