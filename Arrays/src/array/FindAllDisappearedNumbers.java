package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindAllDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.print(FindMissingNumbers.findAllDisappearedNumbers(nums));
    }
}

class FindMissingNumbers {

    public static List<Integer> findAllDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i) == false) {
                list.add(i);
            }
        }
        return list;

    }
}
