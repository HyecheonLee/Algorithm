package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ihyecheon on 2016. 9. 1..
 */
public class problem9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        while (T-- > 0) {
            String str = reader.readLine();
            List<String> list = Arrays.asList(str.split(" "));
            while (true) {
                String temp = reader.readLine();
                if (temp.equals("what does the fox say?")) {
                    break;
                }
                list = list.stream().filter(s -> !s.equals(temp.split(" ")[2])).collect(Collectors.toList());
            }
            list.forEach(s -> System.out.print(s + " "));
        }
    }
}
