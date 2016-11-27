package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class problem10799 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> characterStack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                characterStack.add('(');
            } else {
                if (str.charAt(i - 1) == '(') {
                    characterStack.pop();
                    sum += characterStack.size();
                } else {
                    characterStack.pop();
                    sum++;
                }
            }
        }
        System.out.println(sum);

        // (((()(()()))(())())) | (()())

    }
}
