package baekjoon;

import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 16..
 */
public class problem7568 {
    static class Body {
        int weight;
        int height;
        int N;
        int score;

        public Body(int weight, int height, int N) {
            this.height = height;
            this.weight = weight;
            this.N = N;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "height=" + height +
                    ", weight=" + weight +
                    ", N=" + N +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Body[] bodies = new Body[N];
        for (int i = 0; i < N; i++) {
            bodies[i] = new Body(scanner.nextInt(), scanner.nextInt(), i);
        }
        bodies[0].score = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (bodies[i].height < bodies[j].height && bodies[i].weight < bodies[j].weight) {
                    bodies[i].score++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(bodies[i].score + 1 + " ");
        }
    }
}
