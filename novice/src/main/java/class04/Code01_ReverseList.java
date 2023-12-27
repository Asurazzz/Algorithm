package class04;

/**
 * @author yemingjie.
 * @date 2023/12/26.
 * @time 23:22.
 */
public class Code01_ReverseList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }


    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            value = data;
        }
    }

    /**
     *
     *  1 -> 2 -> null
     *  null <- 1 <- 2
     * @param head
     * @return
     */
    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node next = null;
        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }




}
