package Else;

import java.util.Arrays;

/**
 * Created by ihyecheon on 2016. 7. 9..
 */
public class StockHistory {
    public static void main(String[] args) {
        int initialInvestment = 100;
        int monthlyContribution = 20;
        String[] stockPrice = {
                "40 50 60",
                "37 48 55",
                "100 48 50",
                "105 48 47",
                "110 50 52",
                "110 50 52",
                "110 51 54",
                "109 49 53"};

        int month = stockPrice.length;
        int company = stockPrice[0].split(" ").length;

        int[][] increment = new int[month][company];

        double max = 0, profit = 0;
        double[] proportion = new double[month - 1];
        boolean[] buy = new boolean[month - 1];

        for (int i = 0; i < month; i++) {
            String[] s = stockPrice[i].split(" ");
            for (int j = 0; j < company; j++) {
                increment[i][j] = Integer.valueOf(s[j]);
            }
        }

        for (int i = month - 2; 0 <= i; i--) {
            for (int j = 0; j < company; j++) {
                double p = 1.0 * increment[month - 1][j] / increment[i][j] - 1;
                if (0 < p && max < p) {
                    buy[i] = true;
                    max = p;
                    proportion[i] = p;
                }
            }
        }
        System.out.println(Arrays.toString(proportion));
        for (int i = 0; i < buy.length; i++) {
            if (buy[i]) {
                profit += initialInvestment * proportion[i];
                initialInvestment = 0;
            }
            initialInvestment += monthlyContribution;
        }
        System.out.println(Math.round(profit));
    }
}
