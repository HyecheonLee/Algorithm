package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 6. 29..
 */
public class problem2407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        m = n - m < m ? n - m : m;
        long[] mul = new long[10];
        long temp1 = 1;
        long[] div = new long[10];
        long temp2 = 1;
        BigInteger mulInteger = new BigInteger("1");
        BigInteger divInteger = new BigInteger("1");
        int x = 0, y = 0;
        for (int i = (int) m - 1; i >= 0; i--) {

            temp1 *= n - i;
            if (temp1 >= Math.pow(2, 50)) {
                x++;
                temp1 = n - i;
            }

            temp2 *= (i + 1);
            if (temp2 >= Math.pow(2, 50)) {
                y++;
                temp2 = i + 1;
            }
            mul[x] = temp1;
            div[y] = temp2;
        }

        for (int i = 0; i < 10; i++) {
            if (i <= x) {
                mulInteger = mulInteger.multiply(BigInteger.valueOf(mul[i]));
            }
            if (i <= y) {
                divInteger = divInteger.multiply(BigInteger.valueOf(div[i]));
            }
        }
        mulInteger = mulInteger.divide(divInteger);
        System.out.println(mulInteger);
    }
}
