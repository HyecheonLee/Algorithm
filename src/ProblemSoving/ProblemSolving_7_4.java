package ProblemSoving;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 22..
 */
public class ProblemSolving_7_4 {
    static int[] height;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int T = scanner.nextInt(); T > 0; T--) {
            int N = scanner.nextInt();
            height = new int[N];
            for (int i = 0; i < N; i++) {
                height[i] = scanner.nextInt();
            }
            System.out.println(solve(0, height.length - 1));
        }
    }

    private static int solve(int left, int right) {
        if (left == right) {
            return height[left];
        } else {
            int mid = (left + right) / 2;
            int ret = Math.max(solve(left, mid), solve(mid + 1, right));
            int leftHeight = mid;
            int rightHeight = mid + 1;
            int minHeight = Math.min(height[leftHeight], height[rightHeight]);
            ret = Math.max(ret, minHeight * 2);

            while (rightHeight < right || leftHeight > left) {
                if (rightHeight < right && (leftHeight == left || height[leftHeight - 1] < height[rightHeight + 1])) {
                    rightHeight++;
                    minHeight = Math.min(minHeight, height[rightHeight]);
                } else {
                    leftHeight--;
                    minHeight = Math.min(minHeight, height[leftHeight]);
                }
                ret = Math.max(ret, minHeight * (rightHeight - leftHeight + 1));
            }
            return ret;
        }
    }
}
