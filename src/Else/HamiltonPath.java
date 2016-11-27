package Else;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 11..
 */
public class HamiltonPath {
    static String[] road;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        road = new String[N];
        for (int i = 0; i < N; i++) {
            road[i] = scanner.next();
        }
        boolean[] visited = new boolean[N];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int i = 0;
        for (int k = 0; k < N; k++) {
            hashMap.put(k, 0);
            if (!visited[k]) {
                hashMap.put(k, hashMap.get(k) + 1);
                i = k;
                visited[k] = true;
            }
            for (int j = 0; j < N; j++) {
                if (!visited[j] && road[i].charAt(j) == 'Y') {
                    visited[j] = true;
                    hashMap.put(k, hashMap.get(k) + 1);
                    i = j;
                    j = 0;
                }
            }
            if (hashMap.get(k) != 2 && road[i].charAt(k) == 'Y') {
                System.out.println(0);
                return;
            }
        }
        int temp2 = 1;
        int sum = 0;
        for (int k = 0; k < N; k++) {
            int temp = hashMap.get(k);
            if (temp == 1) {
                sum++;
            } else if (temp >= 2) {
                sum++;
                temp2 *= 2;
            }
        }
        do {
            temp2 *= sum;
            sum--;
        } while (sum != 1);
        System.out.println(temp2);
    }
}
