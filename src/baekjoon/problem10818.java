package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class problem10818 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        /*
            push X: 정수 X를 스택에 넣는 연산이다.
            pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            size: 스택에 들어있는 정수의 개수를 출력한다.
            empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
            top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         */
        for (int i = 0; i <= N; i++) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            if (s[0].equals("push")) {
                stack.add(s[1]);
            } else if (s[0].equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (s[0].equals("size")) {
                System.out.println(stack.size());
            } else if (s[0].equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(s[0].equals("top")){
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
