package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 7..
 */
public class problem6359 {
    static int[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        dp = new int[101];
        while (T-- > 0) {
            int N = scanner.nextInt();
            boolean[] check = new boolean[N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j * i <= N; j++) {
                    check[j * i] = !check[j * i];
                }
            }
            int cnt=0;
            for(int i=0;i<check.length;i++){
                if(check[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
