package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem1063 {
    static final int[] R = {0, 1}, L = {0, -1}, B = {-1, 0}, T = {1, 0}, RT = {1, 1}, LT = {1, -1}, RB = {-1, 1}, LB = {-1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] king = new int[2];
        int[] ston = new int[2];
        {
            String temp = scanner.next();
            king[0] = temp.charAt(0) - 'A';
            king[1] = temp.charAt(1) - '1';
            temp = scanner.next();
            ston[0] = temp.charAt(0) - 'A';
            ston[1] = temp.charAt(1) - '1';
        }
        int N = scanner.nextInt();
        while (N-- > 0) {
            String temp = scanner.next();
            switch (temp) {
                case "R":
                    if (king[0] + R[0] >= 0 && king[1] + R[1] < 8) {
                        king[0] += R[0];
                        king[1] += R[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += R[0];
                            ston[1] += R[1];
                        }
                    }
                    break;
                case "L":
                    if (king[0] + L[0] >= 0 && king[1] + L[1] < 8) {
                        king[0] += L[0];
                        king[1] += L[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += L[0];
                            ston[1] += L[1];
                        }
                    }
                    break;
                case "B":
                    if (king[0] + B[0] >= 0 && king[1] + B[1] < 8) {
                        king[0] += B[0];
                        king[1] += B[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += B[0];
                            ston[1] += B[1];
                        }
                    }
                    break;
                case "T":
                    if (king[0] + T[0] >= 0 && king[1] + T[1] < 8) {
                        king[0] += T[0];
                        king[1] += T[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += T[0];
                            ston[1] += T[1];
                        }
                    }
                    break;
                case "RT":
                    if (king[0] + RT[0] >= 0 && king[1] + RT[1] < 8) {
                        king[0] += RT[0];
                        king[1] += RT[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += RT[0];
                            ston[1] += RT[1];
                        }
                    }
                    break;
                case "LT":
                    if (king[0] + LT[0] >= 0 && king[1] + LT[1] < 8) {
                        king[0] += LT[0];
                        king[1] += LT[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += LT[0];
                            ston[1] += LT[1];
                        }
                    }
                    break;
                case "RB":
                    if (king[0] + RB[0] >= 0 && king[1] + RB[1] < 8) {
                        king[0] += RB[0];
                        king[1] += RB[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += RB[0];
                            ston[1] += RB[1];
                        }
                    }
                    break;
                case "LB":
                    if (king[0] + LB[0] >= 0 && king[1] + LB[1] < 8) {
                        king[0] += LB[0];
                        king[1] += LB[1];
                        if (king[0] == ston[0] && king[1] == ston[1]) {
                            ston[0] += LB[0];
                            ston[1] += LB[1];
                        }
                    }
                    break;
            }
        }
        System.out.println(king[0] + "," + king[1]);
        System.out.println(ston[0] + "," + ston[1]);
    }
}
