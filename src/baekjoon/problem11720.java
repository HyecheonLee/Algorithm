package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;

        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
