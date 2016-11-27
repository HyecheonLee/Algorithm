package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 12..
 */
public class problem1547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long temp = 1;
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            long temp2 = 1 << X - 1;
            temp2 |= 1 << Y - 1;
            if ((temp & temp2) != 0) {
                temp ^= temp2;
            }
        }
        System.out.println((int) (Math.log(temp) / Math.log(2)) + 1);
    }
}
