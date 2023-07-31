class Sorting
{
    public static void bubble_sort(int[] array)
    {
        int n = array.length;
        int temp;
        for(int i = 0; i < n;i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    
                }
            }
        }
    }
    
     static void print_array(int[] array)
    {
        for(int i =0; i < array.length;i++)
            System.out.print(array[i]+ " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] array = {12,3,24,6,43,8,45};
        Sorting.bubble_sort(array);
        Sorting.print_array(array);
    }
}