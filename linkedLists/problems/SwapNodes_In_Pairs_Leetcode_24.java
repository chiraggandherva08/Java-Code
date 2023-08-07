package linkedLists.problems;

public class SwapNodes_In_Pairs_Leetcode_24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

        public static ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null)
                return head;

            ListNode PREV = null;
            ListNode p1 = head;
            ListNode p2 = head.next;
            ListNode NEXT = p2.next;

            head = head.next;

            while (p1.next != null) {
                p2.next = p1;
                p1.next = NEXT;

                p1 = NEXT;
                p2 = p1.next;
                NEXT = p2.next;

                ListNode T = p1;
                p1 = p2;
                p2 = T;

                if(PREV != null)
                    PREV.next = p2;

                PREV = p2;
                ListNode.printLL(head);
            }
            return head;
        }

        public static void printLL(ListNode head) {
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
        ListNode head = new ListNode(1, null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);
        head.next.next.next.next = new ListNode(5, null);
        head.next.next.next.next.next = new ListNode(6, null);
        head.next.next.next.next.next.next = new ListNode(7, null);

        ListNode.printLL(head);
        head = ListNode.swapPairs(head);
        ListNode.printLL(head);
    }
}
