package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1476 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();
        int year = 1;
        int e = 1, s = 1, m = 1;
        while (!(E == e && S == s && M == m)) {
            e++;
            s++;
            m++;
            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;
            year++;
        }
        System.out.println(year);
    }
}
