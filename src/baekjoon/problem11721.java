package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class problem11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while (str.length() >= 10) {
            System.out.println(str.substring(0, 10));
            str = str.substring(10, str.length());
        }
        System.out.println(str);
    }
}
