package baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem1395 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[] s = new boolean[N];
        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            if (scanner.nextInt() == 0) {
                IntStream.range(scanner.nextInt() - 1, scanner.nextInt()).forEach(value -> s[value] = !s[value]);
            } else {
                System.out.println(IntStream.range(scanner.nextInt() - 1, scanner.nextInt())
                        .filter(value -> s[value]).count()
                );
            }
        }
    }
}
