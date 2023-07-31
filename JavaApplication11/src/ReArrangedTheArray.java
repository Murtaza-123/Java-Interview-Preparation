
public class ReArrangedTheArray {
    public static void main(String[] args)
    {
        int[] array = {0,1,1,0,0,1,0};
        ReArranged rearrange = new ReArranged();
        rearrange.reArranged(array);
        rearrange.printArray(array);
    }
}
class ReArranged
{
    public  void reArranged(int[] array)
    {
        int start = 0;
        int end = array.length-1;
        while(start < end)
        {
            while(array[start] == 0)
            {
                start++;
            }
            while(array[end] == 1)
            {
                end--;
            }
            if(start < end)
            {
                swap(array,start,end);
                start++;
                end--;
            }
        }
    }
    public void swap(int[] array , int i , int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void printArray(int[] array)
    {
        for(int i : array)
        {
            System.out.print(i + " ");
        }
    }
}
