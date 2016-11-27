package DataStructure;

/**
 * Created by ihyecheon on 2016. 10. 9..
 */
public class TwoThreeTree {
    Node headNode, EndNode;
    Node parentNode;

    class Node {
        int leftData;
        int rightData;
        Node left;
        Node mid;
        Node right;
    }

    void initializeTree() {
        headNode = new Node();
        headNode.left = headNode;
        headNode.right = headNode;
        headNode.mid = headNode;
    }

    void insertNode(int Data) {
        int flagSplit = 0;
        Node tempNode;

        if (headNode.right == headNode) {
            Node ptrNode = new Node();

            ptrNode.leftData = Data;
            ptrNode.rightData = -1;
            ptrNode.left = headNode;
            ptrNode.mid = headNode;
            ptrNode.right = headNode;

            headNode.right = ptrNode;
            headNode.mid = ptrNode;
            headNode.left = ptrNode;
        } else {
            tempNode = headNode.left;
            parentNode = headNode;
            while (true) {
                if (tempNode.leftData < Data) {
                    if (tempNode.rightData == -1)
                        break;
                    else {
                        if (tempNode.left == headNode) {
                            flagSplit = 1;
                            break;
                        } else {
                            if (tempNode.rightData < Data) {
                                if (tempNode.mid == headNode) break;
                                else {
                                    parentNode = tempNode;
                                    tempNode = tempNode.mid;
                                }
                            } else {
                                if (tempNode.mid == headNode) break;
                                else {
                                    parentNode = tempNode;
                                    tempNode = tempNode.mid;
                                }
                            }
                        }
                    }
                } else {
                    if (tempNode.left == headNode) {
                        if (tempNode.rightData == -1) {
                            flagSplit = 0;
                        } else {
                            flagSplit = -1;
                        }
                        break;
                    } else {
                        parentNode = tempNode;
                        tempNode = tempNode.left;
                    }
                }
            }
            if (tempNode.rightData == -1 && flagSplit == 0) {
                if (tempNode.leftData < Data) {
                    tempNode.rightData = Data;
                } else {
                    tempNode.rightData = tempNode.leftData;
                    tempNode.leftData = Data;
                }
            } else if (flagSplit > 0) {
                Node ptrNode = new Node();

                ptrNode.leftData = Data;
                ptrNode.rightData = -1;
                ptrNode.left = headNode;
                ptrNode.mid = headNode;
                ptrNode.right = headNode;

                if (flagSplit == 1) {
                    ptrNode.left = splitNode(tempNode, ptrNode);
                    tempNode = parentNode.left;

                    if (parentNode.rightData == -1) {
                        parentNode.rightData = parentNode.leftData;
                        parentNode.leftData = tempNode.leftData;
                        parentNode.right = parentNode.mid;
                        parentNode.mid = tempNode.mid;
                        parentNode.left = tempNode.left;
                    }
                }
            }
        }
    }

    private Node splitNode(Node tempNode, Node ptrNode) {
        Node newNode = new Node();
        newNode.rightData = -1;
        newNode.left = headNode;
        newNode.mid = headNode;
        newNode.right = headNode;

        if (tempNode.leftData < ptrNode.leftData) {
            if (ptrNode.leftData < tempNode.rightData) {
                newNode.leftData = tempNode.rightData;
            }
        }

        return null;
    }

}
