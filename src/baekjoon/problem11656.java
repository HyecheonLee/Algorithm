package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
        int n = S.length();
        Stream.of(S)
                .flatMap(s -> IntStream.range(0, n).mapToObj(value -> s.subSequence(value, n)))
                .sorted()
                .forEach(System.out::println);
    }
}
