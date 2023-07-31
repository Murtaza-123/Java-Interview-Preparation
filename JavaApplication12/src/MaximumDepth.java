
public class MaximumDepth {

    public static void main(String[] args) {
        FindDepth depth = new FindDepth();
        depth.root = new Node(3);
        depth.root.left = new Node(9);
        depth.root.right = new Node(20);
        depth.root.right.left = new Node(15);
        depth.root.right.right = new Node(7);
        System.out.println(depth.maxDepth(depth.root));
    }
}

class Node {

    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

class FindDepth {

    Node root;

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left, right) + 1;
    }

}
