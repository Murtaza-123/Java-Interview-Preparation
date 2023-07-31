
import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {0,1,1,2,0,4,3,6,0};
        System.out.println(Majority.majorityElement(array));
    }
}

class Majority {

    public static int majorityElement(int[] nums) {
        int[] array = new int[10];
        Arrays.fill(array, 0);
        for (int i = 0; i <= nums.length - 1; i++) {
            array[nums[i]]++;
        }
        int majority = 0;
        for(int i = 0; i < 10; i++)
        {
            if(array[i] > array[majority])
            {
                majority = i;
            }
        }
        return majority;
          
    }
}

