package Codility;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 10. 11..
 */
public class Ex04_02 {
    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 1;
        A[1] = 3;
        A[2] = 6;
        A[3] = 4;
        A[4] = 1;
        A[5] = 2;
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = {0};
        Arrays.stream(A).sorted().filter(value -> {
            System.out.println(value + "," + (B[0] + 1));
            if (value != ++B[0]) {
                return true;
            }
            return false;
        }).findAny().isPresent();
        return B[0];
    }
}
