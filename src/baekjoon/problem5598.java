package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        for (int i = 0; i < str.length(); i++) {
            int a = ((str.charAt(i) - 'A') - 3 + 26) % 26;
            System.out.print((char) (a + 'A'));
        }
    }
}
