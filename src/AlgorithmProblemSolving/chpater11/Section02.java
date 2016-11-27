package AlgorithmProblemSolving.chpater11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 24..
 */
public class Section02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] DNA = new int[N];
            for (int i = 0; i < N; i++) {
                DNA[i] = scanner.nextInt();
            }
            function(DNA, 0);
        }
    }

    private static void function(int[] dna, int cnt) {
        boolean ok = true;
        for (int i : dna) {
            if (i < 0) ok = false;
            System.out.print(i + " ");
        }
        System.out.println();
        if (ok) {
            int[] temp = new int[dna.length];
            int size = dna.length - 1;
            temp[size - 1] = dna[size];
            for (int i = size - 3; i > 0; i -= 2) {
                temp[i] = dna[i + 1] - temp[i + 2];
            }
            temp[0] = dna[0] - temp[1];
            for (int i = 2; i <= size; i += 2) {
                temp[i] = dna[i - 1] - temp[i - 2];
            }
            function(temp, cnt + 1);
        } else {
            System.out.println("=====================");
            System.out.println(cnt + "회 분할");
        }
    }
}
