package Codility;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex04_01 {
    public static void main(String[] args) {
        int[] A = {4, 1, 3};
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = {0};
        return Arrays.stream(A).sorted().filter(value -> value != ++B[0]).findAny().isPresent() ? 0 : 1;
    }
}
