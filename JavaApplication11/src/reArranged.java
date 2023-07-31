
public class reArranged {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 1, 0, 1};
        Move move = new Move();
        move.test(nums);
        move.printArray(nums);
    }
}

class Move {

    public void test(int[] nums) {
        int j = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] != 1) {
                swap(nums, i, j);
                j++;
            }
            i++;
        }

    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
