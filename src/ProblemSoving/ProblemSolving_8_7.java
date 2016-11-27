package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 26..
 */
public class ProblemSolving_8_7 {
    static final int maxValue = 100000;
    static int dp[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            String str = scanner.next();
            dp = new int[str.length() + 1];
            System.out.println(memory(str));
        }
    }

    private static int memory(String str) {
        int ret = maxValue;
        if (dp[str.length()] != 0) {
            return dp[str.length()];
        }
        if (str.length() < 3) {
            return dp[str.length()] = Integer.MAX_VALUE;
        } else {
            for (int i = 3; i <= 5; i++) {
                if (str.length() == i) {
                    return dp[str.length()] = level(str);
                }
                ret = Math.min(memory(str.substring(0, str.length() - i)) +
                        level(str.substring(str.length() - i, str.length())), ret);
            }
            return (dp[str.length()] = ret);
        }
    }

    private static int level(String str) {
        boolean ok = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(0)) {
                ok = true;
            } else {
                ok = false;
                break;
            }
        }
        if (ok) {
            return 1;
        }
        int temp = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            temp = str.charAt(i + 1) - str.charAt(i);
            if (temp == str.charAt(1) - str.charAt(0)) {
                ok = true;
            } else {
                ok = false;
                break;
            }
        }
        if (ok) {
            if (Math.abs(temp) == 1) {
                return 2;
            } else {
                return 5;
            }
        }
        char[] tempChar = new char[2];
        tempChar[0] = str.charAt(0);
        tempChar[1] = str.charAt(1);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && tempChar[0] == str.charAt(i)) {
                ok = true;
            } else if (i % 2 == 1 && tempChar[1] == str.charAt(i)) {
                ok = true;
            } else {
                ok = false;
                break;
            }
        }
        if (ok) {
            return 4;
        }
        return 10;
    }
}
