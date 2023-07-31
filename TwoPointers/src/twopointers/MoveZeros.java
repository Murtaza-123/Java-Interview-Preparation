package twopointers;

public class MoveZeros {

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        Move.moveZeros(array);
        Move.printArray(array);
    }
}

class Move {

    public static int[] moveZeros(int[] nums) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
            i++;
        }
        return nums;
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
