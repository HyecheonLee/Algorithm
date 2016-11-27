package Else;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ihyecheon on 2016. 9. 17..
 */
public class primary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double start;
        IntStream.range(2, num)
                .filter(value ->
                        IntStream.rangeClosed(2, (int) Math.sqrt(value))
                                .noneMatch(value1 -> value % value1 == 0))
                .toArray();
        System.out.println();
        System.out.println("------------------");
        start = System.currentTimeMillis();
        IntStream.range(2, num)
                .filter(value ->
                        IntStream.rangeClosed(2, (int) Math.sqrt(value))
                                .noneMatch(value1 -> value % value1 == 0))
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("--------");
        start = System.currentTimeMillis();

        IntStream.range(2, num).parallel()
                .filter(value ->
                        IntStream.rangeClosed(2, (int) Math.sqrt(value))
                                .noneMatch(value1 -> value % value1 == 0))
                .forEach(value -> System.out.print(value + " "));

        int[] arr1 = new int[num + 1];
        arr1[0] = -1;
        arr1[1] = -1;
        System.out.println();

        IntStream.range(2, num)
                .filter(value -> arr1[value] == 0).forEach(value -> {
            IntStream.range(2, num)
                    .filter(value1 -> value * value1 <= num)
                    .forEach(value1 -> arr1[value * value1] = -1);
            arr1[value] = value;
        });

        System.out.println("~arr1");
        for (int i = 0; i <= num; i++) {
            if (arr1[i] == i)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("~arr1");
        System.out.println();
        System.out.println(System.currentTimeMillis() - start);

        int[] arr = new int[num + 1];

        start = System.currentTimeMillis();
        arr[0] = -1;
        arr[1] = -1;
        arr[2] = 2;
        for (int i = 3; i <= num; i = i + 2) {
            if (arr[i] == 0) {
                arr[i] = i;
                for (int j = 3; j * i <= num; j = j + 2) {
                    arr[i * j] = -1;
                }
            }
        }
        for (int i = 0; i <= num; i++) {
            if (arr[i] == i)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - start);
    }
}
