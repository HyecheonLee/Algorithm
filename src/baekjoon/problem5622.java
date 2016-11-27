package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = reader.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch = 'A'; ch <= 'O'; ch++) {
            map.put(ch, ((ch - 'A') / 3) + 3);
        }
        for (char ch = 'P'; ch <= 'S'; ch++) {
            map.put(ch, 8);
        }
        for (char ch = 'T'; ch <= 'V'; ch++) {
            map.put(ch, 9);
        }
        for (char ch = 'W'; ch <= 'Z'; ch++) {
            map.put(ch, 10);
        }
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += map.get(temp.charAt(i));
        }
        System.out.println(sum);
    }
}
