package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N];
        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
            maxValue = maxValue > score[i] ? maxValue : score[i];
        }
        final int M = maxValue;
        System.out.printf("%.2f", Arrays.stream(score)
                .mapToDouble(operand -> ((double) operand / M) * 100).average().getAsDouble());
    }
}
