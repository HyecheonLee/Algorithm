package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 6..
 */
public class problem9507 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        long[] fibonacci = new long[100];

        while (T-- > 0) {
            int N = scanner.nextInt();
            if (fibonacci[N] != 0) {
                System.out.println(fibonacci[N]);
                continue;
            }
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            fibonacci[2] = 2;
            fibonacci[3] = 4;
            boolean check = false;
            int k = 0;
            for (int i = 4; i <= N; i++) {
                if (fibonacci[i] == 0) {
                    if (fibonacci[i] > Math.pow(2, 60)) {
                        check = true;
                        k = i;
                        break;
                    } else {
                        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2] + fibonacci[i - 3] + fibonacci[i - 4];
                    }
                }
            }
            if (check) {
                BigInteger bigInteger1 = BigInteger.valueOf(0);
                for (int i = 1; i <= 4; i++) {
                    bigInteger1 = bigInteger1.add(BigInteger.valueOf(fibonacci[k - i]));
                }
                System.out.println(bigInteger1);
            } else {
                System.out.println(fibonacci[N]);
            }
        }
    }
}
