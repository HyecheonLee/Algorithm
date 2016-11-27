package Else;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 11..
 */
public class AutoLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int monthlyPayment = scanner.nextInt();
        int loanTerm = scanner.nextInt();

        double result = 0.001;
        double end = 1.0 / 12;
        double start = 0;
        double mid = (start + end) / 2;
        double X = 1.0 / 12;
        double temp = price;
        while (Math.abs(temp) > result && start < mid) {
            temp = price;
            for (int i = 0; i < loanTerm; i++) {
                temp *= (1 + X);
                temp -= monthlyPayment;
            }
            if (temp > 0) {
                end = mid;
                mid = (start + mid) / 2;
                X = mid;
            } else {
                start = mid;
                mid = (start + end) / 2;
                X = mid;
            }
        }
        System.out.println(X * 12 * 100);
    }
}
