package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem4504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num;
        num = scanner.nextInt();
        while (num != 0) {
            if (num % N== 0) {
                System.out.println(num + " is a multiple of " + N + ".");
            } else {
                System.out.println(num + " is NOT a multiple of " + N + ".");
            }
            num = scanner.nextInt();
        }
    }
}
