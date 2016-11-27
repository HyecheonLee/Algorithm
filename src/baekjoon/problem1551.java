package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 13..
 */
public class problem1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strBuf = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(strBuf[0]);
        int K = Integer.parseInt(strBuf[1]);
        int[] A = new int[N];
        strBuf = bufferedReader.readLine().split(",");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strBuf[i]);
        }
        int[] temp = Arrays.copyOf(A, N);
        for (int i = 0; i < K; i++) {
            int[] B = new int[temp.length - 1];
            for (int j = 0; j < B.length; j++) {
                B[j] = temp[j + 1] - temp[j];
            }
            temp = Arrays.copyOf(B, B.length);
        }
        String str = "" + temp[0];
        for (int i = 1; i < temp.length; i++) {
            str += "," + temp[i];
        }
        System.out.println(str);
    }
}
