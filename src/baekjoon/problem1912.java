package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 23..
 */
public class problem1912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = numArr[0];
        for (int i = 0; i < N; i++) {
            sum += numArr[i];
            if (sum >= 0) {
                max = max > sum ? max : sum;
            } else {
                if (max < 0) {
                    max = max > numArr[i] ? max : numArr[i];
                } else {
                    sum = 0;
                }
            }
        }
        System.out.println(max);
    }

    private static int recursive(int[] numArr, int start, int end) {

        int mid = (start + end) / 2;
        if (start < end) {
            int left = 0;
            int right = 0;
            left = recursive(numArr, start, mid);
            right = recursive(numArr, mid + 1, end);
            int temp1 = mid;
            int temp2 = mid;
            while (numArr[temp1] >= 0) {
                temp1--;
            }
            temp1++;

            while (numArr[temp2] >= 0) {
                temp2++;
            }
            int sum = 0;
            for (int i = temp1; i < temp2; i++) {
                sum += numArr[i];
            }
            sum = sum > left ? sum : left;
            sum = sum > right ? sum : right;
            return sum;
        } else {
            return numArr[start];
        }
    }
}
