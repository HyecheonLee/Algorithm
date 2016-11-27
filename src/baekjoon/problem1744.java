package baekjoon;

import java.util.*;

/**
 * Created by ihyecheon on 2016. 9. 5..
 */
public class problem1744 {
    public static void main(String[] args) {

        int tmp, N;
        long result = 0;
        List<Integer> plus = new ArrayList<>(), minus = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            tmp = scanner.nextInt();
            if (tmp > 0) plus.add(tmp);
            else minus.add(tmp);
        }

        if (minus.size() % 2 == 1) minus.add(1);
        Collections.sort(plus);
        Collections.sort(minus);

        if (plus.size() % 2 == 1) {
            result += plus.get(0);
            for (int i = 1; i < plus.size(); i += 2) {
                if (plus.get(i) == 1) result += plus.get(i) + plus.get(i + 1);
                else result += (long) plus.get(i) * plus.get(i + 1);
            }
        } else {
            for (int i = 0; i < plus.size(); i += 2) {
                if (plus.get(i) == 1) result += plus.get(i) + plus.get(i + 1);
                else result += (long) plus.get(i) * plus.get(i + 1);
            }
        }

        for (int i = 0; i < minus.size(); i += 2) {
            result += (long) minus.get(i) * minus.get(i + 1);
        }
        System.out.println(result);
    }
}
