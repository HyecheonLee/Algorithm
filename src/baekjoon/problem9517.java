package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem9517 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        String[][] quiz = new String[N][2];

        for (int i = 0; i < N; i++) {
            quiz[i][0] = scanner.next();
            quiz[i][1] = scanner.next();
        }
        K--;
        int time = 0;
        int cnt = 0;
        while (true) {
            time += Integer.parseInt(quiz[cnt][0]);
            if (time >= 210) break;
            if (quiz[cnt][1].equals("T")) {
                K = (K + 1) % 8;
            }
            cnt++;
        }
        System.out.println(K + 1);
    }
}
