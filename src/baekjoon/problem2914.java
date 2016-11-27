package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem2914 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int I = scanner.nextInt();

        int mean = A * (I - 1);
        System.out.println(mean + 1);

    }
}
