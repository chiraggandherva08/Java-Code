package trees;

public class KthDistantNode {

    // Count Kth distant node from root node.
    public static int count = 0;
    public static int kthNodeKey (Trees.Node node, int k) {
        if (node == null)
            return count;
        if (k == 0) {
            System.out.print(node.key + " ");
            count++;
        }
        kthNodeKey(node.leftChild, k-1);
        return kthNodeKey(node.rightChild, k-1);
    }

    public static void main(String[] args) {
        Trees.Node root = new Trees.Node(10);
        root.leftChild = new Trees.Node(20);
        root.rightChild = new Trees.Node(30);
        root.rightChild.leftChild = new Trees.Node(40);
        root.rightChild.rightChild = new Trees.Node(50);
        root.rightChild.rightChild.leftChild = new Trees.Node(500);
        root.rightChild.rightChild.rightChild = new Trees.Node(600);
        root.rightChild.rightChild.rightChild.leftChild = new Trees.Node(10);
        root.rightChild.rightChild.rightChild.leftChild.rightChild = new Trees.Node(10);

        kthNodeKey(root, 2);
    }
}
