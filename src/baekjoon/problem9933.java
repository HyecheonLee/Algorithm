package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = reader.readLine();
        }
        String s2 = Arrays.stream(strings)
                .filter(s -> Arrays.stream(strings)
                        .map(s1 -> new StringBuilder(s1).reverse().toString())
                        .filter(s1 -> s1.equals(s)).findAny().isPresent()).findAny().get();
        System.out.println(s2.length());
        System.out.println(s2.charAt((s2.length()) / 2));
    }
}
