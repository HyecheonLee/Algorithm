package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 25..
 */
public class problem1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diagonal = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        while (true) {
            double temp = Math.sqrt((diagonal * diagonal * 10000) / (height * height + width * width));
            double h = (temp * height);
            double w = (temp * width);
            h /= 100;
            w /= 100;
            if (diagonal * diagonal == Math.round(h * h + w * w)) {
                System.out.println((int) h + " " + (int) w);
                break;
            }
        }
    }
}
