
package array;

import java.util.Arrays;

public class ContainsDuplicates
{

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Duplicates2.contaninsDuplicates2(array));
    }
}

class Duplicates {

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
class Duplicates2
{
    public static boolean contaninsDuplicates2(int[] nums)
    {
        Arrays.sort(nums);
        for(int i = 0 ,j = 1; i < nums.length;i++,j++)
        {
            if(j < nums.length && nums[i] == nums[j])
            {
                return true;
            }
        }
        return false;
    }
}