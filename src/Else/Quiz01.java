package Else;

/**
 * Created by ihyecheon on 2016. 7. 13..
 */
public class Quiz01 {

    public static void main(String[] args) {
        for (int i = 2; i <= 99; i++) {
            int[] check = new int[i * 10];
            String str = "";
            search(1, i, 1, str, check);
        }
    }

    private static void search(int K, int N, int cnt, String str, int[] check) {
        if (K >= N) {
            if (K % N == 0) {
                return;
            } else {
                str += (K / N);
                int mod = K % N;
                if (check[mod] != 0) {
                    System.out.print(N + " ");
                    for (int i = check[mod]; i < str.length(); i++) {
                        System.out.print(str.charAt(i));
                    }
                    System.out.println();
                    return;
                }
                check[mod] = cnt;
                search(mod * 10, N, cnt + 1, str, check);
            }
        } else {
            K *= 10;
            check[K / 10] = cnt;
            str += 0;
            search(K, N, cnt + 1, str, check);
        }
    }
}
