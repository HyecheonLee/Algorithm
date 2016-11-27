package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem2004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = N - M;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int num1 = 0, num2 = 0, num3 = 0;
        //
        int temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (N / Math.pow(5, i));
            sum1 += temp;
        }
        temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (N / Math.pow(2, i));
            num1 += temp;
        }
        //
        temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (M / Math.pow(5, i));
            sum2 += temp;
        }
        temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (M / Math.pow(2, i));
            num2 += temp;
        }
        //
        temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (K / Math.pow(5, i));
            sum3 += temp;
        }
        temp = 1;
        for (int i = 1; temp != 0; i++) {
            temp = (int) (K / Math.pow(2, i));
            num3 += temp;
        }
        int temp1 = sum1 - (sum2 + sum3);
        int temp2 = num1 - (num2 + num3);
        if (temp1 > temp2) {
            System.out.println(temp2);
        } else {
            System.out.println(temp1);
        }
    }
}