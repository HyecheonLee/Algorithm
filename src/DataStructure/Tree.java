package DataStructure;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by ihyecheon on 2016. 10. 7..
 */
public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Queue<Node> nodes = new ArrayDeque<>();
    static Node head;

    public static void main(String[] args) {
        insertData(1);
        insertData(3);
        insertData(4);
        insertData(5);
        insertData(6);
        insertData(2);
        insertData(7);
        System.out.println(nodes.size());
        Node temp = head;
        preOrder(temp);
        System.out.println("------");
        postOrder(temp);
        System.out.println("--------");
        middleOrder(temp);
        System.out.println("--------");
        levelTraverse(temp);
    }

    private static void levelTraverse(final Node temp) {
        final Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(temp);
        while (!nodes.isEmpty()) {
            final Node node = nodes.poll();
            System.out.print(node.data + "  = > ");
            if (node.left.data != '\0') {
                nodes.add(node.left);
            }
            if (node.right.data != '\0') {
                nodes.add(node.right);
            }
        }
    }

    private static void preOrder(Node temp) {
        if (temp.data == '\0') {
            return;
        }
        System.out.print(temp.data + " => ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    private static void postOrder(Node temp) {
        if (temp.data == '\0') {
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + " => ");
    }

    private static void middleOrder(Node temp) {
        if (temp.data == '\0') {
            return;
        }
        middleOrder(temp.left);
        System.out.print(temp.data + " => ");
        middleOrder(temp.right);
    }

    private static void insertData(int data) {
        if (head == null) {
            Node node = new Node();
            head = node;
            node.data = data;

            node.left = new Node();
            node.right = new Node();
            nodes.add(node.left);
            nodes.add(node.right);
        } else {
            Node temp = nodes.poll();
            temp.data = data;
            temp.left = new Node();
            temp.right = new Node();
            nodes.add(temp.left);
            nodes.add(temp.right);
        }
    }
}
