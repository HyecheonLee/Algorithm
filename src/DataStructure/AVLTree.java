package DataStructure;


import java.util.*;

/**
 * Created by ihyecheon on 2016. 10. 7..
 */
public class AVLTree {
    static class Node implements Comparator<Integer> {
        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        Integer data;
        int balance;
        Node left;
        Node right;
        Node parent;

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    static Node head;

    public static void main(String[] args) {
        String elements[] = {"java2s.com", "C", "D", "G", "F"};
        TreeSet<String> set = new TreeSet<>(Arrays.asList(elements));
        TreeSet<Node> treeSet = new TreeSet<>((o1, o2) -> o1.data - o2.data);
        Node node = new Node(1);
        treeSet.add(node);
        treeSet.add(new Node(3));
        treeSet.add(new Node(6));
        treeSet.add(new Node(3));
        treeSet.add(new Node(12));
        treeSet.add(new Node(6));
        treeSet.add(new Node(10));

        treeSet.forEach(node1 -> System.out.println(node1.data));
        System.out.println(set.headSet("D"));
        System.out.println(set.tailSet(""));
//        insertData(2);
//        insertData(1);
//        insertData(3);
//        insertData(4);
//        insertData(5);
//        levelTraverse(head.left);
//        System.out.println("--------");
//        preOrder(head.left);
//        System.out.println("--------");
//        postOrder(head.left);
//        System.out.println("--------");
//        middleOrder(head.left);
    }

    private static void preOrder(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + ":" + temp.balance + " => ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    private static void postOrder(Node temp) {
        if (temp == null) {
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + ":" + temp.balance + " => ");
    }

    private static void middleOrder(Node temp) {
        if (temp == null) {
            return;
        }
        middleOrder(temp.left);
        System.out.print(temp.data + ":" + temp.balance + " => ");
        middleOrder(temp.right);
    }

    private static void insertData(int data) {
        if (head == null) {
            head = new Node();
            Node currentNode = new Node();
            head.left = currentNode;
            head.right = currentNode;
            currentNode.data = data;
            currentNode.balance = 0;
            currentNode.parent = head;
        } else {
            Node currentNode = head.left;
            Node parent;
            while (true) {
                if (data < currentNode.data) {
                    parent = currentNode;
                    if (parent.left != null) {
                        currentNode = parent.left;
                        currentNode.parent = parent;
                    } else {
                        parent.left = new Node();
                        currentNode = parent.left;
                        currentNode.data = data;
                        currentNode.parent = parent;
                        parent.balance--;
                        parent.parent.balance--;
                        break;
                    }
                } else {
                    parent = currentNode;
                    if (parent.right != null) {
                        currentNode = parent.right;
                        currentNode.parent = parent;
                    } else {
                        parent.right = new Node();
                        currentNode = parent.right;
                        currentNode.data = data;
                        currentNode.parent = parent;
                        parent.balance++;
                        parent.parent.balance++;
                        break;
                    }
                }
            }
            isBalance(head.left);
        }
    }

    private static void isBalance(Node left) {

    }

    private static void levelTraverse(final Node temp) {
        final Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(temp);
        while (!nodes.isEmpty()) {
            final Node node = nodes.poll();
            System.out.print(node.data + " => ");
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}
