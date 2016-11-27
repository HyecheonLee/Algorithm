package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 22..
 */
public class ProblemSolving_7_2 {
    static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(reverser(str));
    }

    private static String reverser(String str) {
        char head = str.charAt(index);
        index++;
        if (head == 'b' || head == 'w') {
            return ("" + head);
        }
        String upperLeft = reverser(str);
        String upperRight = reverser(str);
        String lowerLeft = reverser(str);
        String lowerRight = reverser(str);

        return "x" + lowerLeft + lowerRight + upperLeft + upperRight;
    }
}
