package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            int floor = N % H;
            int room = N / H + 1;
            if (floor == 0) {
                floor = H;
                room--;
            }
            if (room < 10)
                System.out.println(floor + "0" + room);
            else
                System.out.println(floor + "" + room);
        }
    }
}
