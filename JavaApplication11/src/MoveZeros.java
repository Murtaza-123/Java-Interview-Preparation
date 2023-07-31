
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Move move = new Move();
        move.moveZeros(nums);
        move.print(nums);
    }
}

class Move {

    public void moveZeros(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
