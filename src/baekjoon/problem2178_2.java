package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 14..
 */
public class problem2178_2 {
    public static void main(String[] args) {
        int[] xx = {0, 0, -1, 1};
        int[] yy = {-1, 1, 0, 0};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++)
            matrix[i] = s.next().toCharArray();
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        Queue<Integer> qc = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        qx.add(0);
        qy.add(0);
        qc.add(1);
        while (!qx.isEmpty()) {
            int x = qx.poll();
            int y = qy.poll();
            int c = qc.poll();
            if (x == n - 1 && y == m - 1) {
                System.out.println(c);
                break;
            }
            for (int i = 0; i < 4; i++)
                if (x + xx[i] >= 0 && x + xx[i] < n && y + yy[i] >= 0 && y + yy[i] < m
                        && matrix[x + xx[i]][y + yy[i]] == '1' && !visited[x + xx[i]][y + yy[i]]) {
                    visited[x + xx[i]][y + yy[i]] = true;
                    qx.add(x + xx[i]);
                    qy.add(y + yy[i]);
                    qc.add(c + 1);
                }
        }
    }
}
