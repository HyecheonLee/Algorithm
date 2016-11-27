package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 8. 3..
 */
public class problem1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int x1, y1;
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            int x2, y2;
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            int n = scanner.nextInt();
            long cx;
            long cy;
            long r;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                cx = scanner.nextInt();
                cy = scanner.nextInt();
                r = scanner.nextInt();
                long temp1 = (cx - x1) * (cx - x1) + (cy - y1) * (cy - y1) - r * r;
                long temp2 = (cx - x2) * (cx - x2) + (cy - y2) * (cy - y2) - r * r;
                if (temp1 > 0 && temp2 < 0) {
                    cnt++;
                }
                if (temp1 < 0 && temp2 > 0) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
