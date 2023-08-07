package linkedLists.problems;

public class DeleteMiddleElement {

    static class ListNode {

        ListNode next;
        int value;

        ListNode(int val, ListNode next) {
            this.value = val;
            this.next = next;
        }

        public static void printLL(ListNode head) {
            if(head == null)
                return;

            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println();
        }

        public static ListNode deleteMiddle(ListNode head) {
            if(head.next == null)
                return null;

            int N = 0;
            ListNode ptr = head;

            while(ptr != null) {
                N++;
                ptr = ptr.next;
            }

            int middleIndex = N/2;
            int index = 0;
            ListNode leftNode = head;

            while (index < middleIndex - 1) {
                index++;
                leftNode = leftNode.next;
            }

            leftNode.next = leftNode.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0, null);
        head.next = new ListNode(1, null);
        head.next.next = new ListNode(2, null);
        head.next.next.next = new ListNode(3, null);
        head.next.next.next.next = new ListNode(4, null);
        head.next.next.next.next.next = new ListNode(5, null);
        head.next.next.next.next.next.next = new ListNode(6, null);
        head.next.next.next.next.next.next.next = new ListNode(7, null);
        head.next.next.next.next.next.next.next.next = new ListNode(8, null);
        head.next.next.next.next.next.next.next.next.next = new ListNode(9, null);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(10, null);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(11, null);


        ListNode.printLL(head);
        head = ListNode.deleteMiddle(head);
        ListNode.printLL(head);
    }
}
