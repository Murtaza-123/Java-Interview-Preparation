
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(DisappearedElements.findDisappearedNumbers(nums));

    }
}

class DisappearedElements {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i) == false) {
                list.add(i);
            }
        }
        return list;

    }

}
