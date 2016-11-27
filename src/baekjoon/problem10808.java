package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] alphabet = new int[26];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            alphabet[chars[i] - 'a'] += 1;
        }
        Arrays.stream(alphabet).forEach(value -> System.out.print(value + " "));
    }
}
