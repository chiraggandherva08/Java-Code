package linkedLists.problems;

public class ReverseSinglyLinkedList_Left_Right_Pointer {

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

        public static ListNode reverse(ListNode head, ListNode tail) {
            if(head == null || head.next == null)
                return head;

            ListNode prev = head;
            ListNode curr = prev.next;

            while (prev != tail) {
                ListNode nextPrev = curr;
                ListNode nextCurr = curr.next;

                curr.next = prev;

                prev = nextPrev;
                curr = nextCurr;
            }
            head.next = null;
            return prev;
        }

        public static ListNode reverse(ListNode head, int left, int right) {
            if(head == null || head.next == null || left == right || left > right)
                return head;

            ListNode tempHead = head;
            int size = 1;

            while (tempHead.next != null) {
                size++;
                tempHead = tempHead.next;
            }

            if(left == 1 && right == size)
                return reverse(head, tempHead);

            int index = 1;

            ListNode HEAD = head;
            ListNode leftNode = null;
            ListNode rightNode = null;

            ListNode tailNode = null;
            ListNode headNode = null;

            while (index <= right) {
                if(index == left-1) {
                    leftNode = head;
                    headNode = head.next;
                }
                else if(index == right) {
                    tailNode = head;
                    rightNode = head.next;
                }

                head = head.next;
                index++;
            }
            reverse(headNode, tailNode);

            if(headNode != null) {
                headNode.next = rightNode;
                leftNode.next = tailNode;
            }
            return HEAD;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);

        ListNode.printLL(head);
        head = ListNode.reverse(head, 1, 2);
        ListNode.printLL(head);
    }
}
