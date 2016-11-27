package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        boolean[] isCheck = new boolean[M + 1];
        isCheck[0] = true;
        isCheck[1] = true;
        isCheck[2] = false;
        for (int i = 3; i <= M; i = i + 2) {
            if (!isCheck[i])
                for (int j = 2; j * i <= M; j++) {
                    isCheck[i * j] = true;
                }
        }
        if (N <= 2) {
            System.out.println(2);
            N = 3;
        }
        if (N % 2 == 0) N++;
        for (int i = N; i <= M; i += 2) {
            if (!isCheck[i]) {
                System.out.println(i);
            }
        }
//        IntStream.rangeClosed(N, M)
//                .filter(value -> IntStream.range(2, value)
//                        .noneMatch(value1 -> value % value1 == 0))
//                .forEach(System.out::println);
    }
}
