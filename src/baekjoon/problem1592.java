package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 30..
 */
public class problem1592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int L = scanner.nextInt();
        int[] takenBall = new int[N];
        takenBall[0] = 1;
        int sp = 0;
        int cnt = 0;
        while (true) {
            cnt++;
            if (takenBall[sp] % 2 != 0) {
                sp += L;
                sp %= N;
            } else {
                sp -= L;
                sp += N;
                sp %= N;
            }
            takenBall[sp] += 1;
            if (takenBall[sp] == M) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
