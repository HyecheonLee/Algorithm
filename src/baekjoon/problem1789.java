package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1789 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            long N = Long.parseLong(reader.readLine());
            N *= 2;
            long S = (long) Math.sqrt(N);
            while (S * (S + 1) <= N) {
                S++;
            }
            writer.write(String.valueOf(S - 1));
        }
    }
}
