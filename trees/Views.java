package trees;

import java.util.ArrayList;

public class Views {
    static class Node {
        int key;
        Node leftChild;
        Node rightChild;

        Node (int key) {
            this.key = key;
        }

        // Function to print left view of a binary tree.
        // Time complexity: O(H * logH)
        // Space complexity: O(H)
        public ArrayList<Integer> leftView (Node root) {
            ArrayList<Integer> leftViewLst = new ArrayList<>();
            ArrayList<Integer> aux = new ArrayList<>();

            for (int i = 0; i < height(root); i++) {
                kthDistantNode(root, i, aux);
                leftViewLst.add(aux.get(0));
                aux.clear();
            }
            return leftViewLst;
        }

        // Function to print right view of a binary tree.
        // Time complexity: O(H * logH)
        // Space complexity: O(H)
        public ArrayList<Integer> rightView (Node root) {
            ArrayList<Integer> rightViewLst = new ArrayList<>();
            ArrayList<Integer> aux = new ArrayList<>();

            for (int i = 0; i < height(root); i++) {
                kthDistantNode(root, i, aux);
                rightViewLst.add(aux.get(aux.size() - 1));
                aux.clear();
            }
            return rightViewLst;
        }

        // Function to print top view of a binary tree.
        public ArrayList<Integer> topView (Node root) {
            ArrayList<Integer> topViewLst = new ArrayList<>();
            ArrayList<Integer> aux = new ArrayList<>();

            for (int i = 0; i < height(root); i++) {
                kthDistantNode(root, i, aux);
                topViewLst.add(aux.get(aux.size() - 1));
                aux.clear();
            }
            return topViewLst;
        }

        public void kthDistantNode (Node root, int k, ArrayList<Integer> lst) {
            if (root == null) {
                return;
            }
            if (k == 0) {
                lst.add(root.key);
                return;
            }
            kthDistantNode(root.leftChild, k-1, lst);
            kthDistantNode(root.rightChild, k-1, lst);
        }

        public static int height (Node root) {
            if (root == null)
                return 0;
            return Math.max(height(root.rightChild), height(root.leftChild)) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.leftChild = new Node(20);
        root.leftChild.rightChild = new Node(50);
        root.leftChild.rightChild.leftChild = new Node(100);
        root.leftChild.rightChild.leftChild.rightChild = new Node(5000);

        System.out.println(root.leftView(root));
        System.out.println(root.rightView(root));
    }
}
