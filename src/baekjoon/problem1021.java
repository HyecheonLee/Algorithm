package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 12..
 */
public class problem1021 {
    static int[] number;
    private static int[] numberSet;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            numberSet[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> distance = new HashMap<>();
        int pointer = 0;
        for (int i = 0; i < M; i++) {
            if (numberSet[i] > N / 2) {
                distance.put(numberSet[i], N - numberSet[i] + 1);
            } else {
                distance.put(numberSet[i], numberSet[i] - 1);
            }
        }

    }
}
