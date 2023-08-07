package trees;

public class Traversals {

    // Time complexity of inorder traversal is O(N).
    // Auxiliary Space is O(H)
    public static void inorderTraversal (Trees.Node node) {
        if (node != null) {
            inorderTraversal(node.leftChild);
            System.out.print(node.key + " ");
            inorderTraversal(node.rightChild);
        }
    }
    // Time complexity of preorder traversal is O(N).
    // Auxiliary Space is O(H)
    public static void preorderTraversal (Trees.Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.leftChild);
            preorderTraversal(node.rightChild);
        }
    }
    // Time complexity of postorder traversal is O(N).
    // Auxiliary Space is O(H)
    public static void postorderTraversal (Trees.Node node) {
        if (node != null) {
            postorderTraversal(node.leftChild);
            postorderTraversal(node.rightChild);
            System.out.print(node.key + " ");
        }
    }
    // Level order traversal.
    public static void levelOrderTraversal (Trees.Node node) {
        int height = Trees.Node.height(node);
        levelOrderTraversal(node, 0, height);
    }
    public static void levelOrderTraversal (Trees.Node node, int k, int h) {
        if (k > h)
            return;
        Trees.Node.kthNodeKey(node, k);
        System.out.println();
        levelOrderTraversal(node, k+1, h);
    }

    public static void main(String[] args) {
        Trees.Node root = new Trees.Node(10);
        root.leftChild = new Trees.Node(51);
        root.rightChild = new Trees.Node(100);

        root.leftChild.leftChild = new Trees.Node(5111);
        root.leftChild.rightChild = new Trees.Node(511);
        root.rightChild.leftChild = new Trees.Node(1);
        root.rightChild.rightChild = new Trees.Node(100000);

        inorderTraversal(root);
        System.out.println();

        preorderTraversal(root);
        System.out.println();

        postorderTraversal(root);
        System.out.println();

        levelOrderTraversal(root);
        System.out.println();
    }
}
