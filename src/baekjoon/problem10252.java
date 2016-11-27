package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem10252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(1);
            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("(%d,%d)\n", i, j);
                        }
                    } else {
                        for (int j = m - 1; j >= 0; j--) {
                            System.out.printf("(%d,%d)\n", i, j);
                        }
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        for (int j = (i == 0 ? 0 : 1); j < m; j++) {
                            System.out.printf("(%d,%d)\n", i, j);
                        }
                    } else {
                        for (int j = m - 1; j >= 1; j--) {
                            System.out.printf("(%d,%d)\n", i, j);
                        }
                    }
                }
                for (int i = n - 1; i >= 1; i--) {
                    System.out.printf("(%d,%d)\n", i, 0);
                }
            }
        }
    }
}
