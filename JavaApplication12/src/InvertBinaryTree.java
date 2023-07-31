
public class InvertBinaryTree {

    public static void main(String[] args) {
        Invert invert = new Invert();
        invert.prepend(4);
        invert.prepend(2);
        invert.prepend(7);
        invert.prepend(1);
        invert.prepend(3);
        invert.prepend(6);
        invert.prepend(9);
        invert.traversal();
        invert.mirror();
        invert.traversal();

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

class Invert {

    Node root;

    public Node add(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = add(node.left, val);
        } else if (val > node.val) {
            node.right = add(node.right, val);
        }
        return node;
    }

    public void prepend(int val) {
        root = add(root, val);
    }

    public Node invert(Node node) {
        if (node == null) {
            return node;
        }
        Node left = node.left;
        Node right = node.right;
        node.left = invert(right);
        node.right = invert(left);
        return node;
    }

    public void mirror() {
        invert(root);
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val + " ");
        }
    }

    public void traversal() {
        postOrder(root);
    }
}
