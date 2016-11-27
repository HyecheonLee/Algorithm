package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 10. 19..
 */
public class problem2982 {
    static int B;
    static int[][] map;
    static int maxValue = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] num = reader.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        num = reader.readLine().split(" ");
        int A = Integer.parseInt(num[0]);
        B = Integer.parseInt(num[1]);
        int K = Integer.parseInt(num[2]), G = Integer.parseInt(num[3]);
        int[] move = new int[G];
        num = reader.readLine().split(" ");
        for (int i = 0; i < G; i++) {
            move[i] = Integer.parseInt(num[i]);
        }
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = maxValue;
            }
        }
        for (int i = 0; i < M; i++) {
            num = reader.readLine().split(" ");
            int y = Integer.parseInt(num[0]) - 1;
            int x = Integer.parseInt(num[1]) - 1;
            int l = Integer.parseInt(num[2]);
            map[y][x] = l;
            map[x][y] = l;
        }

        int[] distance = map[0];
        distance[0] = 0;
        int[] visited = new int[N];
        visited[0] = 1;

        int[] preD = new int[N];
        int min;
        int nextNode = 0;

        //start with the algorithm
        for (int i = 0; i < N; ++i) {
            min = 999;
            for (int j = 0; j < N; ++j) {
                if (min > distance[j] && visited[j] != 1) {
                    min = distance[j];
                    nextNode = j;
                }
            }
            visited[nextNode] = 1;
            //actual start of the algorithm!
            for (int c = 0; c < N; ++c) {
                if (visited[c] != 1) {
                    if (min + map[nextNode][c] < distance[c]) {
                        distance[c] = min + map[nextNode][c];
                        preD[c] = nextNode;
                    }
                }
            }
        }

        for (int i = 0; i < N; ++i) {

            System.out.print("|" + distance[i]);
        }
        System.out.println("|");

        //printing the paths!

        for (int i = 0; i < N; ++i) {
            int j;
            System.out.print("Path = " + i);
            j = i;
            int sum = 0;
            do {
                j = preD[j];
                sum += map[j][preD[j]];
                System.out.print("<-" + j);
            } while (j != 0);
            System.out.println(" "+sum+" ");
            System.out.println();
        }

    }
}
