//Searching Deleting Inserting and printing in binary search tree
class BST{
    Node root;
    
    public BST()
    {
        root = null;
    }
      void prepend(int key)
    {
       root =  prepend_data(root,key);
    }
  
    Node prepend_data(Node root,int key)
    {
        if(root==null)
        {
          root = new Node(key);
          return root;
           }
         if(key < root.key)
              root.left = prepend_data(root.left,key);
         else if(key > root.key)
             root.right = prepend_data(root.right,key);
            return root;
    }
  
     void inorder()
    {
        inorder_tree(root);
    }
    
    
    void inorder_tree(Node root)
    {
        if(root !=null){
        inorder_tree(root.left);
        System.out.println(root.key);
        inorder_tree(root.right);
        
        }
}
    
    
    void search(int key)
    {
        root = Search_Recursively(root,key);
       
   
    }
    
    Node Search_Recursively(Node root,int key)
    {
        if(root==null || root.key==key)
      
            return root;
    
        if(key < root.key)
            return Search_Recursively(root.left,key);
 
            return Search_Recursively(root.right,key);
                    
    }
    
  
    int minValue(Node root)
    {
            int minval = root.key;
             while(root.left!=null){
                 minval = root.left.key;
                 root=root.left;
             }
             return minval;
        
        
    }
    void deletekey(int key)
    {
        root = delete(root,key);
    }
    Node delete(Node root,int key)
    {
        if (root==null)
            return root;
        if(key < root.key)
           root.left =  delete(root.left,key);
        else if(key > root.key)
            root.right = delete(root.right,key);
        else{
            if (root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.key = minValue(root.right);
            root.right = delete(root.right,root.key);
      
      
    }
        
        return root;
        
}
    
  
    public void Max()
    {
       int max = root.key;
       while(root.right!=null)
       {
           max = root.right.key;
           root = root.right;
       }
    }
    
    
}
   
   