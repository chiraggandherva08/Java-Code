package trees;

public class Trees {

    // N - number of nodes.
    // H - height of binary tree.

    public static class Node {
        int key;
        Node leftChild;
        Node rightChild;

        Node (int key) {
            this.key = key;
        }

        // Height of BTrees.
        // Time complexity of height is O(N).
        // Auxiliary Space is O(H)
        public static int height (Node root) {
            if (root == null)
                return 0;
            return Math.max(height(root.rightChild), height(root.leftChild)) + 1;
        }

        // Count Kth distant node from root node.
        public static int count = 0;
        public static int kthNodeKey (Node node, int k) {
            if (node == null)
                return count;
            if (k == 0) {
                System.out.print(node.key + " ");
                count++;
            }
            kthNodeKey(node.leftChild, k-1);
            return kthNodeKey(node.rightChild, k-1);
        }

        // returns the size of the tree.
        // Time Complexity: O(N).
        // Space Complexity: O(H).
        public int getSize(Node root) {
            if (root == null)
                return 0;
            return getSize(root.rightChild) + getSize(root.leftChild) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.leftChild = new Node(20);
        root.rightChild = new Node(30);
        root.rightChild.leftChild = new Node(40);
        root.rightChild.rightChild = new Node(50);
        root.rightChild.rightChild.leftChild = new Node(500);
        root.rightChild.rightChild.rightChild = new Node(600);
        root.rightChild.rightChild.rightChild.leftChild = new Node(10);
        root.rightChild.rightChild.rightChild.leftChild.rightChild = new Node(10);

        System.out.println(
                root.getSize(root)
        );
    }
}