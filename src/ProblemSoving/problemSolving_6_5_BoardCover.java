package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 20..
 */
public class problemSolving_6_5_BoardCover {
    static int[][][] coverType = {
            {{0, 0}, {1, 0}, {0, 1}},
            {{0, 0}, {0, 1,}, {1, 1}},
            {{0, 0}, {1, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {1, -1}}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int T = scanner.nextInt(); T > 0; T--) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int[][] board = new int[H][W];
            for (int i = 0; i < H; i++) {
                String temp = scanner.next();
                for (int j = 0; j < W; j++) {
                    if (temp.charAt(j) == '.') {
                        board[i][j] = 0;
                    } else {
                        board[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(cover(board));
        }
    }

    private static int cover(int[][] board) {
        int y = -1, x = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    y = i;
                    x = j;
                    break;
                }
            }
            if (y != -1) break;
        }
        if (y == -1) {
            return 1;
        }
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (set(board, y, x, i, 1)) {
                ret += cover(board);
            }
            set(board, y, x, i, -1);
        }
        return ret;
    }

    private static boolean set(int[][] board, int y, int x, int type, int delet) {
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            int nextY = y + coverType[type][i][0];
            int nextX = x + coverType[type][i][1];
            if (!(nextX >= 0 && nextX < board[0].length && nextY >= 0 && nextY < board.length)) {
                ok = false;
            } else if ((board[nextY][nextX] += delet) > 1) {
                ok = false;
            }
        }
        return ok;
    }
}
