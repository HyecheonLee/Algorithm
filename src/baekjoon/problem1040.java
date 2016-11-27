package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 8..
 */
public class problem1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int K = scanner.nextInt();
        int[] arrInts = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arrInts[i] = N.charAt(i) - '0';
        }
        int[] store = new int[10];
        int index = 0;
        int min = Integer.MIN_VALUE;
        while (K != 0) {
            int temp = arrInts[index];
            min = min < temp ? min : temp;
            if (store[temp] != 0) {
                store[temp]++;
            } else {
                store[temp]++;
                K--;
            }
            index++;
        }
        for (int i = index; i < arrInts.length; i++) {
            if (arrInts[i - 1] != arrInts[i]) {

            }
        }
        for (int i = index; i < arrInts.length; i++) {

        }
    }
}
