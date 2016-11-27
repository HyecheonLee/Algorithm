package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        String Y = scanner.next();
//        int minLen = X.length() < Y.length() ? X.length() : Y.length();
//        int maxLen = X.length() > Y.length() ? X.length() : Y.length();
//        int temp = 0;
//        int carr = 0;
//        String revers = "";
//        for (int i = 0; i < minLen; i++) {
//            temp = X.charAt(i) - '0' + Y.charAt(i) - '0';
//            temp += carr;
//            if (temp >= 10) {
//                revers += temp % 10;
//                carr = 1;
//            } else {
//                revers += temp;
//                carr = 0;
//            }
//        }
//        if (minLen != maxLen) {
//            if (X.length() == maxLen) {
//                revers += X.charAt(maxLen - 1) - '0' + carr;
//            }
//            if (Y.length() == maxLen) {
//                revers += Y.charAt(maxLen - 1) - '0' + carr;
//            }
//        }
//        System.out.println(revers);

        StringBuffer temp = new StringBuffer(X);
        String reversX = "" + temp.reverse();
        temp = new StringBuffer(Y);
        String reversY = "" + temp.reverse();
        int num = 0;
        num = Integer.parseInt(reversX) + Integer.parseInt(reversY);
        temp = new StringBuffer(num + "");
        num = Integer.parseInt(String.valueOf(temp.reverse()));
        System.out.println(num);
    }
}
