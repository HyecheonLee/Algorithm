package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chars = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String temp = scanner.next();
            for (int j = 0; j < temp.length(); j++) {
                chars[i][j] = temp.charAt(j);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(chars[j][i]!='\0')
                builder.append(chars[j][i]);
            }
        }
        System.out.println(builder);
    }
}
