package linkedLists.problems;

public class SortedInsert {

    public static class Node{
        Node next;
        int val;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        public static Node sortedInsert(Node head, int value){
            Node node = new Node(value, null);

            if(head == null)
                return node;
            else if(head.val > node.val) {
                node.next = head;
                return node;
            }

            Node lowPtr = head;
            Node highPointer = head.next;

            while (highPointer != null) {
                if(node.val < highPointer.val && node.val > lowPtr.val) {
                    node.next = highPointer;
                    lowPtr.next = node;
                    return head;
                }
                lowPtr = lowPtr.next;
                highPointer = highPointer.next;
            }

            lowPtr.next = node;
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
        Node head = new Node(-1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(5, null);
        head.next.next.next.next.next = new Node(1000, null);

        Node.printLL(head);
        head = Node.sortedInsert(head, 12);
        Node.printLL(head);
    }
}
