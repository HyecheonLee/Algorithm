package Else;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 11..
 */
public class CirclesCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Y[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            R[i] = scanner.nextInt();
        }
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int temp1 = (x1 - X[i]) * (x1 - X[i]) + (y1 - Y[i]) * (y1 - Y[i]) - R[i] * R[i];
            int temp2 = (x2 - X[i]) * (x2 - X[i]) + (y2 - Y[i]) * (y2 - Y[i]) - R[i] * R[i];
            if (temp1 * temp2 < 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
