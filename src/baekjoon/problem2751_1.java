package baekjoon;

import java.io.*;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2751_1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[2000000 + 2];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(br.readLine()) + 1000000;
                arr[temp] = true;
                min = min < temp ? min : temp;
                max = max > temp ? max : temp;
            }

            for (int i = min; i <= max; i++) {
                if (arr[i]) {
                    bw.write((i - 1000000) + "\n");

                }
            }
        }
    }
}
