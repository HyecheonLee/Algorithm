package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        int temp = 5;

        while (temp <= N) {
            sum += (N / temp);
            temp *= 5;
        }
        System.out.print(sum);
    }
}
