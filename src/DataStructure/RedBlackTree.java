package DataStructure;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */

public class RedBlackTree {
    Node nil = new Node(0);

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        Node head = new Node(0);
        head.left = node;
        head.right = node;

        node.parent = head;
        node.left = node1;
        node.right = node2;

        node1.parent = node;
        node2.parent = node;

        node2.left = node3;
        node2.right = node4;

        node3.parent = node2;
        node4.parent = node2;

        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.preOrder(head.left);
        System.out.println("~~~~~~~~~~~~~");
        redBlackTree.leftRotate(head.left);
        redBlackTree.preOrder(head.left);
        System.out.println("~~~~~~~~~~~~~~");
        redBlackTree.rightRotate(head.left);
        redBlackTree.preOrder(head.left);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data + " > ");
    }

    public void leftRotate(Node currentNode) {
        /*
              currentNode
                  /\
                 /  \
                /    \
           (Data a) (Node Y)
                      / \
                     /   \
                    /     \
                (Data b)(Data c)
         */
        Node parent = currentNode.parent;
        Node y = currentNode.right; // y 설정
        currentNode.right = y.left; // currentNode 에 Data 오른쪽 노트로 data b 설정 하기.
        y.parent = parent; // 부모 노트 설정
        if (parent.left == currentNode) {
            parent.left = y;
        } else {
            parent.right = y;
        }
        y.left = currentNode;
    }

    public void rightRotate(Node currentNode) {
        /*
              currentNode
                  /\
                 /  \
                /    \
            (Node Y) (Data a)
              / \
             /   \
            /     \
         (data b)(Data c)
         */
        Node parent = currentNode.parent;
        Node y = currentNode.left; // y 설정
        currentNode.left = y.right; // currentNode 에 Data 오른쪽 노트로 data b 설정 하기.
        y.parent = parent; // 부모 노트 설정
        if (parent.left == currentNode) {
            parent.left = y;
        } else {
            parent.right = y;
        }
        y.right = currentNode;
    }
}

