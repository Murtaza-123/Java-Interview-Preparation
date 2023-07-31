
class Sorting {

    public static void swap(int[] array, int a, int b) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int partition(int[] array, int start, int end) {
        int pivot_index = start;
        int pivot = array[pivot_index];
        while (start < end) {
            while (start < array.length && array[start] <= pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(array, start, end);
            } else {
                swap(array, pivot_index, end);
            }
        }
        return end;

    }

    public static void quick_sort(int[] array, int start, int end) {
        if (start < end) {
            int p = partition(array, start, end);
            quick_sort(array, start, p - 1);
            quick_sort(array, p + 1, end);
        }
    }

    public static void print_array(int[] array) {
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 2, 35, 55, 89, 21, 5, 49};
        // Sorting.print_array(array);
        Sorting.quick_sort(array, 0, array.length - 1);
        // Sorting.partition(array, 0, array.length - 1);
        Sorting.print_array(array);
    }

}
