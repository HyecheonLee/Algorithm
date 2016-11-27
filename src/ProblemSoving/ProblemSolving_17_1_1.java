package ProblemSoving;

import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 9. 6..
 */
public class ProblemSolving_17_1_1 {
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        double set = System.currentTimeMillis();
        System.out.println(
                IntStream.range(0, arr.length)
                        .flatMap(start ->
                                IntStream.range(start + 1, arr.length)
                                        .map(end -> IntStream.range(start, end)
                                                .map(operand -> arr[operand])
                                                .sum())
                        ).mapToObj(value -> value).min((o1, o2) -> Math.abs(o1) - Math.abs(o2)).orElse(0)
        );
        System.out.println(System.currentTimeMillis() - set);

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        set = System.currentTimeMillis();
        System.out.println(
                IntStream.range(0, arr.length)
                        .flatMap(start ->
                                IntStream.range(start + 1, arr.length)
                                        .map(end -> IntStream.range(start, end)
                                                .map(operand -> arr[operand])
                                                .sum())
                        ).mapToObj(value -> value).min((o1, o2) -> Math.abs(o1) - Math.abs(o2)).orElse(0)
        );
        System.out.println(System.currentTimeMillis() - set);

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }

        set = System.currentTimeMillis();
        System.out.println(
                IntStream.range(0, arr.length)
                        .flatMap(start ->
                                IntStream.range(start + 1, arr.length)
                                        .map(end -> IntStream.range(start, end)
                                                .map(operand -> arr[operand])
                                                .sum())
                        ).mapToObj(value -> value).min((o1, o2) -> Math.abs(o1) - Math.abs(o2)).orElse(0)
        );
        System.out.println(System.currentTimeMillis() - set);
    }
}
