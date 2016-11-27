package Codility;

import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex02_01 {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        solution(A, 3);
    }

    static public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        IntStream.range(0, A.length).forEach(value -> B[(value + K) % A.length] = A[value]);
        return B;
    }
}
