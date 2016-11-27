package AlgorithmProblemSolving.chpater11;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 24..
 */
public class Section03 {
    static int FIRE_MAX;
    static int M, N, X;
    static int[][] Building, Path;
    static int[][] path;
    static char[] dir = {'\0', 'U', 'L', 'R', 'D'};
    static int resN, resY, resX;
    static boolean found;
    static char[] res;
    static int stx, sty;
    static int[][] MyQueue;
    static int rear, front;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        X = scanner.nextInt();
        Building = new int[M][N];
        FIRE_MAX = M * N;
        int x = 0, y = 0;
        for (int i = 0; i < M; i++) {
            String temp = scanner.next();
            for (int j = 0; j < N; j++) {
                if (temp.charAt(j) == 'F') {
                    Building[i][j] = FIRE_MAX;
                } else if (temp.charAt(j) == 'Y') {
                    x = j;
                    y = i;
                } else if (temp.charAt(j) == '0')
                    Building[i][j] = 0;
                else
                    Building[i][j] = -1;
            }
        }
        searchPath(x, y);
    }

    private static void searchPath(int x, int y) {

    }
}
