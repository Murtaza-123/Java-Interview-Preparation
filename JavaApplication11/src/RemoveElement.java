
public class RemoveElement {
    public static void main(String[] args)
    {
        int[] nums = {3,2,2,3};
        Remove.removeElement(nums, 3);
    }
}
class Remove
{
    public static int removeElement(int[] nums , int val)
    {
        int k = 0;
        int count = 0;
        int[] anotherArray = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] != val)
            {
                anotherArray[k++] = nums[i];
                count++;
            }
        }
        for(int i = 0; i < nums.length;i++)
        {
            nums[i] = anotherArray[i];
        }
        return count;
    }
}
