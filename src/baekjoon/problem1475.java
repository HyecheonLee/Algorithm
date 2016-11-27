package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int[] check = new int[10];
        for (int i = 0; i < N.length(); i++) {
            check[N.charAt(i) - '0']++;
        }
        int mean = check[6] + check[9];
        if (mean % 2 == 1) {
            mean++;
        }
        check[6] = check[9] = mean / 2;
        Arrays.sort(check);
        System.out.println(check[9]);
    }
}
