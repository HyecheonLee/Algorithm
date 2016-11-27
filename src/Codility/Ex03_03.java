package Codility;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex03_03 {
    public static void main(String[] args) {
        int[] A = new int[4];
        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int[] temp = {0};
        return Arrays.stream(A).filter(ints -> ints != ++temp[0]).findFirst().orElse(A.length + 2) - 1;
    }
}
