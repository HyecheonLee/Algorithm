package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by ihyecheon on 2016. 7. 14..
 */
public class problem5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        while (N-- > 0) {
            char[] temp = bufferedReader.readLine().toCharArray();
            LinkedList<Character> queue = new LinkedList<>();
            int point = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == '>') {
                    point++;
                    if (queue.size() < point) {
                        point = queue.size();
                    }
                } else if (temp[i] == '<') {
                    point--;
                    if (point < 0) {
                        point = 0;
                    }
                } else if (temp[i] == '-') {
                    point--;
                    if (point < 0) {
                        point = 0;
                    } else {
                        queue.remove(point);
                    }
                } else {
                    queue.add(point, temp[i]);
                    point++;
                }
            }
            for (int i = 0; i < queue.size(); i++) {
                System.out.print(queue.get(i));
            }
            System.out.println();
        }
    }
}
