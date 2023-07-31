
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {3,1,5,7,9,2,6};
        int[] nums2 = {1,2,3,5,6,7,9,11};
        Greater greater = new Greater();
        greater.nextGreaterElement(nums1, nums2);

    }
}

class Greater {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if ((j + 1) < nums2.length && nums2[j] < nums2[j + 1]) {
                        nums3[i] = nums2[j + 1];
                    } else {
                        nums3[i] = -1;
                    }

                    break;
                }
            }

        }
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
        return nums3;
    }

}
