
import java.util.Arrays;

public class Duplicates
{
    public static void main(String[] args)
    {
        int[] array = {5,23,4,7,66,12,5};
        System.out.println(FindDuplicates.isduplicates(array));
    }
}
class FindDuplicates
{
    public static boolean isduplicates(int[] array)
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