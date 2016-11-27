package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem10253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while (a != 1) {
                int c = b / a + 1;
                a = a * c - b;
                b = b * c;
                int g = gcd(a, b);
                a /= g;
                b /= g;
            }
            System.out.println(b);
        }
    }

    public static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }
}
