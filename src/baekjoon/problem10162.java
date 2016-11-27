package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem10162 {
    public static void main(String[] args) {
        int A = 60 * 5;
        int B = 60 * 1;
        int C = 10;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        String number = T / A + " ";
        T %= A;
        number += T / B + " ";
        T %= B;
        number += T / C;
        if (T % C != 0) {
            System.out.println(-1);
        } else {
            System.out.println(number);
        }

    }
}
