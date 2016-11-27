package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 20..
 */
public class ProblemSolving_6_3_Picnic {
    static int[][] friend;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int T = scanner.nextInt(); T > 0; T--) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            friend = new int[N][N];
            for (int i = 0; i < M; i++) {
                int temp = scanner.nextInt();
                int temp2 = scanner.nextInt();
                friend[Math.min(temp, temp2)][Math.max(temp, temp2)] = 1;
            }
            boolean[] taken = new boolean[N];
            System.out.println(countFriend(taken));
        }
    }

    private static int countFriend(boolean[] taken) {
        int startFriend = -1;
        for (int i = 0; i < taken.length; i++) {
            if (!taken[i]) {
                startFriend = i;
                break;
            }
        }
        if (startFriend == -1) return 1;
        int ret = 0;
        for (int j = 0; j < taken.length; j++) {
            if (!taken[j] && friend[startFriend][j] == 1) {
                taken[startFriend] = taken[j] = true;
                ret += countFriend(taken);
                taken[startFriend] = taken[j] = false;
            }
        }
        return ret;
    }
}
