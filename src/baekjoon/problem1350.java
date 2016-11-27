package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 24..
 */
public class problem1350 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] fileSize = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            fileSize[i] = scanner.nextInt();
        }
        int cluster = scanner.nextInt();

//        int sum = 0;
//        int N = (int) (Math.random() * 1000);
//        int[] fileSize = new int[N];
//        for (int i = 0; i < N; i++) {
//            fileSize[i] = (int) (Math.random() * 1000000000);
//        }
//        int cluster = (int) (Math.random() * 1048576);
//
        int num = 0;
        for (int i = 0; i < N; i++) {
            sum += fileSize[i];
            if (sum >= cluster) {
                num += (int) (sum / cluster);
                sum = sum % cluster;
            }
        }
        if (sum != 0) {
            num++;
        }
        BigInteger bigInteger = new BigInteger(String.valueOf(num));
        bigInteger = bigInteger.multiply(BigInteger.valueOf(cluster));
        System.out.println(bigInteger);
    }
}
