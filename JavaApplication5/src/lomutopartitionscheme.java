class sorting
{
    public static void swap(int[] array,int a,int b)
    {
        int temp;//local variable
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static int partition(int[] array,int start,int end)
    {
        
        int pivot = array[end];
        int i = (start - 1);
        for(int j = start; j<=end - 1;j++)
        {
            if(array[j] <= pivot)
            {
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i + 1,end);
        return (i + 1);
       
    }
      public static void print_array(int[] array)
    {
        for(int k:array)
        {
            System.out.print(k + " ");
        }
        System.out.println();
    }
     public static void quick_sort(int[] array,int start,int end)
    {
        if(start < end){
        int p = partition(array,start,end);
        quick_sort(array,start,p - 1);
        quick_sort(array,p + 1,end);
    }
    }
     public static void main(String[] args)
    {
        int[] array = {12,34,2,35,55,89,21,5,49};
        sorting.print_array(array);
        sorting.quick_sort(array, 0, array.length - 1);
        sorting.print_array(array);
    }
}