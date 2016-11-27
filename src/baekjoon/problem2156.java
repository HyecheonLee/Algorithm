package baekjoon;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by ihyecheon on 2016. 7. 3..
 */
public class problem2156 {
    static int[] grapeJuice;
    static int[] store;
    static int maxValue = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        grapeJuice = new int[N + 2];
        store = new int[N + 2];
        grapeJuice[0] = 0;
        grapeJuice[1] = 0;
        for (int i = 2; i < N + 2; i++) {
            grapeJuice[i] = scanner.nextInt();
        }
        counter(N + 1);
        for (int i = 0; i < N + 2; i++) {
            store[i] = 0;
        }
        counter(N);
        System.out.println(maxValue);
    }

    private static int counter(int n) {
        if (n == 0) {
            return grapeJuice[0];
        }
        if (n < 0) {
            return 0;
        }
        if (store[n] != 0) {
            return store[n];
        }
        int temp1 = counter(n - 4) + grapeJuice[n - 1] + grapeJuice[n];
        int temp2 = counter(n - 3) + grapeJuice[n - 1] + grapeJuice[n];
        int temp3 = counter(n - 2) + grapeJuice[n];
        store[n] = store[n] > temp1 ? store[n] : temp1;
        store[n] = store[n] > temp2 ? store[n] : temp2;
        store[n] = store[n] > temp3 ? store[n] : temp3;
        maxValue = maxValue > store[n] ? maxValue : store[n];
        return store[n];
    }
}
