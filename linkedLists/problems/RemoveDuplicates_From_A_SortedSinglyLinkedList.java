package linkedLists.problems;

public class RemoveDuplicates_From_A_SortedSinglyLinkedList {

    public static class Node{
        Node next;
        int val;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        // function to remove duplicates from a linked list.
        public static Node removeDuplicates(Node head) {
            if(head == null)
                return null;
            Node curr = head;

            while (curr.next != null) {
                if(curr.val == curr.next.val)
                    curr.next = curr.next.next;
                else
                    curr = curr.next;
            }
            return head;
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
        Node head = new Node(10, null);
        head.next = new Node(20, null);
        head.next.next = new Node(30, null);
        head.next.next.next = new Node(40, null);
        head.next.next.next.next = new Node(40, null);
        head.next.next.next.next.next = new Node(40, null);
        head.next.next.next.next.next.next = new Node(50, null);
        head.next.next.next.next.next.next.next = new Node(50, null);

        head = Node.removeDuplicates(head);
        Node.printLL(head);
    }

}
