package Else;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 12..
 */
public class BinaryFlips {
    static int N;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        K = scanner.nextInt();
        N = A + B;
        if (A != B && A + B <= K) {
            System.out.println(-1);
            return;
        }
        int cnt = 0;
        search(A, B, 0);
    }

    private static int search(int a, int b, int cnt) {
        if (a == 0)
            return 0;
        if (a + b < K) return -1;
        int[] array = new int[a + b + 1];
        for (int i = 0; i <= a + b; i++) array[i] = -1;
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        array[a] = 0;
        while (!q.isEmpty()) {
            int i = q.poll();
            for (int j = Math.max(0, K - (a + b - i)); j <= Math.min(i, K); j++) {
                int nextZero = i + (K - 2 * j);
                if (array[nextZero] == -1) {
                    if (nextZero == 0) return array[i] + 1;
                    array[nextZero] = array[i] + 1;
                    q.add(nextZero);
                }
            }
        }
        return -1;
    }
}
