package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String JOI = "JOI";
        String IOI = "IOI";
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String temp = (String) s.subSequence(i, i + 3);
            if (temp.equals(JOI)) {
                a++;
            }
            if (temp.equals(IOI)) b++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
