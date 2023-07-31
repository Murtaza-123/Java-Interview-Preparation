
public class PathSum {

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.root = new Node(5);
        sum.root.left = new Node(4);
        sum.root.left.left = new Node(11);
        sum.root.left.left.left = new Node(7);
        sum.root.left.left.right = new Node(2);
        sum.root.right = new Node(8);
        sum.root.right.left = new Node(13);
        sum.root.right.right = new Node(4);
        sum.root.right.right.right = new Node(1);
        System.out.println(sum.pathsum(sum.root, 22));

    }
}

class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Sum {

    Node root;

    public int pathsum(Node node, int targetsum) {
        int sum, leftsum, rightsum;
        sum = leftsum = rightsum = 0;
        if (node == null) {
            return 0;
        }
        if (node.left != null) {
            leftsum = pathsum(node.left, targetsum);
            rightsum = pathsum(node.right, targetsum);
        }
        sum = node.val + leftsum;
        if (sum == targetsum) {
            return sum;
        }

        return sum;

    }
}
