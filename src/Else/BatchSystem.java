package Else;


import java.util.*;

/**
 * Created by ihyecheon on 2016. 7. 11..
 */
public class BatchSystem {
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] duration = new int[N];
        for (int i = 0; i < N; i++) {
            duration[i] = scanner.nextInt();
        }
        String[] user = new String[N];
        for (int i = 0; i < N; i++) {
            user[i] = scanner.next();
        }
        schedule(duration, user);
    }

    private static void schedule(int[] duration, String[] user) {
        HashMap<String, Integer> jobTime = new HashMap<>();
        for (int i = 0; i < N; i++) {
            jobTime.put(user[i], 0);
        }
        for (int i = 0; i < N; i++) {
            jobTime.put(user[i], jobTime.get(user[i]) + duration[i]);
        }
        jobTime.keySet().stream().forEach(System.out::print);
        Map<String, Integer> result = new LinkedHashMap<>();
        jobTime.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
        result.keySet().stream().
                forEach(s -> Arrays.stream(user).filter(s1 -> s1.equals(s)).forEach(System.out::print));
    }
}
