
package javaapplication11;

import java.util.Arrays;


public class Duplicates {
    public static void main(String[] args)
    {
        int[] nums = {6,3,5,1,2};
        FindDuplicates find = new FindDuplicates();
        System.out.println(find.isDuplicates(nums));
        //find.printArray(nums);
        
    }
}
class FindDuplicates
{
    public boolean isDuplicates(int[] array)
    {
        Arrays.sort(array);
        for(int i = 0; i < array.length-1;i++)
        {
            if(array[i] == array[i+1])
            {
                return true;
            }
        }
        return false;
    }
   
}
