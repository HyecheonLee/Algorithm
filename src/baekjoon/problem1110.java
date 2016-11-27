package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 23..
 */
public class problem1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            N = scanner.nextInt();
        } while (!(N >= 0 && N <= 99));
        int temp = N;
        int a, b, c;
        int cnt = 0;
        do {
            a = temp / 10;
            b = temp % 10;
            c = a + b;
            c = c % 10;
            temp = b * 10 + c;
            cnt++;
        } while (N != temp);
        System.out.println(cnt);
    }
}
