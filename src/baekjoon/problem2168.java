package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 14..
 */
public class problem2168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double max = x > y ? x : y;
        double min = x < y ? x : y;
        System.out.println((int)(min * Math.ceil(max / min)));
//        System.out.println(x + y - gcd(x > y ? x : y, x < y ? x : y));
    }

    private static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(x % y > y ? x % y : y, x % y < y ? x % y : y);
        }
    }
}
