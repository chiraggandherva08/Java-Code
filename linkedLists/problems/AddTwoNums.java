package linkedLists.problems;

public class AddTwoNums {

    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }

        public static void printLL(Node head) {
            if (head == null)
                return;

            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

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

        public static Node addTwoLists(Node first, Node second) {
            int num1 = 0,num2 = 0;

            // calculate num1
            while (first != null) {
                num1 = num1*10 + first.data;
                first = first.next;
            }

            // calculate num2
            while (second != null) {
                num2 = num2*10 + second.data;
                second = second.next;
            }

            // calculate sum
            int sum = num1 + num2;

            // creating new Node to store the sum.
            Node ans = new Node(0);
            Node ans_head = ans;

            System.out.println(sum);

            while (sum > 0){
                ans.data = sum % 10;
                sum = sum / 10;

                if(sum != 0) {
                    ans.next = new Node(0);
                    ans = ans.next;
                }
            }

            return reverse_iterative(ans_head);
        }
    }

    public static void main(String[] args) {
        Node first = new Node(5);
        first.next = new Node(7);
        first.next.next = new Node(9);
        first.next.next.next = new Node(9);
        first.next.next.next.next = new Node(9);
        first.next.next.next.next.next = new Node(8);
        first.next.next.next.next.next.next = new Node(5);
        first.next.next.next.next.next.next.next = new Node(5);
        first.next.next.next.next.next.next.next.next = new Node(3);
        first.next.next.next.next.next.next.next.next.next = new Node(9);
        first.next.next.next.next.next.next.next.next.next.next = new Node(2);
        first.next.next.next.next.next.next.next.next.next.next.next = new Node(9);
        first.next.next.next.next.next.next.next.next.next.next.next.next = new Node(8);
        first.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node(7);

        Node second = new Node(4);
        second.next = new Node(3);
        second.next.next = new Node(2);
        second.next.next.next = new Node(5);
        second.next.next.next.next = new Node(6);
        second.next.next.next.next.next = new Node(7);

        Node newNode = Node.addTwoLists(first, second);
        Node.printLL(newNode);
    }
}
