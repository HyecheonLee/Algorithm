package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 14..
 */
public class problem2480 {
    public static void main(String[] args) {
        int[] dices = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            dices[scanner.nextInt()]++;
        }
        int money = 0;
        int maxValue = 0;
        for (int i = 0; i < dices.length; i++) {
            if (dices[i] == 3) {
                money = 10000 + (i) * 1000;
            }
            if (dices[i] == 2) {
                money = 1000 + (i) * 100;
            }
            if (dices[i] == 1) {
                maxValue = maxValue > i ? maxValue : i;
            }
        }
        money = money > maxValue * 100 ? money : maxValue * 100;
        System.out.println(money);
    }
}
