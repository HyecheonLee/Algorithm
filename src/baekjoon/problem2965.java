package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem2965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;
        max = max > b - a ? max : b - a;
        max = max > c - b ? max : c - b;
        System.out.println(max - 1);
    }
}
