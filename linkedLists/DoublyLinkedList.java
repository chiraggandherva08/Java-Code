package linkedLists;

public class DoublyLinkedList {

    public static class Node {
        int value;
        Node next;
        Node prev;

        Node (Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    // print doubly linked list forward.
    public static void printList_Forward(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        } System.out.println();
    }

    // print doubly linked list backward.
    public static void printList_Backward(Node tail) {
        while(tail != null) {
            System.out.print(tail.value + " ");
            tail = tail.prev;
        } System.out.println();
    }

    public static Node insertHead(Node head, int value) {
        if(head == null)
            return new Node(null, null, value);

        Node newNode = new Node(null, head, value);
        head.prev = newNode;
        return newNode;
    }

    public static Node insertTail(Node head, int value) {
        if (head == null)
            return new Node(null, null, value);

        while (head.next != null)
            head = head.next;

        head.next = new Node(head, null, value);
        return head.next;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;

        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        Node curr = head;
        if (curr == null || curr.next == null)
            return null;

        while (curr.next.next != null)
            curr = curr.next;

        Node tail = curr.next;
        tail.prev = null;

        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        // list => [12, 83, 10, 92];
        Node head = new Node(null, null, 12);

        Node secondElement = new Node(head, null, 83);
        head.next = secondElement;

        Node thirdElement = new Node(secondElement, null, 10);
        secondElement.next = thirdElement;

        Node fourthElement = new Node(thirdElement, null, 92);
        thirdElement.next = fourthElement;

        printList_Forward(head);
        printList_Backward(fourthElement);

        head = insertHead(head, 1221);
        printList_Forward(head);

        Node tail = insertTail(head, 9999);
        printList_Forward(head);
        printList_Backward(tail);

        head = deleteHead(head);
        printList_Forward(head);

        head = deleteTail(head);
        printList_Forward(head);
    }
}
