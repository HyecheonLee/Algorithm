package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 2..
 */
public class problem2597 {
    static long[] save;
    static int[] stair;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        stair = new int[N + 1];
        save = new long[N + 1];
        stair[0] = 0;
        for (int i = 0; i < N; i++) {
            stair[i] = scanner.nextInt();
        }
        System.out.println(score(N - 1));
    }

     static long score(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return stair[n];
        }
        if(save[n]!=0){
            return save[n];
        }
        long temp = score(n - 3) + stair[n] + stair[n - 1];
        long temp2 = score(n - 2) + stair[n];
        return save[n]=temp > temp2 ? temp : temp2;
    }
}
