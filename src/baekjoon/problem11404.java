package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem11404 {
    static int max = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int[][] G = new int[N][N];
        IntStream
                .range(0, N)
                .forEach(value -> IntStream.range(0, N).forEach(value1 -> G[value][value1] = max));
        for (int i = 0; i < N; i++) {
            G[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            String[] temp = reader.readLine().split(" ");
            int src = Integer.parseInt(temp[0]) - 1;
            int dest = Integer.parseInt(temp[1]) - 1;
            int price = Integer.parseInt(temp[2]);
            if (G[src][dest] > price) G[src][dest] = price;
        }
        IntStream.range(0, N).forEach(via ->
                IntStream.range(0, N).forEach(from ->
                        IntStream.range(0, N).
                                forEach(to -> G[from][to] = Math.min(G[from][via] + G[via][to], G[from][to]))));
        IntStream.range(0, N).forEach(value -> {
            IntStream.range(0, N).forEach(value1 ->
                    System.out.print(G[value][value1] + " "));
            System.out.println();
        });
    }
}
