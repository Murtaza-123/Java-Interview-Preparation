
import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 2, 4, 8, 3, 5, 3};
        System.out.println( Majority.findMajorityElement(array));
    }
}

class Majority {

    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[(n - 1) / 2];
    }
}
