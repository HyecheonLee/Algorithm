package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 2..
 */
public class problem1463 {
    static int min = Integer.MAX_VALUE;
    static int[] save;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        save = new int[N + 1];
        oneMake(N);
        System.out.println(save[N]);
    }

    private static int oneMake(int n) {
        if (n == 1) {
            return 0;
        }
        if (save[n] != 0) {
            return save[n];
        }
        int temp;
        int temp1 = Integer.MAX_VALUE;
        int temp2 = Integer.MAX_VALUE;
        int temp3;
        if (n % 3 == 0) {
            temp1 = oneMake(n / 3) + 1;
        }
        if (n % 2 == 0) {
            temp2 = oneMake(n / 2) + 1;
        }
        temp3 = oneMake(n - 1) + 1;

        temp = temp1 < temp2 ? temp1 : temp2;
        temp = temp < temp3 ? temp : temp3;
        save[n] = temp;
        return save[n];
    }
}
