
public class LinkedList{
    Node head;

public void insert(int data){
    Node node = new Node();
    node.next =null;
    node.data=data;
    if(head==null){
        head = node;
    }
    else{
       Node n = head;
       while(n.next!=null){
           n=n.next;
        
        
    }
       n.next = node;
    
}
}
public void show(){
    Node n = head;
    while(n!=null){
        System.out.print(n.data+"---> ");
        n=n.next;
        
    }
   

}
public void prepend(int data){ 

        Node node =new Node();
        node.data=data;
        node.next=head;
        head = node;

}
public void append(int data){
    if(head==null){
        System.out.println("The list is empty");
    }
    Node n = head;
    while(n.next!=null){
        n = n.next;
           
}
    Node node = new Node();
    node.data = data;
    n.next = node;
}
public void addAfter(int x,int data){
    if(head==null){
        System.out.println("empty");
    }
     Node n = head;
     while(n!=null)
     {
         if(x==n.data)
         {
             break;
         }
         n = n.next;
     }
       Node node = new Node();
        node.data = data;
        node.next = n.next;
        n.next = node;
        

}
public void addBefore(int data,int x)
{
    if(head==null){
        System.out.print("empty");
    }
    Node n = head;
    while(n.next!=null)
    {
        if(n.next.data==x)
        {
            break;
        }
        n = n.next;
    }
    Node node = new Node();
    node.data=data;
    node.next = n.next;
    n.next = node;
    
}
public void Pop(){
     if(head==null)
    {
        System.out.println("Empty");
    }
     else if(this.head!=null)
     {
         Node temp = this.head;
         this.head = this.head.next;
         temp = null;
     }
           
   
}

public void remove_end()
{
    Node n = this.head;
    while(n.next.next!=null)
    {
        n=n.next;
    }
    n.next = null;
}
Node pop_by_value(int x)
{
   if(head==null)
   {
       System.out.println("empty");
   }
   else
   {
       Node n = head;
       while(n.next!=null)
       {
          if(x==n.next.data)
          {
              break;
          }
          n=n.next;
   }
        n.next=n.next.next;

      
}
        return head;
}


public int lenght()
{
    int count = 0;
    Node n = this.head;
   while(n!=null)
   {
       
       n  = n.next;
       count++;

   }
   //System.out.println(count);
        return count;

}
//find kth to last element
public int get(int i)
{
    int j = 0;
    Node n = this.head;
   while(true){
    if(this.head==null)
        System.out.println("Empty");
           break;
    }
    while(n.next!=null){
        {
            if(i == j) 
            break;
        }
        j++;
        n=n.next;
    }
       System.out.println(n.data);
        return n.data;
       
}
public int get_kth_to_end_elemnet(int k)
{
    if(this.head==null)
        System.out.println("Empty");
    int kth_last_element = this.lenght() - k;
        return this.get(kth_last_element);
      }
//Delete the middle node.
public void delete(){
    System.out.println("List after deletion");
    Node n = this.head;
    n = n.next;
    n.next = n.next.next;
    
}
//Remove duplicates from singly linked list.
public void remove_duplicate(){
    Node n = head,temp=null,pointer=null;
    while(n!=null){
        temp = n;
        pointer = n.next;
        while(pointer!=null){
            if(n.data == pointer.data){
                temp.next = pointer.next;
              }
            else{
                temp = pointer;
            }
             pointer = pointer.next;
            }
        n = n.next;
  }
    
      System.out.println("The list after deletion");
}
//Palindrome checker
public void Is_Palindrome()
{
    int reversed_string = 0,remainder;
    Node n = head;
    int orignal = n.data;
    while(n!=null){
        remainder = n.data % 10;
        reversed_string = reversed_string * 10 + remainder;
        n.data/=10;
        n = n.next;
        
    }
    if(orignal==reversed_string){
        System.out.println("LinkedList is palindrome");
        
    }
    else{
        System.out.println("LinkedList is not palindrome");
    }
}
//loop detection
public boolean loop_detection()
{
 Node p = this.head;
 Node q = this.head;
    while(q != null && q.next != null){
        q = q.next.next;
         p = p.next;
        if(p == q)
            return true;
        }
        return false;
 }
//starting point of loop
public int Loop_starting_point(){
    Node p = head;
    Node q = head;
    while(p!=q)
    {
        p=p.next;
        q=q.next;
          
    }
return p.data;
}
}







