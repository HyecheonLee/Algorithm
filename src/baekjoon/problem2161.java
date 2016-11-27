package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 7. 12..
 */
public class problem2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (true) {
            System.out.print(queue.poll()+" ");
            if(queue.isEmpty())break;
            int temp = queue.poll();
            queue.add(temp);
        }
    }
}
