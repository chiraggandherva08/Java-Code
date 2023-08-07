package linkedLists.problems;

public class Merge_TwoSorted_LinkedLists {

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public static Node mergeTwoLists(Node list1, Node list2) {
            if (list1 != null && list2 != null) {

                if (list1.value < list2.value) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                }
            }
            if (list1 == null)
                return list2;
            return list1;
        }

        public static void main(String[] args) {
            mergeTwoLists(new Node(0, null), new Node(10, null));
        }
    }
}