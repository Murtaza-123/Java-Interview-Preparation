
public class TreeDiameter {

    public static void main(String[] args) {
        Diameter dia = new Diameter();
        dia.root = new Node(1);
        dia.root.left = new Node(2);
        dia.root.right = new Node(3);
        dia.root.left.left = new Node(4);
        dia.root.left.right = new Node(5);
        System.out.println(dia.treeDiameter(dia.root));
        
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

class Diameter {

    Node root;

    public int treeDiameter(Node node) {
        if(node == null)
        {
            return 0;
        }
        int diameter = height(node.left) + height(node.right);
        int left = treeDiameter(node.left);
        int right = treeDiameter(node.right);
        return Math.max(diameter, Math.max(left, right));

    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
