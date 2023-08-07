package linkedLists.problems;

public class RemoveDuplicates_leetcode_82 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode deleteDuplicates(ListNode head) {
            if(head == null)
                return null;

            ListNode c = head;
            ListNode p = null;

            while (c != null && c.next != null){

                if(c.val != c.next.val){
                    p = c;
                    c = c.next;
                } else {
                    while (c.next != null && c.val == c.next.val){
                        c = c.next;
                    }

                    c = c.next;
                    if (p != null)
                        p.next = c;
                    else
                        head = c;
                }
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
        head.next = new ListNode(1, null);

//        head.next.next = new ListNode(1, null);
//        head.next.next.next = new ListNode(2, null);
//        head.next.next.next.next = new ListNode(3, null);
//        head.next.next.next.next.next = new ListNode(3, null);
//        head.next.next.next.next.next.next = new ListNode(5, null);
//        head.next.next.next.next.next.next.next = new ListNode(20, null);
//        head.next.next.next.next.next.next.next.next = new ListNode(20, null);
//        head.next.next.next.next.next.next.next.next.next = new ListNode(20, null);

        ListNode.printLL(head);
        head = ListNode.deleteDuplicates(head);
        ListNode.printLL(head);
    }
}
