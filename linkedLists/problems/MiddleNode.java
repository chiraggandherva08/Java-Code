package linkedLists.problems;

public class MiddleNode {

    public static class Node{
        Node next;
        int val;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        // naive approach.
        public static Node middleNode(Node head){
            if(head == null || head.next == null)
                return head;

            int size = 0;
            Node ptr = head;

            while (ptr != null) {
                ptr = ptr.next;
                size += 1;
            }
            ptr = head;
            int index = 0;

            while (index < size/2){
                index += 1;
                ptr = ptr.next;
            }
            return ptr;
        }

        // Effective approach.
        public static Node middleNodeEffective(Node head) {
            if(head == null || head.next == null)
                return head;

            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

            public static void printLL(Node head) {
            if (head == null)
                return;

            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);

        Node.printLL(head);

        Node middleElement = Node.middleNode(head);
        System.out.println(middleElement.val);

        middleElement = Node.middleNodeEffective(head);
        System.out.println(middleElement.val);
    }
}
