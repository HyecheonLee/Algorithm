package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 22..
 */
public class ProblemSolving_7_6 {
    static int[] member;
    static int[] fan;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        member = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'M' || temp.charAt(i) == 'm') {
                member[i] = 1;
            } else {
                member[i] = 0;
            }
        }
        temp = scanner.next();
        fan = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'M' || temp.charAt(i) == 'm') {
                fan[temp.length() - 1 - i] = 1;
            } else {
                fan[temp.length() - 1 - i] = 0;
            }
        }
        int[] C = new int[member.length + fan.length];
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < fan.length; j++) {
                C[i + j] += member[i] * fan[j];
            }
        }
        int cnt = 0;
        int num = fan.length - member.length;
        for (int i = member.length - 1; i <= member.length - 1 + num; i++) {
            if (C[i] == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
