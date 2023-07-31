
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {50, 47, 6, 8, 98, 3, 2, 15, 17, 19, 18, 30, 1};

        Selection.selectionsort(nums);
        // System.out.println(Selection.find_min(nums, 0, nums.length-1));
        Selection.printArray(nums);

    }
}

class Selection {

    public static int find_min(int[] array, int start, int end) {
        int min_index = start;
        for (int i = start; i <= end; i++) {
            if (array[i] < array[min_index]) {
                min_index = i;
            }
        }
        return min_index;
    }

    public static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = find_min(nums, i, nums.length - 1);
            swap(nums, i, min);
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
