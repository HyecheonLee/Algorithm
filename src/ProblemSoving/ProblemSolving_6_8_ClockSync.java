package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 20..
 */
public class ProblemSolving_6_8_ClockSync {
    static int INF = 9999;
    static int[][] linked = {
            {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int T = scanner.nextInt(); T > 0; T--) {
            int[] clock = new int[16];
            for (int i = 0; i < 16; i++) {
                clock[i] = scanner.nextInt();
            }
            System.out.println(pushSwitch(clock, 0));
        }
    }

    private static int pushSwitch(int[] clock, int switchNum) {
        if (checkClock(clock)) {
            return 0;
        }
        if (switchNum > 9) {
            return INF;
        }
        int ret = INF;
        for (int i = 0; i < 4; i++) {
            ret = Math.min(ret, i + pushSwitch(clock, switchNum + 1));
            setClock(clock, switchNum);
        }
        return ret;
    }

    private static void setClock(int[] clock, int switchNum) {
        for (int i = 0; i < 16; i++) {
            clock[i] = (clock[i] + linked[switchNum][i] * 3);
            if (clock[i] == 15) clock[i] = 3;
        }
    }

    private static boolean checkClock(int[] clock) {
        boolean ok = true;
        for (int i = 0; i < 16; i++) {
            if (clock[i] != 12) {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
