package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 9. 4..
 */
public class problem9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String pattern = reader.readLine();
        for (int i = 0; i < n; i++) {
            String temp = reader.readLine();
            int cnt = 0;
            boolean flag = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (cnt == temp.length()) {
                    flag = false;
                    System.out.println("NE");
                    break;
                }
                if (pattern.charAt(j) == '*') {
                    j++;
                    while (pattern.charAt(j) != temp.charAt(cnt++)) ;
                } else {
                    if (pattern.charAt(j) == temp.charAt(cnt++)) {
                    } else {
                        System.out.println("NE");
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("DA");
        }
    }
}
