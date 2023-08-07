package trees;

public class MaximumKeyBTree {

    // TIme complexity: O(N)
    // Aux space: O(H)
    public static int maxKey(Trees.Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(maxKey(root.leftChild), maxKey(root.rightChild)));
    }

    public static void main(String[] args) {
        Trees.Node root = new Trees.Node(10);
        root.leftChild = new Trees.Node(51);
        root.rightChild = new Trees.Node(100);

        root.leftChild.leftChild = new Trees.Node(5111);
        root.leftChild.rightChild = new Trees.Node(511);
        root.rightChild.leftChild = new Trees.Node(1);
        root.rightChild.rightChild = new Trees.Node(100000);

        System.out.println(
                maxKey(root)
        );
    }
}
