package linkedLists.problems;

public class Leetcode_Remove_NthNode_fromEnd_19 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            int N = 0;
            ListNode ptrNode = head;

            while(ptrNode != null) {
                ptrNode = ptrNode.next;
                N += 1;
            }
            int k = N - n + 1;

            if(head == null || head.next == null) return null;
            else if(k == 1) return head.next;

            int index = 1;
            ptrNode = head;

            while(index < k-1) {
                ptrNode = ptrNode.next;
                index++;
            }

            if(k == N) ptrNode.next = null;
            else if (ptrNode.next != null) ptrNode.next = ptrNode.next.next;
            return head;
        }

        public static void printLL(ListNode head) {
            if(head == null)
                return;

            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(0, null));
        ListNode.printLL(head);
        head = ListNode.removeNthFromEnd(head, 3);
        ListNode.printLL(head);
    }
}
