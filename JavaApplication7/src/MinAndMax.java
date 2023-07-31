public class MinAndMax
{
    public static void main(String[] args)
    {
        int[] nums = {19,10,4,1,2,3};
        System.out.println(MinElement.minValue(nums));
    }
}
class MinElement
{
    public static int minValue(int[] nums)
    {
        int Minimum = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] < nums[Minimum])
            {
                Minimum = i;
            }
        }
        return nums[Minimum];
    }
}