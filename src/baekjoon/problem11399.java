package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        temp[0] = arr[0];
        for (int i = 1; i < N; i++) {
            temp[i] = arr[i] + temp[i - 1];
        }
        System.out.println(Arrays.stream(temp).sum());
    }
}
