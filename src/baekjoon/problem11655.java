package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem11655 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int K = 'Z' - 'A' + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                int temp = str.charAt(i) - 'a';
                temp = (temp + K+13) % K;
                char c = (char) (temp + 'a');
                builder.append(c);
            } else if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                int temp = str.charAt(i) - 'A';
                temp = (temp + K+13) % K;
                char c = (char) (temp + 'A');
                builder.append(c);
            } else {
                builder.append(str.charAt(i));
            }
        }
        System.out.println(builder);
    }
}
