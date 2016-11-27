package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 7. 18..
 */
public class problem5582 {
    static int[][] LCS;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        int n = str1.length();
        int m = str2.length();
        int max = 0;
        LCS = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;

                if (LCS[i][j] > max) {
                    max = LCS[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
