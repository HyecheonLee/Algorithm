package baekjoon;

import java.util.Scanner;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int mod = 1;
            for (int i = 0; i < b; i++) {
                mod = (mod * a) % 10;
            }
            if (mod == 0) {
                System.out.println(10);
            } else {
                System.out.println(mod);
            }
        }
    }
}
