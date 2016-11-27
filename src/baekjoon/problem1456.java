package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 30..
 */
public class problem1456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        long temp1;
        long temp2;
        boolean check = false;
        for (int i = 0; i < n.length()-1; i++) {
            temp1 = multi(n, 0, i);
            temp2 = multi(n, i + 1, n.length() - 1);
            System.out.println(temp1 + "," + temp2);
            if (temp1 == temp2) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static long multi(String n, int start, int end) {
        long mul = 1;
        for (int i = start; i <= end; i++) {
            mul *= (n.charAt(i) - '0');
        }
        return mul;
    }
}

