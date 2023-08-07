package linkedLists.problems;

public class IsLoopPresent {
    public static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static int lengthOfLoop(Node head) {
        Node slow_pointer = head;
        Node fast_pointer = head;

        int loop_length = 0;

        while (fast_pointer != slow_pointer || fast_pointer == head) {
            if (fast_pointer == null || fast_pointer.next == null || slow_pointer.next == null)
                return 0;

            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
            loop_length++;
        }
        return loop_length;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node tail = new Node(100, null);
        Node node8 = new Node(110, tail);
        Node node7 = new Node(120, node8);
        Node node6 = new Node(130, node7);
        Node node5 = new Node(140, node6);
        Node node4 = new Node(150, node5);
        Node node3 = new Node(160, node4);
        Node node2 = new Node(170, node3);
        Node node1 = new Node(180, node2);
        Node head = new Node(202, node1);

        printList(head);
        node8.next = node3;

        System.out.println(
                lengthOfLoop(head)
        );
    }
}
