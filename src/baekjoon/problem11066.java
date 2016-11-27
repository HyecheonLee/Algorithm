package baekjoon;

/**
 * Created by ihyecheon on 2016. 8. 31..
 */
public class problem11066 {
    public static void main(String[] args) {
        int[] files = {40, 30, 30, 50};
        System.out.println(file(files, 0));

    }

    private static int file(int[] files, int i) {
        if (files.length <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int[] first = new int[i];
        int[] second = new int[files.length - i - 1];
        System.arraycopy(files, 0, first, 0, i);
        second[0] = files[i] + files[i + 1];
        System.arraycopy(files, i + 2, second, 1, second.length - 1);
        sum = file(first, 0) + file(second, 0) + second[0];
        min = min < sum ? min : sum;
        return min;
    }
}
