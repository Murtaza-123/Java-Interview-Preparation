class Sorting
{
    public static void insertion_sort(int[] array)
    {
        for(int i = 0;i < array.length;i++)
        {
            int anchor = array[i];
            int j = i - 1;
            while(j>=0 && anchor < array[j])
            {
                array[j+1] = array[j];
                j= j - 1;
            }
          array[j + 1] = anchor;

            
        }

        
    }
    public static void print_array(int[] array)
    {
        for(int l: array)
        {
            System.out.print(l + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] array = {21,38,29,17,4,25,11,32,9};
        Sorting.print_array(array);
        Sorting.insertion_sort(array);
        Sorting.print_array(array);
       // System.out.print("Hello");
        
    }
}