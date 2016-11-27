package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem2861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> list = new ArrayList<>();
        int KBS1 = 0;
        int KBS2 = 0;
        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            if (temp.equals("KBS1")) KBS1 = i;
            if (temp.equals("KBS2")) KBS2 = i;
            list.add(temp);
        }
        String temp = "";
        for (int i = 0; i < KBS1 - 1; i++) {
            temp += 1;
        }
        temp += 32;
        for (int i = 0; i < KBS1 - 1; i++) {
            temp += 4;
        }
        for (int i = 0; i < KBS2 - 2; i++) {
            temp += 1;
        }
        temp += 32;
        for (int i = 0; i < KBS2 - 2; i++) {
            temp += 4;
        }
        System.out.println(temp);
    }
}
