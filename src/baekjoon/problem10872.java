package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return factorial(i - 1) * i;
    }
}
