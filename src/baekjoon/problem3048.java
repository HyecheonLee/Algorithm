package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 30..
 */
public class problem3048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        String groupA = scanner.next();
        String gruopB = scanner.next();
        int T = scanner.nextInt();
        char[][] seq = new char[N1 + N2][2];
        int cnt = 0;
        for (int i = N1 - 1; i >= 0; i--) {
            seq[cnt][0] = '>';
            seq[cnt++][1] = groupA.charAt(i);
        }
        cnt = 0;
        for (int i = N1; i < N1 + N2; i++) {
            seq[i][0] = '<';
            seq[i][1] = gruopB.charAt(cnt++);
        }

        System.out.println();
        while (T-- > 0) {
            boolean[] check = new boolean[seq.length];
            for (int i = 0; i < seq.length - 1; i++) {
                if (seq[i][0] != seq[i + 1][0] && !check[i]) {
                    swap(seq, i, i + 1);
                    check[i] = check[i + 1] = true;
                }
            }
        }
        for (int i = 0; i < seq.length; i++) {
            System.out.print(seq[i][1]);
        }
    }

    private static void swap(char[][] seq, int i, int j) {
        char temp1 = seq[i][0];
        char temp2 = seq[i][1];
        seq[i][0] = seq[j][0];
        seq[i][1] = seq[j][1];
        seq[j][0] = temp1;
        seq[j][1] = temp2;
    }
}
