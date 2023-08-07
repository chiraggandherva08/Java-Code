package linkedLists.problems;

public class Reverse_SinglyLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public static void printListIterative(Node head) {
            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println();
        }

        // function to reverse a singly linked list iteratively.
        public static Node reverse_iterative(Node head) {
            if(head == null || head.next == null)
                return head;
            Node p1 = head;
            Node p2 = head.next;

            while (p2 != null){
                Node p3 = p2.next;
                p2.next = p1;

                p1 = p2;
                p2 = p3;
            }
            head.next = null;
            return p1;
        }

        // function to reverse a singly linked list recursively.
        public static Node reverse_recursive_1(Node head) {
            if(head.next == null)
                return head;

            Node head_ = reverse_recursive_1(head.next);
            Node tail_ = head.next;

            tail_.next = head;
            head.next = null;
            return head_;
        }

        // function to reverse a singly linked list recursively.
        public static Node reverse_recursive_2(Node curr, Node prev){
            if (curr == null)
                return prev;

            Node next = curr.next;
            curr.next = prev;
            return reverse_recursive_2(next, curr);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(5, null);

        Node.printListIterative(head);
        head = Node.reverse_iterative(head);
        Node.printListIterative(head);
        head = Node.reverse_recursive_1(head);
        Node.printListIterative(head);
        head = Node.reverse_recursive_2(head, null);
        Node.printListIterative(head);
    }
}
