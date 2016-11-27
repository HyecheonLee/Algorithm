package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1964 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n1 = 5;
        int temp = 5;
        for (int i = 2; i <= N; i++) {
            temp = n1 + i * 3 + 1;
            temp %= 45678;
            n1 = temp;
        }
        System.out.println(temp);
    }
}
