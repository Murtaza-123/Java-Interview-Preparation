
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args)
    {
        int[] array = {9,6,4,2,3,5,7,0,1};
        System.out.println(Missing.missingNumber(array));
    }
}
class Missing
{
    public static int missingNumber(int[] array)
    {
        Arrays.sort(array);
        int missingElement = 0;
        for(int i = 0; i < array.length;i++)
        {
             if(array[i] != missingElement)
             {
                 return missingElement;
             }
             missingElement++;
        }
        return missingElement;
    }
}

