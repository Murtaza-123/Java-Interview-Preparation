package binarytrees;

public class MaximumDepth {

    public static void main(String[] args) {
        BT btree = new BT();
        btree.root = new Node(3);
        btree.root.left = new Node(9);
        btree.root.right = new Node(20);
        btree.root.right.left = new Node(15);
        btree.root.right.right = new Node(7);
        System.out.println(btree.maxDepth(btree.root));

    }
}

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        Node left = right = null;
    }
}

class BT {

    Node root;

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        System.out.println("left Tree");
        System.out.println(left);
        System.out.println("Right Tree");
        System.out.println(right);
        return Math.max(left, right) + 1;
    }
}
