
public class BalancedTree {

    public static void main(String[] args) {
        Balanced balance = new Balanced();
        balance.root = new Node(3);
        balance.root.left = new Node(9);
        balance.root.right = new Node(20);
        balance.root.right.left = new Node(15);
        balance.root.right.right = new Node(7);
        System.out.println(balance.isBalanced(balance.root));

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

class Balanced {

    Node root;

    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int difference = height(node.left) - height(node.right);
        if (difference > 1) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
