
class Main{
    public static void main(String[] args){
        BST bst = new BST();
        bst.prepend(10);
        bst.prepend(5);
        bst.prepend(40);
        bst.prepend(35);
        bst.prepend(12);
        bst.prepend(4);
        bst.prepend(44);
        bst.prepend(28);
       // bst.search(28);
        bst.deletekey(28);
       // bst.Max();
        bst.inorder();
        
      
    }
}
