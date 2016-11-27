package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int square = (int) Math.sqrt(N);
        int sum = 0;
        int i = square;
        for (; i * i >= M; i--) {
            sum += i * i;
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(++i * i);
        }
    }
}
