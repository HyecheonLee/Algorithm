package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        String S = reader.readLine();
        for (int i = 0; i < S.length(); i++) {
            if (alphabet[S.charAt(i) - 'a'] == -1) {
                alphabet[S.charAt(i) - 'a'] = i;
            }
        }
        for (int i : alphabet) {
            System.out.print(i+" ");
        }
    }
}
