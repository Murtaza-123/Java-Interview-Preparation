
class SameTree {

    public static void main(String[] args) {
        Tree1 tree1 = new Tree1();
        tree1.p = new Node(1);
        tree1.p.left = new Node(2);
        tree1.p.right = new Node(3);
        Tree2 tree2 = new Tree2();
        tree2.q = new Node(1);
        tree2.q.left = new Node(2);
        tree2.q.right = new Node(3);
        Solution sol = new Solution();
        System.out.println(sol.checkIsSame(tree1.p, tree2.q));

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

class Tree1 {

    Node p;
}

class Tree2 {

    Node q;
}

class Solution {

    public boolean checkIsSame(Node p, Node q) {
        if (p == q) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return checkIsSame(p.left, q.left) && checkIsSame(p.right, q.right);
    }
}
