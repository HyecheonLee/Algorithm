package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 29..
 */
public class problem1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            double d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            d = Math.sqrt(d);
            int max = r1 > r2 ? r1 : r2;
            int min = r1 < r2 ? r1 : r2;

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println("-1");
            } else {
                if (max >= d - min && d + min >= max) { //
                    if (max == d - min || max == d + min) {
                        System.out.println("1");
                    } else {
                        System.out.println("2");
                    }
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
