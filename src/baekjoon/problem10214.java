package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem10214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int Yonsei = 0;
            int Korea = 0;
            for (int i = 0; i < 9; i++) {
                Yonsei += scanner.nextInt();
                Korea += scanner.nextInt();
            }
            if (Yonsei > Korea) {
                System.out.println("Yonsei");
            } else if (Yonsei < Korea) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
