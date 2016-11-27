package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String binary = reader.readLine();
        StringBuilder builder = new StringBuilder(binary);
        int len;
        if (binary.length() % 3 != 0) {
            len = 3 - (binary.length() % 3);
            for (int i = 0; i < len; i++) {
                builder.insert(0, '0');
            }
        }
        len = builder.length() / 3;
        Map<String, String> map = new HashMap<>();
        map.put("000", "0");
        map.put("001", "1");
        map.put("010", "2");
        map.put("011", "3");
        map.put("100", "4");
        map.put("101", "5");
        map.put("110", "6");
        map.put("111", "7");
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int n = i * 3;
            temp.append(map.get(builder.substring(n, n + 3)));
        }
        System.out.print(temp.toString());
    }
}
