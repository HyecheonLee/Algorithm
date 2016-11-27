package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 21..
 */
public class problem1339 {
    static int cnt = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] str = new String[N];
        int number[] = new int[26];
        for (int i = 0; i < N; i++) {
            str[i] = String.valueOf(new StringBuilder(scanner.next()).reverse());
            System.out.println(str[i]);
        }
        List<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (list.get(j) == null) {
                    list.add(j, "");
                }
                String temp = list.get(j);
                temp += str[i].charAt(j);
                list.add(j, temp);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static void func() {

    }
}
