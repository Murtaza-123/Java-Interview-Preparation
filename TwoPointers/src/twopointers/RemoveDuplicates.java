package twopointers;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(RemoveDuplicate.removeDuplicate(nums));
    }

}

class RemoveDuplicate {

    public static int removeDuplicate(int[] nums) {
        int i = 0;
        int j = i + 1;
        int count = 1;
        while (i < nums.length - 1) {
            if (nums[i] != nums[j]) {
                nums[count++] = nums[j];

            }
            i++;
            j++;
        }
        return count;
    }
}
