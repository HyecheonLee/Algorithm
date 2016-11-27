package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 1;
        int Y = 1;
        int sum = 2;
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.println(X + "/" + Y);
            }
            if (sum % 2 == 0) {
                X--;
                Y = sum - X;
                if (X == 0) {
                    sum++;
                    X = 1;
                    Y = sum - X;
                }
            } else {
                Y--;
                X = sum - Y;
                if (Y == 0) {
                    sum++;
                    Y = 1;
                    X = sum - Y;

                }
            }
        }
    }
}
