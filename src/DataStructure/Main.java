package DataStructure;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(solution(529));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        StringBuilder temp = new StringBuilder();
        while (N != 0) {
            temp.append(N % 2);
            N = N / 2;
        }
        String num = String.valueOf(temp.reverse());
        int start = 0;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                if (!flag) {
                    start = i;
                    flag = true;
                } else {
                    count = Math.max(count, i - start - 1);
                    start = i;
                }
            }
        }
        return count;
    }
}
