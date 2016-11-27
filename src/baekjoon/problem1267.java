package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 29..
 */
public class problem1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int Y = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            int temp = 1;
            temp += arr[i] / 30;
            int temp2 = 1;
            temp2 += arr[i] / 60;
            Y += temp * 10;
            M += temp2 * 15;
        }
        if (Y == M) {
            System.out.println("Y M " + M);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y " + Y);
        }
    }
}
