package binarytrees;

public class BinaryTrees {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.append(5);
        bst.append(3);
        bst.append(10);
        bst.append(11);
        bst.append(15);
        bst.append(18);
        bst.delete(10);
        bst.inorder_traversal();
        //  bst.delete(15);
        // System.out.println(bst.Search(10));
        //System.out.println(bst.minRecursively());
        // bst.inorder_traversal();

    }

}

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;

    }
}

class BinarySearchTree {

    Node root = null;

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void traversal(Node node) {
        if (node != null) {
            traversal(node.left);
            System.out.print(node.data + " ");
            traversal(node.right);
        }
    }

    public void append(int data) {
        root = insert(root, data);
    }

    public void inorder_traversal() {
        traversal(root);
    }

    public boolean SearchRecursively(Node node, int data) {
        if (data == node.data) {
            return true;
        } else if (node.data > data) {
            return SearchRecursively(node.left, data);
        } else {
            return SearchRecursively(node.right, data);
        }
    }

    public boolean Search(int data) {
        return SearchRecursively(root, data);
    }

    public int findMax(Node node) {
        int max = node.data;
        while (node.right != null) {
            max = node.right.data;
            node = node.right;
        }
        return max;
    }

    public int max() {
        return findMax(root);
    }

    public int findMin(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }

    public int Min() {
        return findMin(root);
    }

    public int findMaxRecursively(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int max = node.data;
        int right = findMaxRecursively(node.right);
        return Math.max(max, right);

    }

    public int maxRecursively() {
        return findMaxRecursively(root);
    }

    public int findMinRecursively(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int min = node.data;
        int left = findMinRecursively(node.left);
        return Math.min(min, left);
    }

    public int minRecursively() {
        return findMinRecursively(root);
    }

    public Node deletion(Node node, int val) {
        if (node == null) {
            return node;
        }
        if (val < node.data) {
            node.left = deletion(node.left, val);
        } else if (val > node.data) {
            node.right = deletion(node.right, val);
        } else {
            if (node.left == null) 
                return node.right;
            else if (node.right == null) 
                return node.left;
        node.data = findMax(node.left);
        node.left = node.left.left;
        }
        return node;

    }

    public void delete(int x) {
        deletion(root, x);
    }
}
