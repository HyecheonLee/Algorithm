package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 3..
 */
public class problem1032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        StringBuilder temp = new StringBuilder(strings[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                if (temp.charAt(j) != '?' && strings[i].charAt(j) != temp.charAt(j)) {
                    temp.setCharAt(j, '?');
                }
            }
        }
        System.out.println(temp.toString());
    }
}
