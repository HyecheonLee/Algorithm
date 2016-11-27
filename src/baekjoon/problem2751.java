package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem2751 {
    public static void main(String[] args) {
        int N = 3;
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[N];
        for (int i = 0; i < N; i++) {
            ints[i] = scanner.nextInt();
        }
        Arrays.stream(ints).sorted().forEach(value -> System.out.print(value + " "));
    }
}
