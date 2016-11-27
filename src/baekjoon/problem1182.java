package baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem1182 {
    int maxValue = 1000_000;
    static int N;
    static int S;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        S = scanner.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean[] isSet = new boolean[N];
        makeSubset(N - 1, isSet);
        System.out.println(cnt);
    }

    private static void makeSubset(int i, boolean[] isSet) {
        if (i < 0) {
            if (!IntStream.range(0, N).noneMatch(value -> isSet[value])) {
                if (IntStream.range(0, N).filter(value -> isSet[value]).map(operand -> arr[operand]).sum() == S) {
                    cnt++;
                }
            }
        } else {
            isSet[i] = true;
            makeSubset(i - 1, isSet);
            isSet[i] = false;
            makeSubset(i - 1, isSet);
        }
    }
}
