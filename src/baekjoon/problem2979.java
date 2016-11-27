package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem2979 {
    static int[] price;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        price = new int[3];
        for (int i = 0; i < 3; i++) {
            price[i] = scanner.nextInt();
        }
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int[][] car = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                car[i][j] = scanner.nextInt();
                start = Math.min(car[i][j], start);
                end = Math.max(car[i][j], end);
            }
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            int carNum = 0;
            for (int j = 0; j < 3; j++) {
                if (i >= car[j][0] && i < car[j][1]) {
                    carNum++;
                }
            }
            sum += price[carNum - 1] * carNum;
        }
        System.out.println(sum);
    }
}