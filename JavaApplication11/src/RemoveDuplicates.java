
import javax.lang.model.SourceVersion;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(Remove.removeDuplicates(nums));
    }
}

class Remove {

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 0, i = 1;
        while (i <= nums.length-1) {
            if (nums[i] != nums[j]) {
                nums[count++] = nums[i];
                
            }
            i++;
            j++;
        }

        return count;
    }
}
