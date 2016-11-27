package Codility;

import java.util.*;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex02_02 {
    public static void main(String[] args) {
        int[] A = new int[7];
        A[0] = 9;
        A[1] = 3;
        A[2] = 9;
        A[3] = 3;
        A[4] = 9;
        A[5] = 7;
        A[6] = 9;
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(A).forEach(value -> map.put(value, map.getOrDefault(value, 0) + 1));
        return map.keySet().stream().filter(integer -> map.get(integer) % 2 != 0).findAny().get();
    }
}
