package baekjoon;

import java.io.*;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2605 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(reader.readLine());
            StringBuilder builder = new StringBuilder();
            String[] num = reader.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                builder.insert(builder.length() - Integer.parseInt(num[i]), (i + 1));
            }
            for (int i = 0; i < builder.length(); i++) {
                writer.write(builder.charAt(i) + " ");
            }
            builder.append("\n");
        }
    }
}
