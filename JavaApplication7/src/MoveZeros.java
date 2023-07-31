
import java.util.Arrays;


public class MoveZeros {
    public static void main(String[] args)
    {
        int[] array = {0,1,0,3,12};
        Moves move = new Moves();
        move.moveZeros(array);
        move.printArray(array);
        
    }
}
class Moves
{
    public void moveZeros(int[] nums)
    {
        int j = 0;
       for(int i = 0 ; i < nums.length;i++)
       {
           if(nums[i] !=0)
           {
               swap(nums,i,j);
               j++;
           }
          
       }
      
          

    }
     public void printArray(int[] array) {
        for (int k : array) {
            System.out.print(k + " ");
        }
}
     public void swap(int[] array , int i , int j)
     {
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }
}
