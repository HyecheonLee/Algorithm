package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 23..
 */
public class problem1094 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int cnt = 0;
        recursive(X, 6, cnt);
    }

    private static void recursive(int x, int i, int cnt) {
        if (i < 0) {
            return;
        } else {
            if (x - (1 << i) > 0) {
                recursive(x - (1 << i), i - 1, ++cnt);
            } else if (x - (1 << i) == 0) {
                System.out.println(cnt + 1);
                return;
            } else {
                recursive(x, i - 1, cnt);
            }
        }
    }
}
