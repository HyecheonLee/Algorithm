package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        StringBuilder s1 = new StringBuilder(temp.split(" ")[0]);
        StringBuilder s2 = new StringBuilder(temp.split(" ")[1]);
        s1.reverse();
        s2.reverse();
        System.out.println(
                Stream.of(temp)
                        .flatMap(s -> Arrays.stream(s.split(" ")))
                        .map(s -> new StringBuilder(s).reverse())
                        .map(StringBuilder::toString)
                        .max(String::compareTo).get()
        );

    }
}
