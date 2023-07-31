
class SubTree {

    public static void main(String[] args) {

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

class Tree {

    Node tree;
}

class Tree2 {

    Node subtree;
}

class Solution {
    
    public boolean isSubTree(Node tree ,Node subtree)
    {
          if(tree == null)
              return false;
          if(checkIsSame(tree,subtree))
              return true;
        return isSubTree(tree.left,subtree) && isSubTree(tree.right , subtree);
    }
    public boolean checkIsSame(Node tree, Node subtree) {
        if (tree == subtree) {
            return true;
        }
        if (tree == null || subtree == null || tree.val != subtree.val) {
            return false;
        }
        return checkIsSame(tree.left, subtree.left) && checkIsSame(tree.right, subtree.right);
    }
}
