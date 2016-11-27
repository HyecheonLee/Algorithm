package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 22..
 */
public class ProblemSolving_8_2 {
    static String[] words;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            String W = scanner.next();
            int N = scanner.nextInt();
            words = new String[N];
            for (int i = 0; i < N; i++) {
                words[i] = scanner.next();
            }
            for (int i = 0; i < N; i++) {
                if (match(W, words[i])) {
                    System.out.println(words[i]);
                }
            }
        }
    }

    private static boolean match(String w, String word) {
        boolean ok = false;
        if (w.length() == 0) {
            if (word.length() == 0) return true;
            else return false;
        }
        if (w.charAt(0) == '*') {
            for (int i = 0; i < word.length(); i++) {
                match(w.substring(1), word.substring(i));
            }
        } else {
            if (w.charAt(0) == '?' || w.charAt(0) == word.charAt(0)) {
                ok = match(w.substring(1), word.substring(1));
            } else {
                return false;
            }
        }
        return ok;
    }
}
