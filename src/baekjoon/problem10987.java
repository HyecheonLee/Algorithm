package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem10987 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
        System.out.println(
                Stream.of(S)
                        .flatMap(s -> Stream.of(s.split("")))
                        .filter(s1 -> s1.equals("a") || s1.equals("e")
                                || s1.equals("i") || s1.equals("o") || s1.equals("u"))
                        .count()
        );
    }
}
