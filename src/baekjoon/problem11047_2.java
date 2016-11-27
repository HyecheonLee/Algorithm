package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem11047_2 {
    static int[] coin;

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String temp = scanner.readLine();
        int N = Integer.parseInt(temp.split(" ")[0]);
        int K = Integer.parseInt(temp.split(" ")[1]);
        coin = new int[N + 1];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(scanner.readLine());
        }
        int sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            sum += K / coin[i];
            K = K % coin[i];
        }
        System.out.println(sum);
    }
}
