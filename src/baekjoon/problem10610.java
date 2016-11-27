package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ihyecheon on 2016. 9. 6..
 */
public class problem10610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int[] arr = new int[N.length()];
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
            sum += arr[i];
        }
        Arrays.sort(arr);
        if (sum % 3 == 0 && arr[0] == 0) {
            System.out.println(Arrays.stream(arr).mapToObj(value -> value + "").sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.joining())
            );
        } else {
            System.out.println("-1");
        }

    }
}

/*
    int cmp(const void *a, const void *b) { return *(char *) b - *(char *) a; }

    char num[100001];
        int main() {
        int sum = 0, i = 0;
        gets(num);
        for (; num[i]; i++) sum += num[i] - '0';
        qsort(num, i, sizeof(char), cmp);
        if (num[i - 1] == '0' && sum % 3 == 0) puts(num);
        else puts("-1");
        }
*/