package Codility;

/**
 * Created by ihyecheon on 2016. 10. 10..
 */
public class Ex03_02 {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    static public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        return (Y - X) % D == 0 ? (Y - X) / D : (Y - X) / D + 1;
    }
}
