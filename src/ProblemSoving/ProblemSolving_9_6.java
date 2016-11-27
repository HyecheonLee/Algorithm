package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 8. 2..
 */
public class ProblemSolving_9_6 {
    static int N;
    static int cnt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        generate(2, 2, "");
    }

    private static void generate(int n, int m, String s) {
        if (n < 0 || m < 0) return;
        if (n == 0 && m == 0) {
            cnt++;
            if (cnt == N) {
                System.out.println(s);
                System.exit(0);
            }
            return;
        }

        generate(n - 1, m, s + "-");
        generate(n, m - 1, s + "o");
    }
}
