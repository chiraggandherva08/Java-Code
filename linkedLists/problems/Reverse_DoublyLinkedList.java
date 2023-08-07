package linkedLists.problems;

public class Reverse_DoublyLinkedList {
    static class Node {
        Node next;
        Node prev;
        int value;

        Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        public static Node reverse_LL(Node head) {
            if (head == null || head.next == null)
                return head;

            Node prev = null, curr = head;

            while (curr != null) {
                prev = curr.prev;
                curr.prev = curr.next;
                curr.next = prev;

                curr = curr.prev;
            }
            return prev.prev;
        }

        // print doubly linked list forward.
        public static void printList_Forward(Node head) {
            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(null, null, 10);

        Node node2 = new Node(node1, null, 20);
        node1.next = node2;

        Node node3 = new Node(node2, null, 30);
        node2.next = node3;

        Node node4 = new Node(node3, null, 40);
        node3.next = node4;

        Node node5 = new Node(node4, null, 50);
        node4.next = node5;

        Node node6 = new Node(node5, null, 60);
        node5.next = node6;

        Node node7 = new Node(node6, null, 70);
        node6.next = node7;

        node7.next = new Node(node7, null, 80);

        Node.printList_Forward(node1);
        node1 = Node.reverse_LL(node1);
        Node.printList_Forward(node1);
    }
}
