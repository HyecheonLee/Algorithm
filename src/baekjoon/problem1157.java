package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ihyecheon on 2016. 10. 13..
 */
public class problem1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            int temp = hashMap.getOrDefault(c, 0) + 1;
            hashMap.put(c, temp);
            max = max > temp ? max : temp;
        }
        int cnt = 0;
        char c = 0;
        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character) == max) {
                c = character;
                cnt++;
            }
        }
        if (cnt == 1) {
            System.out.println(Character.toUpperCase(c));
        } else {
            System.out.println("?");
        }
    }
}
