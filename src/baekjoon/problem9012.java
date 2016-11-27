package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class problem9012 {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '(') {
                    characterStack.add('(');
                } else {
                    if (characterStack.isEmpty()) {
                        characterStack.add('1');
                        break;
                    } else {
                        characterStack.pop();
                    }
                }
            }
            if(characterStack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
                characterStack.clear();
            }



        }
    }
}
