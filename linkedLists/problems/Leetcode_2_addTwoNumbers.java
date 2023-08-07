package linkedLists.problems;

public class Leetcode_2_addTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static void addTwoNumbersRemaining(ListNode remainingNodes, ListNode answer, int carry) {
            while (remainingNodes != null) {
                int sum = (remainingNodes.val + carry) % 10;
                carry = (remainingNodes.val + carry - sum) / 10;

                answer.val = sum;

                remainingNodes = remainingNodes.next;

                if (remainingNodes == null)
                    break;

                answer.next = new ListNode(carry, null);
                answer = answer.next;
            }

            if(carry != 0) {
                answer.next = new ListNode(carry, null);
            }
        }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null)
                return l2;
            else if (l2 == null)
                return l1;

            int carry = 0;
            ListNode answer = new ListNode(0, null);
            ListNode head_ = answer;

            while (l1 != null && l2 != null) {
                int sum = (l1.val + l2.val + carry) % 10;
                carry = (l1.val + l2.val + carry - sum) / 10;
                head_.val = sum;

                l1 = l1.next;
                l2 = l2.next;

                if(l1 == null && l2 == null)
                    break;

                head_.next = new ListNode(0, null);
                head_ = head_.next;
            }

            if(l1 == null)
                addTwoNumbersRemaining(l2, head_, carry);
            else
                addTwoNumbersRemaining(l1, head_, carry);

            return answer;
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
        ListNode l1 = new ListNode(9, null);
        l1.next = new ListNode(9, null);
        l1.next.next = new ListNode(9, null);
        l1.next.next.next = new ListNode(9, null);
        l1.next.next.next.next = new ListNode(9, null);
        l1.next.next.next.next.next = new ListNode(9, null);
        l1.next.next.next.next.next.next = new ListNode(9, null);

        ListNode l2 = new ListNode(9, null);
        l2.next = new ListNode(9, null);
        l2.next.next = new ListNode(9, null);
        l2.next.next.next = new ListNode(9, null);

        ListNode.printLL(l1);
        ListNode.printLL(l2);
        ListNode.printLL(ListNode.addTwoNumbers(l1, l2));
    }
}
