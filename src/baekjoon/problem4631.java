package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 29..
 */
public class problem4631 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = 0;
        while (N > 0) {
            C++;
            String[] strings = new String[N];
            String[] temp = new String[N];
            for (int i = 0; i < N; i++) {
                strings[i] = scanner.next();
            }
            int i = 0, j = N - 1;
            int k = 0;
            while (i < j) {
                temp[i] = strings[k++];
                temp[j] = strings[k++];
                i++;
                j--;
            }
            if (N % 2 == 1) {
                temp[i] = strings[k];
            }
            System.out.println("SET " + C);
            for (i = 0; i < N; i++) {
                System.out.println(temp[i]);
            }
            N = scanner.nextInt();
        }
    }
}
