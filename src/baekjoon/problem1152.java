package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        System.out.println(Arrays.stream(str).map(String::trim).filter(s -> !s.equals("")).count());
    }
}
