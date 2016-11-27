package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String current = s1;
        String post = "";
        while (!post.equals(current)) {
            post = current;
            current = Stream.of(current).parallel().map(s -> s.replace(s2, "")).collect(Collectors.joining());
        }

//        while (!post.equals(current)) {
//            post = current;
//            current = current.replace(s2, "");
//        }
        if (current.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(current);
        }
    }
}
