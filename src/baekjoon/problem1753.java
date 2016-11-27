package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ihyecheon on 2016. 10. 21..
 */
public class problem1753 {
    static class Node implements Comparator<Node> {
        int from;
        int to;
        int weight;

        public int getTo() {
            return to;
        }

        public int getWeight() {
            return weight;
        }

        public Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;

        }

        @Override
        public int compare(Node o1, Node o2) {
            return o1.getWeight() - o2.getWeight();
        }
    }

    private static int maxValue = 100;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] num = reader.readLine().split(" ");
            int V = Integer.parseInt(num[0]);
            int E = Integer.parseInt(num[1]);
            int K = Integer.parseInt(reader.readLine());

            Map<Integer, List<Node>> map = new HashMap<>();

            for (int i = 0; i < E; i++) {
                num = reader.readLine().split(" ");
                int u = Integer.parseInt(num[0]) - 1;
                int v = Integer.parseInt(num[1]) - 1;
                int w = Integer.parseInt(num[2]);
                List<Node> nodeList = map.getOrDefault(u, new ArrayList<>());
                nodeList.add(new Node(u, v, w));
                map.put(u, nodeList);
            }
            int[] distance = new int[V];
            for (int i = 0; i < V; i++) {
                distance[i] = maxValue;
            }
            int[] visite = new int[V];
            distance[K - 1] = 0;

            Queue<Node> nodes = new PriorityQueue<>();


            for (int cnt = 0; cnt < V; cnt++) {
                int min = maxValue;
                int current = 0;
                for (int i = 0; i < V; i++) {
                    if (visite[i] != 1 && min >= distance[i]) {
                        current = i;
                        min = distance[i];
                    }
                }
                visite[current] = 1;
                List<Node> list = map.getOrDefault(current, new ArrayList<>());

                for (int i = 0; i < list.size(); i++) {
                    Node node = list.get(i);
                    int to = node.getTo();
                    if (visite[to] == 0 && distance[to] > distance[current] + node.getWeight()) {
                        distance[to] = node.getWeight() + distance[current];

                    }
                }
            }
            for (int i = 0; i < V; i++) {
                if (distance[i] != maxValue) {
                    System.out.println(distance[i]);
                } else {
                    System.out.println("INF");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
