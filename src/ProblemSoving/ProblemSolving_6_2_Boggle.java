package ProblemSoving;

/**
 * Created by ihyecheon on 2016. 7. 20..
 */
public class ProblemSolving_6_2_Boggle {
    static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
    static String[] map = {
            "URLPM",
            "XPRET",
            "GIAET",
            "TXNZY",
            "XOQRS"
    };

    public static void main(String[] args) {
        String word = "PRETTY";
        int ret = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (hasWord(i, j, word)) {
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }

    private static boolean hasWord(int y, int x, String word) {
        if (map[y].charAt(x) != word.charAt(0)) {
            return false;
        }
        if (word.length() == 1) return true;
        for (int i = 0; i < 8; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if (nextX >= 0 && nextX < 5 && nextY >= 0 && nextY < 5)
                if (hasWord(nextY, nextX, word.substring(1))) {
                    return true;
                }
        }
        return false;
    }
}
