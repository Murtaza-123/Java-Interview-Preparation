
public class ReplaceElement {

    public static void main(String[] args) {
        int nums[] = {17, 18, 5, 4, 6, 1};
        Replace replace = new Replace();
        replace.replaceElements(nums);
        replace.print(nums);

    }
}

class Replace {

    public int[] replaceElements(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int max = 0;

            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
            }
            nums[i] = max;
        }
        nums[nums.length - 1] = -1;

        return nums;
    }

    public void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
