package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * Created by ihyecheon on 2016. 9. 5..
 */
public class problem1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str, "-");
        int sum = 0;
        int cnt = 0;
        while (tokenizer.hasMoreTokens()) {
            if (cnt == 0) {
                sum += Stream.of(tokenizer.nextToken()).parallel().flatMap(s -> Arrays.stream(s.split("\\+"))).mapToInt(Integer::parseInt).sum();
            } else {
                sum -= Stream.of(tokenizer.nextToken()).parallel().flatMap(s -> Arrays.stream(s.split("\\+"))).mapToInt(Integer::parseInt).sum();
            }
            cnt++;
        }
        System.out.println(sum);
    }
}
