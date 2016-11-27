package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 2;
        while (N != 1) {
            if (N % cnt == 0) {
                N /= cnt;
                System.out.println(cnt);
                cnt = 2;
            } else {
                cnt++;
            }
        }
    }
}
