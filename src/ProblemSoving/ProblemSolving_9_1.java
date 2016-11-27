package ProblemSoving;

import java.util.LinkedList;

/**
 * Created by ihyecheon on 2016. 7. 29..
 */
public class ProblemSolving_9_1 {
    static int[] dp;
    static int n;
    static int[] S;
    static int[] choices;

    public static void main(String[] args) {
        lis4(0);
    }

    private static int lis4(int start) {
        if (dp[start + 1] != 0) {
            return dp[start + 1];
        }
        dp[start + 1] = 1;
        int baseNext = -1;
        for (int next = start + 1; next < n; next++) {
            if (start == -1 || S[start] < S[next]) {
                int cand = lis4(next) + 1;
                if (cand > dp[start + 1]) {
                    dp[start + 1] = cand;
                    baseNext = next;
                }
            }
        }
        choices[start + 1] = baseNext;
        return dp[start + 1];
    }


    void reconstruct(int start, LinkedList<Integer> seq) {
        if (start != -1) seq.push(S[start]);
        int next = choices[start + 1];
        if (next != -1) reconstruct(next, seq);
    }
}