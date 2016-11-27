package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1904 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = cal(N);
        System.out.println(sum);
    }

    private static long cal(int n) {
        long temp = 0;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            long n1 = 1;
            long n2 = 2;
            for (int i = 3; i <= n; i++) {
                temp = n1 + n2;
                temp %= 15746;
                n1 = n2;
                n2 = temp;
            }
            return temp;
        }
    }
}
