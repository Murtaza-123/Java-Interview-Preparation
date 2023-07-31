
class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {50, 47, 6, 8, 98, 3, 2, 15, 17, 19, 18, 30, 1};
        Sort.bubblesort(nums);
        Sort.printArray(nums);
    }
}

class Sort {

    public static void bubblesort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
