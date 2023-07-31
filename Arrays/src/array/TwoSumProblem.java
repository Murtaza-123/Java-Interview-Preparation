package array;

import java.util.ArrayList;
import java.util.List;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        TwoSum.twoSum(array, 9);
        TwoSum.printArray(array);

    }
}

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
