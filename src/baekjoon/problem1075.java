package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int F = scanner.nextInt();
        String num1 = N.substring(0, N.length() - 2);
        int mod = Integer.parseInt(num1) % F;
        int mod2 = (mod * 100) % F;
        String str;
        if (mod2 != 0) {
            str = "" + (mod * 100) + (F - mod2);
        } else {
            str = "" + (mod * 100) + mod2;
        }
        System.out.println(str.substring(str.length() - 2, str.length()));
    }
}
