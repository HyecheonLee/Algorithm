package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String temp = reader.readLine();
            arr[i][0] = Integer.parseInt(temp.split(" ")[0]);
            arr[i][1] = Integer.parseInt(temp.split(" ")[1]);
        }
        Arrays.sort(arr, (o1, o2) -> (o1[1] - o2[1]));
        int endTime = arr[0][1];
        int cnt = 1;
        int index = 0;
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1][1] != arr[i][1]) {
                index = i;
                Arrays.sort(arr, start, index, (o1, o2) -> o1[0] - o2[0]);
                start = i;
            }

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= endTime) {
                endTime = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
