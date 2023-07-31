import java.util.ArrayList;
import java.util.Scanner;

class GYM
{
    ArrayList<Integer> list = new ArrayList<Integer>();
     public void ADD()
     {
      
        System.out.println("Add the customer in the list: "); 
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        list.add(num);
       
       
 
     }
     public void Remove()
     {
         System.out.println("Remove the customer from the list: ");
         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         list.remove(num);
        
     }
     public void View()
     {
         System.out.println("View the customer: ");
         for(int i = 0; i <= list.size();i++)
           {
               System.out.println(list);
               break;
           }
     }
     public static void main(String[] args)
     {
         System.out.println("Please select the option");
         System.out.println("1: Add");
         System.out.println("2: Remove");
         System.out.println("3: View");
         System.out.println("4: Exit");
         GYM gym = new GYM();
         while(true){
         Scanner scan = new Scanner(System.in);
         int st = scan.nextInt();
         if(st == 1)
         {
             gym.ADD();
         }
         else if(st == 2)
         {
             gym.Remove();
         }
         else if(st == 3)
         {
             gym.View();
         }
         else if(st == 4)
         {
             System.exit(0);
         }
         }
     }
}