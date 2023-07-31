
public class ReplaceTheElement {
    public static void main(String[] args)
    {
        int[] array = {17,18,5,4,6,1};
        Replace re = new Replace();
        re.replaceElements(array);
        re.printArray(array);
    }
}
class Replace
{
    public int[] replaceElements(int[] array)
    {
       int max = -1;
       int val = array.length-1;
       for(int i = val; i >= 0; i--)
       {
           int temp = array[i];

           array[i] = max;
           max = Math.max(temp, max);
       }
        return array;
    }
    public void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
