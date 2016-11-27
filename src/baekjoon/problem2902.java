package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Stream.of(str)
                .flatMap(s -> Arrays.stream(s.split("-")))
                .map(s -> s.charAt(0) + "")
                .forEach(System.out::print);
    }
}
