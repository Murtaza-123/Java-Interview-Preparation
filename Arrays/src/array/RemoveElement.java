package array;

public class RemoveElement {

    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        System.out.print(Remove.removeElement(array, 3));
    }
}

class Remove {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int[] anotherArray = new int[nums.length];
        for (int i = 0, k = 0; i < nums.length; i++, k++) {
            if (nums[i] != val) {
                anotherArray[k++] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = anotherArray[i];
        }
        return count;

    }
}
