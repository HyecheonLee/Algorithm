package baekjoon;

import java.io.*;
import java.util.HashMap;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem10815 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            HashMap<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(reader.readLine());
            String[] num = reader.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                map.put(num[i], 1);
            }
            int M = Integer.parseInt(reader.readLine());
            num = reader.readLine().split(" ");
            for (int i = 0; i < M; i++) {
                writer.write(map.getOrDefault(num[i], 0) + " ");
            }
        }
    }
}
