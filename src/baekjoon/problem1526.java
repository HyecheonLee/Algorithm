package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 13..
 */
public class problem1526 {
    static int NUM;
    static int max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        NUM = Integer.parseInt(N);
        int size = N.length();
        for (int i = size - 2; i < size; i++) {
            search(i, 0);
        }
        System.out.println(max);
    }

    private static void search(int size, int num) {
        if (num > NUM) return;
        if (size < 0) {
            max = Math.max(num, max);
            return;
        }
        int pow = (int) Math.pow(10, size);
        search(size - 1, num + pow * 7);
        search(size - 1, num + pow * 4);
    }
}
