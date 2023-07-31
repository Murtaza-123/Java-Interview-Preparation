
package array;

public class FindThePivotIndex {
    public static void main(String[] args)
    {
        int[] array = {1,7,3,6,5,6};
        System.out.print(FindPivot.findPivot(array));
    }
}
class FindPivot
{
    public static int findPivot(int[] nums)
    {
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 1; i < nums.length;i++)
        {
            rightsum += nums[i];
            if(leftsum == rightsum)
            {
                return 0;
            }
        }
        for(int i = 1; i < nums.length;i++)
        {
            leftsum+=nums[i-1];
            rightsum -=nums[i];
            if(leftsum==rightsum)
            {
                return i;
            }
            
        }
        return -1;
    }
}
