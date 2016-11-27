package DataStructure;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
class BinarySearchTree {
    private static final Node NIL = TreeTest.NIL;
    private static final Node head = TreeTest.head;

    void insert(Node node) {
        Node temp = search(head.left, node.data);
        System.out.println(temp.data);
        temp.left = node;
        if (temp.left == NIL) {

            temp.left = node;
            node.parent = temp;
            node.left = NIL;
            node.right = NIL;

        } else {
            temp.right = node;
            node.parent = temp;
            node.left = NIL;
            node.right = NIL;
        }
    }

    public Node search(Node node, int key) {
        if (node == NIL) {
            return node.parent;
        }
        if (node.data == key) {
            return node;
        }
        NIL.parent = node;
        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public void delete(Node node) {
        if (node.left == NIL && node.right == NIL) {
            Node parent = node.parent;
            if (parent.right == node) {
                parent.right = NIL;
            } else {
                parent.left = NIL;
            }
        } else if (node.left == NIL) {
            node.parent = node.right;
        } else if (node.right == NIL) {
            node.parent = node.left;
        } else {
            
        }
    }
}
