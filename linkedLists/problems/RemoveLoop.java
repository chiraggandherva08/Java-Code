package linkedLists.problems;

public class RemoveLoop {
    public static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
        }

        public static void removeLoop(Node head){
            Node slow = head, fast = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast)
                    break;
            }

            if (slow != fast)
                return;

            slow = head;
            while (slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }

            fast.next = null;
        }


        public static void printLL(Node head) {
            if (head == null)
                return;

            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // first node of the cycle.
        Node node_ = head.next.next;

        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next = new Node(100);
        head.next.next.next.next.next.next.next.next.next.next = new Node(110);

        // adding cycle to the last element.
        head.next.next.next.next.next.next.next.next.next.next.next = node_;

        Node.removeLoop(head);
        Node.printLL(head);
    }
}
