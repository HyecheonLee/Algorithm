package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem1718 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        for (int i = 0; i < s1.length(); i++) {
            int a = (s2.charAt(i % s2.length()));
            int b = s1.charAt(i) - a;
            b = (b + 26) % 26;
            if (b == 0) {
                System.out.print("z");
            } else if (b > 26 || b < 0) {
                System.out.print(" ");
            } else {
                System.out.print((char) ('a' + b - 1));
            }
        }
        System.out.println();
    }
}
