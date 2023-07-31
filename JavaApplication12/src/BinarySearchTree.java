//Insert Search or Traverse deletion

public class BinarySearchTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(5);
        bt.insert(3);
        bt.insert(10);
        bt.insert(11);
        bt.insert(15);
        bt.remove1(10);
        bt.Traversal();

    }
}

class Node {

    public int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        this.left = this.right = null;

    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    public Node addRecursively(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = addRecursively(node.left, value);
        } else if (value > node.value) {
            node.right = addRecursively(node.right, value);
        }

        return node;
    }

    public void insert(int value) {
        root = addRecursively(root, value);
    }

    public void Inorder(Node node) {
        if (node != null) {

            Inorder(node.left);
            System.out.println(node.value);
            Inorder(node.right);

        }
    }

    public void Traversal() {
        Inorder(root);
    }

    public Node SearchRecursively(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        } else if (value < node.value) {
            return SearchRecursively(node.left, value);
        } else {
            return SearchRecursively(node.right, value);

        }
    }

    public boolean find(int val) {
        root = SearchRecursively(root, val);
        if (root != null) {
            return true;
        }
        return false;
    }

    public int findMax(Node node) {
        int max = node.value;
        while (node.right != null) {
            max = node.right.value;
            node = node.right;
        }

        return max;
    }

    public int findMin(Node node) {

        int min = root.value;
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }

        return min;
    }

    public int minRecursively(Node n) {

        if (n == null) {
            return Integer.MAX_VALUE;
        } else {
            int min = n.value;
            int left = minRecursively(n.left);
            return Math.min(min, left);
        }
    }

    public int minimum() {
        return minRecursively(root);
    }

    public int maxRecursively(Node n) {
        if (n == null) {
            return Integer.MIN_VALUE;
        } else {
            int current = n.value;
            int right = maxRecursively(n.right);
            return Math.max(current, right);
        }
    }

    public int maximum() {
        return maxRecursively(root);
    }

    public Node deletion(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.value) {
            node.left = deletion(node.left, value);
        } else if (value > node.value) {
            node.right = deletion(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.value = maxRecursively(node.left);
            node.left = deletion(node.left, node.value);
        }
        return node;
    }

    public void remove(int value) {
        deletion(root, value);
    }

    public Node Remove(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.value) {
            node.left = Remove(node.left, value);
        } else if (value > node.value) {
            node.right = Remove(node.right, value);
        } else {

            node.value = maxRecursively(node.left);
            node.left = node.left.left;

        }
        return node;
    }

    public void remove1(int value) {
        Remove(root, value);
    }

    public Node Delete(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.value) {
            node.left = Delete(node.left, value);
        } else if (value > node.value) {
            node.right = Delete(node.right, value);
        } else {

            node.value = minRecursively(node.right);
            node.right = node.right.right;

        }
        return node;
    }

    public void remove2(int value) {
        Delete(root, value);
    }
}
