package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 14..
 */
public class problem1697 {
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, K;
        visited = new boolean[100_001];
        N = scanner.nextInt();
        K = scanner.nextInt();
        BFS(N, K);
    }

    private static void BFS(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> cnt = new LinkedList<>();
        cnt.add(0);
        queue.add(N);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int c = cnt.poll();
            if (current == K) {
                System.out.println(c);
                return;
            }
            if (current + 1 <= 100_000 && !visited[current + 1]) {
                queue.add(current + 1);
                cnt.add(c + 1);
                visited[current + 1] = true;
            }
            if (current - 1 >= 0 && !visited[current - 1]) {
                queue.add(current - 1);
                cnt.add(c + 1);
                visited[current - 1] = true;
            }
            if (current * 2 <= 100_000 && !visited[current * 2]) {
                queue.add(current * 2);
                cnt.add(c + 1);
                visited[current * 2] = true;
            }
        }
    }
}
