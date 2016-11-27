package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem1373 {
    static String[] binery = {
            "000",
            "001",
            "010",
            "011",
            "100",
            "101",
            "110",
            "111"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int K = N.length() % 3;
        StringBuilder builder = new StringBuilder();
        if (K != 0) {
            for (int i = 0; i < 3 - K; i++) {
                builder.append("0");
            }
        }
        builder.append(N);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            map.put(binery[i], i);
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < builder.length(); i += 3) {
            temp.append(map.get(builder.subSequence(i, i + 3)));
        }

        System.out.println(temp);
    }
}
