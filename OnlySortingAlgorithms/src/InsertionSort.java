
public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {50, 47, 6, 8, 98, 3, 2, 15, 17, 19, 18, 30, 1};
        Insertion.insertionsort(nums);
        Insertion.printArray(nums);

    }

}

class Insertion {

    public static void insertionsort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int anchor = nums[i];
            int j = i - 1;
            while (j >= 0 && anchor < nums[j]) {
                swap(nums, j, j + 1);
                j--;
            }
            nums[j + 1] = anchor;
        }
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
