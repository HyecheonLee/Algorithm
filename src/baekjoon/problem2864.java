package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem2864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        A = A.replace('6', '5');
        B = B.replace('6', '5');
        int num = Integer.parseInt(A) + Integer.parseInt(B);
        System.out.println(num);

        A = A.replace('5', '6');
        B = B.replace('5', '6');
        num = Integer.parseInt(A) + Integer.parseInt(B);
        System.out.println(num);

    }
}
