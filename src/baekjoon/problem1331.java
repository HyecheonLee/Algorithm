package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 30..
 */
public class problem1331 {
    static int[] knightX = {1, -1, 1, -1, 2, 2, -2, -2};
    static int[] knightY = {2, 2, -2, -2, 1, -1, 1, -1};
    static int[][] chess;
    static boolean[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        chess = new int[36][2];
        map = new boolean[7][7];
        boolean ok = true;
        for (int i = 0; i < 36; i++) {
            String[] temp = bufferedReader.readLine().split("");
            chess[i][0] = change(temp[0]);
            chess[i][1] = Integer.parseInt(temp[1]);
            if (map[chess[i][0]][chess[i][1]]) {
                ok = false;
            }
            map[chess[i][0]][chess[i][1]] = true;
        }

        if (!ok) {
            System.out.println("Invalid");
            return;
        }

        for (int i = 0; i < 35; i++) {
            ok = false;
            for (int j = 0; j < knightX.length; j++) {
                if (chess[i][0] + knightX[j] == chess[i + 1][0] && chess[i][1] + knightY[j] == chess[i + 1][1]) {
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println("Invalid");
                return;
            }
        }
        ok = false;
        for (int j = 0; j < knightX.length; j++) {
            if (chess[35][0] + knightX[j] == chess[0][0] && chess[35][1] + knightY[j] == chess[0][1]) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }

    private static int change(String s) {
        int temp = 0;
        switch (s) {
            case "A":
                temp = 1;
                break;
            case "B":
                temp = 2;
                break;
            case "C":
                temp = 3;
                break;
            case "D":
                temp = 4;
                break;
            case "E":
                temp = 5;
                break;
            case "F":
                temp = 6;
                break;

        }
        return temp;
    }
}
