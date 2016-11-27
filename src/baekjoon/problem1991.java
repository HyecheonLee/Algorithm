package baekjoon;

import java.io.*;
import java.util.HashMap;

/**
 * Created by ihyecheon on 2016. 10. 17..
 */
public class problem1991 {
    static class Node {
        Node left;
        Node right;
        String data;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(reader.readLine());
            HashMap<String, Node> map = new HashMap<>();
            Node headNode = new Node();
            Node node = new Node();
            node.data = "A";
            map.put("A", node);
            headNode.left = headNode.right = node;
            for (int i = 0; i < N; i++) {
                String[] tempNode = reader.readLine().split(" ");
                Node root = map.getOrDefault(tempNode[0], new Node());
                root.data = tempNode[0];
                root.left = map.getOrDefault(tempNode[1], new Node());
                root.left.data = tempNode[1];
                root.right = map.getOrDefault(tempNode[2], new Node());
                root.right.data = tempNode[2];
                map.put(tempNode[0], root);
                map.put(tempNode[1], root.left);
                map.put(tempNode[2], root.right);
            }
            preOrder(headNode.left, writer);
            writer.write("\n");
            midOrder(headNode.left, writer);
            writer.write("\n");
            postOrder(headNode.left, writer);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void postOrder(Node node, BufferedWriter writer) throws IOException {
        if (node == null || node.data.equals(".")) {
            return;
        } else {
            postOrder(node.left, writer);
            postOrder(node.right, writer);
            writer.write(node.data);
        }
    }

    private static void midOrder(Node node, BufferedWriter writer) throws IOException {
        if (node == null || node.data.equals(".")) {
            return;
        } else {
            midOrder(node.left, writer);
            writer.write(node.data);
            midOrder(node.right, writer);
        }
    }

    private static void preOrder(Node node, BufferedWriter writer) throws IOException {
        if (node == null || node.data.equals(".")) {
            return;
        } else {
            writer.write(node.data);
            preOrder(node.left, writer);
            preOrder(node.right, writer);
        }
    }
}
