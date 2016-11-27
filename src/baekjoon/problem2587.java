package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2587 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("%d\n", (int) Arrays.stream(arr).average().getAsDouble());
        System.out.println(arr[2]);
    }
}
