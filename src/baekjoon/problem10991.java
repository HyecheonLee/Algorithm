package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem10991 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int odd = N * 2 - 1;
        int[][] star = new int[N][odd];
        for (int i = N - 1; i >= 0; i--) {
            for (int j = (odd / 2) - i; j < (odd / 2) + i + 1; j += 2) {
                star[i][j] = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N+i ; j++) {
                if (star[i][j] == 1) {
                    writer.write("*");
                } else {
                    writer.write(" ");
                }
            }
            writer.write("\n");
        }
        writer.close();
    }
}