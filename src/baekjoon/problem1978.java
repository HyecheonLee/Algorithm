package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 23..
 */
public class problem1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] prime = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            prime[i] = scanner.nextInt();
            if (max < prime[i])
                max = prime[i];
        }
        boolean[] searchPrime = new boolean[max + 1];
        searchPrime[1] = true;
        searchPrime[0] = true;
        for (int i = 1; i <= max; i = i + 2) {
            if (!searchPrime[i]) {
                for (int j = 2; j * i <= max; j++) {
                    searchPrime[i * j] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (prime[i] % 2 == 1 && !searchPrime[prime[i]]) {
                cnt++;
            } else if (prime[i] == 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
