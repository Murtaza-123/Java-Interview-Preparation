
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        List list = Sum.twoSum(nums, 13);
        System.out.println(list);
    }
}

class Sum {

    public static List<Integer> twoSum(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int n = nums[i] + nums[j];
                if (n == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }
}
