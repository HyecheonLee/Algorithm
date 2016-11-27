package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ihyecheon on 2016. 10. 8..
 */
public class problem1406 {
    private static class Node {
        Node previous;
        Node next;
        char data;
    }

    public static void main(String[] args) throws IOException {
        /*
L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
P $	$라는 문자를 커서 오른쪽에 추가함 커서는 $의 오른쪽에 위치함
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int N = Integer.parseInt(reader.readLine());
        Node head = new Node();
        Node endNode = new Node();
        Node currentNode = new Node();
        Node cur = null;
        head.next = currentNode;
        currentNode.data = str.charAt(0);
        currentNode.previous = head;

        for (int i = 1; i < str.length(); i++) {
            Node nextNode = new Node();
            nextNode.data = str.charAt(i);
            currentNode.next = nextNode;
            nextNode.previous = currentNode;
            currentNode = nextNode;
            cur = currentNode;
        }
        assert cur != null;
        cur.next = endNode;
        endNode.previous = cur;

        for (int i = 0; i < N; i++) {
            String[] temp = reader.readLine().split(" ");
            switch (temp[0]) {
                case "L":
                    if (cur.previous != head)
                        cur = cur.previous;
                    break;
                case "D":
                    if (cur.next != endNode)
                        cur = cur.next;
                    break;
                case "B":
                    if (cur.previous != endNode) {
                        cur = cur.previous;
                        cur.next = null;
                    }
                    break;
                case "P":
                    Node tmp = new Node();
                    tmp.data = temp[1].charAt(0);
                    Node nodeNext = cur.next;
                    cur.next = tmp;
                    tmp.previous = cur;
                    tmp.next = nodeNext;
                    nodeNext.previous = tmp;
                    cur = cur.next;
                    break;
            }
        }
        currentNode = head.next;
        while (currentNode != endNode) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
