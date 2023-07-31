
public class missingNumber2 {
    public static void main(String[] args)
    {
        int[] array = {9,6,4,2,3,5,7,0,1};
        System.out.println(Missing.findMissing(array));
    }
}
class Missing
{
    public static int findMissing(int[] array)
    {
        int sum = 0;
        int n = array.length;
        int total = n * (n+1) / 2;
        for(int i = 0; i < n;i++)
        {
            sum +=array[i];
        }
        return total - sum;
    }
}
