package DataStructure;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class TreeTest {
    static Node head = new Node();
    static Node NIL = new Node();

    static {
        Node node15 = new Node(15);
        Node node6 = new Node(6);
        Node node18 = new Node(18);
        Node node3 = new Node(3);
        Node node7 = new Node(7);
        Node node17 = new Node(17);
        Node node20 = new Node(20);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node13 = new Node(13);
        Node node9 = new Node(9);

        head.parent = NIL;

        insertRight(head, node15);
        insertLeft(head, node15);

        insertRight(node15, node18);
        insertLeft(node15, node6);

        insertRight(node6, node7);
        insertLeft(node6, node3);

        insertRight(node3, node4);
        insertLeft(node3, node2);

        insertRight(node7, node13);
        insertLeft(node13, node9);

        insertRight(node18, node20);
        insertLeft(node18, node17);

    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node node;
        binarySearchTree.insert(new Node(14));
        node=binarySearchTree.search(head.left, 14);
    }

    private static void insertLeft(Node node15, Node node6) {
        node15.left = node6;
        node6.parent = node15;
        node6.left = NIL;
        node6.right = NIL;
    }

    private static void insertRight(Node node15, Node node18) {
        node15.right = node18;
        node18.parent = node15;
        node18.left = NIL;
        node18.right = NIL;
    }
}
