package baekjoon;

import java.util.Scanner;

public class problem11501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int stock[] = new int[N];
            int pivot[] = new int[N];
            long sum = 0;
            int cnt = 0;
            stock[0] = scanner.nextInt();
            int max;
            for (int i = 1; i < N; i++) {
                stock[i] = scanner.nextInt();
                if (stock[i - 1] - stock[i] > 0) {
                    pivot[cnt++] = i - 1;
                }
            }
            pivot[cnt] = N - 1;
            cnt++;
            int x = 0;
            max = stock[pivot[x]];
            for (int i = 0; i < cnt; i++) {
                if (max < stock[pivot[i]]) {
                    max = stock[pivot[i]];
                    x = i;
                }
            }
            for (int i = 0; i < N; i++) {
                int diff = stock[pivot[x]] - stock[i];
                if (diff == 0) {
                    x++;
                    max = stock[pivot[x]];
                    for (int j = x + 1; j < cnt; j++) {
                        if (max < stock[pivot[j]]) {
                            max = stock[pivot[j]];
                            x = j;
                        }
                    }
                }
                sum += diff;
            }
            System.out.println(sum);
        }
    }
}
