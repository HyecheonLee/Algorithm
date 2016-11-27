package baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem2741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        IntStream.rangeClosed(1, N).forEach(System.out::println);
    }
}
