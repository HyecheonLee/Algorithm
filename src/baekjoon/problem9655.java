package baekjoon;

import java.util.Scanner;

/**
 * Created by admin on 2016-10-17.
 */
public class problem9655 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
