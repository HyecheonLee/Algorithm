package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem2869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        double N = (double) (V - A) / (A - B) + 1;
        int temp = (int)Math.ceil(N);
        if(temp==0){
            System.out.println(1);
        }else{
            System.out.println(temp);
        }
    }
}
