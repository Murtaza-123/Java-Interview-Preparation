
class Quick_Sort {

    public static void main(String[] args) {
        int[] nums = {50, 47, 6, 8, 98, 3, 2, 15, 17, 19, 18, 30, 1};
        Quick.partition(nums, 0, nums.length - 1);
        Quick.quick_sort(nums, 0, nums.length - 1);
        Quick.printArray(nums);

    }
}

class Quick {

    public static int partition(int[] nums, int start, int end) {
        int pivot_index = start;
        int pivot = nums[pivot_index];
        while (start < end) {
            while (start < nums.length && nums[start] <= pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(nums, start, end);
            } else {
                swap(nums, pivot_index, end);
            }
        }
        return end;
    }

    public static void quick_sort(int[] nums, int start, int end) {
        if (start < end) {
            int p = partition(nums, start, end);
            quick_sort(nums, start, p - 1);
            quick_sort(nums, p + 1, end);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
