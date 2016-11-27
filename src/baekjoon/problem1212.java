package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        StringBuilder builder = new StringBuilder();
        String[] binery = {
                "000",
                "001",
                "010",
                "011",
                "100",
                "101",
                "110",
                "111"
        };
        for (int i = 0; i < N.length(); i++) {
            builder.append(binery[N.charAt(i) - '0']);
        }
        int cnt = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) != '0') {
                cnt = i;
                break;
            }
        }
        System.out.println(builder.substring(cnt, builder.length()));
    }
}
