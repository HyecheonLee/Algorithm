package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ihyecheon on 2016. 9. 16..
 */
public class problem1800 {
    static int max = 10_000;

    static class Edge {
        int src;
        int dest;
        int cost;

        public Edge(int src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] line = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                line[i][j] = max;
            }
        }
        for (int i = 0; i < M; i++) {
            int src = scanner.nextInt() - 1;
            int dest = scanner.nextInt() - 1;
            int cost = scanner.nextInt();
            line[src][dest] = cost;
            line[dest][src] = cost;
        }
        kruskal(line);
    }

    public static void kruskal(int[][] G) {
        List<Edge> edgeList = new ArrayList<>();
        for (int i = 0; i < G.length; i++) {
            for (int j = i + 1; j < G.length; j++) {
                edgeList.add(new Edge(i, j, G[i][j]));
            }
        }
        int[] V = new int[G.length];
        for (int i = 0; i < G.length; i++) {
            V[i] = i;
        }

        edgeList = edgeList
                .stream()
                .sorted((o1, o2) -> o1.cost - o2.cost)
                .filter(edge -> {
                    int src, dest;
                    if ((src = find(V, edge.src)) != (dest = find(V, edge.dest))) {
                        V[src] = dest;
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(V));
        edgeList.forEach(edge -> System.out.println(edge.src + "," + edge.dest + ":" + edge.cost));
    }

    private static int find(int[] v, int src) {
        while (src != v[src]) {
            v[src] = v[v[src]];
            src = v[src];
        }
        return src;
    }
}
