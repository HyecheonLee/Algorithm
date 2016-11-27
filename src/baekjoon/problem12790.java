package baekjoon;

import java.io.*;

/**
 * Created by admin on 2016-10-17.
 */
public class problem12790 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(reader.readLine().trim());
            while (T-- > 0) {
                String[] num = reader.readLine().split(" ");
                int[] power = new int[8];
                for (int i = 0; i < num.length; i++) {
                    power[i] = Integer.parseInt(num[i]);
                }
                /*
                전투력 = 1 * (HP) + 5 * (MP) + 2 * (공격력) + 2 * (방어력)
                 */
                int HP = (power[0] + power[4]);
                HP = HP > 1 ? HP : 1;
                int MP = (power[1] + power[5]);
                MP = MP > 1 ? MP : 1;
                int attack = (power[2] + power[6]);
                attack = attack > 0 ? attack : 0;
                int sum = HP * 1 + MP * 5 + attack * 2 + (power[3] + power[7]) * 2;
                writer.write(sum + "\n");
            }
        }
    }
}
