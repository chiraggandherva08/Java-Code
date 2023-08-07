package linkedLists;

public class SinglyCircular_LinkedLists {

    static class Node {
        Node next;
        int value;

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }


        public static void printList(Node head) {
            if(head == null)
                return;

            System.out.print(head.value + " ");
            Node pointerNode = head.next;

            while (pointerNode != head) {
                System.out.print(pointerNode.value + " ");
                pointerNode = pointerNode.next;
            }
            System.out.println();
        }

        // insert head in a singly-circular linked list.
        public static Node insertHead(Node head, int value) {
            if(head == null) {
                Node newHead = new Node(value, null);
                newHead.next = newHead;
                return newHead;
            }

            Node newHead = new Node(value, head);
            Node ptrNode = head.next;

            while (ptrNode.next != head)
                ptrNode = ptrNode.next;

            ptrNode.next = newHead;
            return newHead;
        }

        // insert tail in a singly-circular linked list.
        public static Node insertTail(Node head, int value) {
            if(head == null) {
                return insertHead(null, value);
            }

            Node newHead = new Node(value, head);
            Node ptrNode = head.next;

            while (ptrNode.next != head)
                ptrNode = ptrNode.next;

            ptrNode.next = newHead;
            return newHead.next;
        }

        // remove head from a singly-circular linked list.
        public static Node deleteHead(Node head){
            if(head == null || head.next == null)
                return null;

            Node ptr = head.next;
            while (ptr.next != head)
                ptr = ptr.next;

            ptr.next = head.next;
            return head.next;
        }

        // remove tail from a singly-circular linked list.
        public static Node deleteTail(Node head){
            if(head == null || head.next == null)
                return null;

            Node ptrNode = head.next;
            while (ptrNode.next.next != head)
                ptrNode = ptrNode.next;

            ptrNode.next = head;
            return head;
        }

        // remove kth node from the beginning of singly-circular linked list.
        public static Node deleteKthIndex(Node head, int index){
            if(head == null || head.next == null)
                return null;
            else if(index == 0)
                return deleteHead(head);

            int pIndex = 1;
            Node ptrNode = head;

            while (pIndex < index - 1) {
                ptrNode = ptrNode.next;
                pIndex++;
            }

            ptrNode.next = ptrNode.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.next = head;
        head.next = new Node(20, head);
        head.next.next = new Node(30, head);
        head.next.next.next = new Node(40, head);
        head.next.next.next.next = new Node(50, head);
        head.next.next.next.next.next = new Node(60, head);
        head.next.next.next.next.next.next = new Node(70, head);
        head.next.next.next.next.next.next.next = new Node(80, head); // last node points to head.

        Node.printList(head);
        head = Node.insertHead(head, 12);
        head = Node.insertHead(head, 12);
        head = Node.insertTail(head, 999);
        head = Node.insertTail(head, 9999);
        head = Node.insertTail(head, 99999);
        head = Node.insertTail(head, 999999);
        Node.printList(head);

        head = Node.deleteHead(head);
        Node.printList(head);

        head = Node.deleteTail(head);
        Node.printList(head);

        head = Node.deleteKthIndex(head, 16);
        Node.printList(head);
    }
}
