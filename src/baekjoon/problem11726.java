package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 4..
 */
public class problem11726 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] numArr = new long[N];
        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            numArr[0] = 1;
            numArr[1] = 2;
            for (int i = 2; i < N; i++) {
                numArr[i] = (numArr[i - 1] + numArr[i - 2]) % 10007;
            }
            System.out.println(numArr[N - 1]);
        }
    }
}
