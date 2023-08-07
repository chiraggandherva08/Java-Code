package linkedLists;

public class SinglyLinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // recursively print linked list.
        public static void printListRecursive(SinglyLinkedList.Node head) {
            if (head == null) {
                System.out.println();
                return;
            }
            System.out.print(head.value + " ");
            printListRecursive(head.next);
        }

        // Iterative print linked list.
        public static void printListIterative(SinglyLinkedList.Node head) {
            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println();
        }

        // function to insert at the beginning.
        public static Node insertionAtBeginning(Node head, int val) {
            return new Node(val, head);
        }

        // function to insert at the end.
        public static void insertionAtEnd(Node head, int val) {
            Node ptrNode = head;

            while (ptrNode.next != null)
                ptrNode = ptrNode.next;

            ptrNode.next = new Node(val, null);
        }

        // function to insert at any location.
        public static void insertAtIndex(Node head, int index, int value) {
            if (index < 0)
                return;

            int cIndex = 0;
            while (cIndex != index - 1) {
                if (head == null || head.next == null)
                    return;
                head = head.next;
                cIndex++;
            }
            head.next = new Node(value, head.next);
        }

        // delete first node.
        public static Node deleteHead(Node head) {
            if (head == null)
                return null;
            return head.next;
        }

        // delete tail node.
        public static void deleteTail(Node head) {
            if (head == null)
                return;

            if (head.next == null) {
                return;
            }

            Node ptrNode = head;
            while (ptrNode.next.next != null) {
                ptrNode = ptrNode.next;
            }
            ptrNode.next = null;
        }

        // search in a linked lists.
        public static int searchIterative(Node head, int key) {
            int index = 0;

            while(head != null) {
                if (head.value == key)
                    return index;
                index++;
                head = head.next;
            }
            return -1;
        }

        public static int searchRecursive(Node head, int key, int index) {
            if (head == null)
                return -1;

            else if (head.value == key)
                return index;

            return searchRecursive(head.next, key, index+1);
        }
    }

    public static void main(String[] args) {

        Node head = new Node(12, null);
        Node.printListIterative(head);

        head.next = new Node(100, null);
        head.next.next = new Node(17, null);

        Node.printListIterative(head);

        head = Node.insertionAtBeginning(head, 18);
        head = Node.insertionAtBeginning(head, 15);
        head = Node.insertionAtBeginning(head, 10);
        head = Node.insertionAtBeginning(head, 0);
        Node.printListIterative(head);

        Node.deleteTail(head);
        Node.printListIterative(head);

        Node.insertionAtEnd(head, 9819);
        Node.printListIterative(head);

        Node.insertAtIndex(head, 3, -100);
        Node.printListIterative(head);

        head = Node.deleteHead(head);
        Node.printListRecursive(head);

        head = Node.deleteHead(head);
        Node.printListIterative(head);

        Node.deleteTail(head);
        Node.printListIterative(head);

        System.out.println(Node.searchIterative(head, -100));
        System.out.println(Node.searchRecursive(head, -100, 0));
    }
}
