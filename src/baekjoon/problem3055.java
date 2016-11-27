package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ihyecheon on 2016. 7. 13..
 */
public class problem3055 {
    static int xD, yD;
    static int min = Integer.MAX_VALUE;
    static int[] dy = {-1, 1, 0, 0}, dx = {0, 0, -1, 1};
    static Queue<Integer> xW = new LinkedList<>();
    static Queue<Integer> yW = new LinkedList<>();
    static HashMap<Integer, String[][]> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] reader = bufferedReader.readLine().split(" ");
        int R = Integer.parseInt(reader[0]);
        int C = Integer.parseInt(reader[1]);
        String[][] maze = new String[R][C];
        for (int i = 0; i < R; i++) {
            String[] temp = bufferedReader.readLine().split("");
            for (int j = 0; j < C; j++) {
                maze[i][j] = temp[j];
            }
        }
        int xS = 0, yS = 0;
        int check = 0;
        int starCnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (maze[i][j].equals("D")) {
                    yD = i;
                    xD = j;
                    check--;
                }
                if (maze[i][j].equals("S")) {
                    yS = i;
                    xS = j;
                }
                if (maze[i][j].equals("*")) {
                    yW.add(i);
                    xW.add(j);
                    starCnt++;
                }
            }
        }
        check += (R * C);
        int cnt = 0;

        while (!yW.isEmpty()) {
            String[][] temp = new String[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    temp[i][j] = maze[i][j];
                }
            }
            map.put(cnt, temp);

            if (check == starCnt) break;

            cnt++;
            Queue<Integer> tempQueueY = new LinkedList<>();
            Queue<Integer> tempQueueX = new LinkedList<>();
            while (!yW.isEmpty()) {
                int y = yW.poll();
                int x = xW.poll();
                for (int i = 0; i < 4; i++) {
                    int tempY = y + dy[i];
                    int tempX = x + dx[i];
                    if (tempY >= 0 && tempY < maze.length && tempX >= 0 && tempX < maze[0].length) {
                        if (maze[tempY][tempX].equals(".") || maze[tempY][tempX].equals("S")) {
                            maze[tempY][tempX] = "*";
                            tempQueueY.add(tempY);
                            tempQueueX.add(tempX);
                            starCnt++;
                        }
                    }
                }
            }
            yW.addAll(tempQueueY);
            xW.addAll(tempQueueX);
        }
        search(yS, xS, 0);
        if (min == Integer.MAX_VALUE) {
            System.out.println("KAKTUS");
        } else {
            System.out.println(min);
        }
    }

    private static void search(int yS, int xS, int cnt) {
        if (yS == yD && xS == xD) {
            min = Math.min(min, cnt);
            return;
        } else {
            String[][] maze = map.get(cnt + 1);
            if (maze == null) return;

            for (int i = 0; i < 4; i++) {
                int tempY = yS + dy[i];
                int tempX = xS + dx[i];
                if (tempY >= 0 && tempY < maze.length && tempX >= 0 && tempX < maze[0].length) {
                    if (!maze[tempY][tempX].equals("*")) {
                        search(tempY, tempX, cnt + 1);
                    }
                }
            }
            return;
        }
    }
}
