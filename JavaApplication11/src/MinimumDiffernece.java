
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDiffernece {

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        Solution.minimunDiffernece(nums, 3);

    }
}

class Solution {

    public static int minimunDiffernece(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        int i = 0, j = k - 1, res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        while (j < nums.length) {
            res = Math.min(res, nums[j] - nums[i]);
            i++;
            j++;

        }
        return res;

    }
}
