package binarytrees;

public class MirrorBTree {

    public static void main(String[] args) {
        Invert invert = new Invert();
        invert.prepend(4);
        invert.prepend(2);
        invert.prepend(7);
        invert.prepend(1);
        invert.prepend(3);
        invert.prepend(6);
        invert.prepend(9);
        invert.print();

    }
}

class Node {

    int data;
    Node right, left;

    Node(int data) {
        this.data = data;
        Node left = right = null;
    }
}

class Invert {

    Node root;

    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (node.data > data) {
            node.left = insert(node.left, data);
        } else if (node.data < data) {
            node.right = insert(node.right, data);
        }
        return node;
    }
    public Node mirrorBTree(Node node)
    {
      if(node == null)
      {
          return node;
      }
      Node left = node.left;
      Node right = node.right;
      node.left = mirrorBTree(right);
      node.right = mirrorBTree(left);
        return node;
      
    }

    public void prepend(int data) {
        root = insert(root, data);
    }

    public void traversal(Node node) {
        if (node != null) {
            traversal(node.left);
            System.out.print(node.data + " ");
            traversal(node.right);
        }
    }

    public void print() {
        traversal(root);
    }
}
