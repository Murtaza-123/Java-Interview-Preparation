
public class MissingNumber {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,7,8,9};
        System.out.println(Missing.findMissingNumber(nums));
       
    }
}
class Missing
{
    public static int findMissingNumber(int[] nums)
    {
        int missingNumber = 1;
        for(int i = 0; i < nums.length-1;i++)
        {
            if(nums[i] != missingNumber)
            {
                return missingNumber;
            }
            missingNumber++;
        }
        return missingNumber;
    }
   
}
