package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by admin on 2016-10-17.
 */
public class problem1759 {
    static String[] chars;
    static int L;
    static int C;
    static String[] vowel = {"a", "e", "i", "o", "u"};
    static int A, B;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] num = reader.readLine().split(" ");
            L = Integer.parseInt(num[0]);
            C = Integer.parseInt(num[1]);
            chars = reader.readLine().split(" ");
            Arrays.sort(chars);
            boolean[] isCheck = new boolean[C];
            subSet(0, isCheck, 0);
        }
    }

    private static void subSet(int l, boolean[] isCheck, int cnt) {
        if (l >= C) {
            if (cnt == L) {
                A = 0;
                B = 0;
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < C; i++) {
                    if (isCheck[i]) {
                        String temp = chars[i];
                        builder.append(temp);
                        if (Stream.of(vowel).anyMatch(s -> s.equals(temp))) {
                            A++;
                        } else {
                            B++;
                        }
                    }
                }
                if (A >= 1 && B >= 2) {
                    System.out.println(builder);
                }
            }
        } else {
            isCheck[l] = true;
            subSet(l + 1, isCheck, cnt + 1);
            isCheck[l] = false;
            subSet(l + 1, isCheck, cnt);
        }
    }
}
