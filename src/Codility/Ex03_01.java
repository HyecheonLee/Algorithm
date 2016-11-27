package Codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex03_01 {
    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;
        int[] B = {-1000,1000};
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        final int sum = Arrays.stream(A).sum();
        B[0] = A[0];
        IntStream.range(1, A.length).forEach(value -> B[value] = B[value - 1] + A[value]);
        IntStream.range(0, A.length).forEach(value -> B[value] = Math.abs(sum - B[value] * 2));
        B[B.length-1]=Integer.MAX_VALUE;
        return Arrays.stream(B).min().getAsInt();
    }
}
