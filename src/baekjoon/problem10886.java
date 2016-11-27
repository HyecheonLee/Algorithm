package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem10886 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int N = Integer.parseInt(reader.readLine());
            int[] arr = new int[2];
            for (int i = 0; i < N; i++) {
                arr[Integer.parseInt(reader.readLine())]++;
            }
            if (arr[0] > arr[1]) {
                writer.write("Junhee is not cute!");
            } else {
                writer.write("Junhee is cute!");
            }
        }
    }
}
