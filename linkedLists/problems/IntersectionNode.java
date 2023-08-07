package linkedLists.problems;

import java.util.HashSet;

public class IntersectionNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        // method 1
        public static Node intersectionNode(Node head1, Node head2){
            if(head1 == null || head2 == null)
                return null;
            if(head1 == head2)
                return head1;

            HashSet<Node> node_set = new HashSet<>();

            while (head1 != null){
                node_set.add(head1);
                head1 = head1.next;
            }

            while(head2 != null){
                if(node_set.contains(head2))
                    return head2;
                head2 = head2.next;
            }

            return null;
        }

        // method2
        public static Node getIntersectionNode(Node headA, Node headB) {
            if(headA == headB)
                return headA;
            else if(headA == null || headB == null)
                return null;

            int lA = 0,lB = 0;
            Node ptr = headA;

            while(ptr != null){
                ptr = ptr.next;
                lA++;
            }
            ptr = headB;
            while(ptr != null){
                ptr = ptr.next;
                lB++;
            }

            int diff = Math.max(lA, lB) - Math.min(lA, lB);
            int i = 0;

            if(lA > lB) while(i < diff){
                    headA = headA.next;
                    i++;
                }
            else while(i < diff){
                    headB = headB.next;
                    i++;
                }

            while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headB;
        }
    }

    public static void main(String[] args) {
        Node h1 = new Node(10);
        h1.next = new Node(20);
        h1.next.next = new Node(30);
        h1.next.next.next = new Node(40);
        h1.next.next.next.next = new Node(50);
        h1.next.next.next.next.next = new Node(60);

        Node h2 = new Node(100);
        h2.next = new Node(120);
        h2.next.next = new Node(140);
        h2.next.next.next = new Node(160);
        h2.next.next.next.next = new Node(180);

        Node intersection = h1.next.next.next;
        h2.next.next.next.next.next = intersection;

        System.out.println(Node.intersectionNode(h1, h2) == intersection);
        System.out.println(Node.getIntersectionNode(h1, h2) == intersection);
    }
}
