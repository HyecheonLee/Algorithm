package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 26..
 */
public class problem1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        List<Long> list = new ArrayList<>();
        int count = 0;
        for (long i = 1; i * i <= end; i++) {
            if (i * i >= start) {
                count++;
                list.add(i * i);
            }
        }

    }
}
