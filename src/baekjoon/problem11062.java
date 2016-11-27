package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 9..
 */
public class problem11062 {
    static int[] cards;
    static int dp[][][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            cards = new int[N];
            dp = new int[N + 1][N + 1][2];
            for (int i = 0; i < N; i++) {
                cards[i] = scanner.nextInt();
            }
            System.out.println(cardsGame(0, N - 1, 0));
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(dp[i][j][0]+" ");
                }
                System.out.println();
            }
        }
    }

    private static int cardsGame(int left, int right, int check) {
        if (left == right && check % 2 == 0) {
            return cards[left];
        } else if (left == right && check % 2 == 1) {
            return 0;
        }
        if (dp[left][right][check % 2] != 0) {
            return dp[left][right][check % 2];
        }
        if (check % 2 == 0) {
            System.out.print(Math.max(cardsGame(left + 1, right, check + 1) + cards[left], cardsGame(left, right - 1, check + 1) + cards[right])+" ");
            return dp[left][right][check % 2] = Math.max(cardsGame(left + 1, right, check + 1) + cards[left], cardsGame(left, right - 1, check + 1) + cards[right]);
        } else {
            System.out.print(Math.min(cardsGame(left + 1, right, check + 1) + cards[left], cardsGame(left, right - 1, check + 1) + cards[right])+" ");
            return dp[left][right][check % 2] = Math.min(cardsGame(left + 1, right, check + 1), cardsGame(left, right - 1, check + 1));
        }
    }
}
