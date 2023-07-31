
import java.util.Arrays;

public class BinarySearchIteratively {

    public static int binarySearch(int arr[], int start, int end, int searchNumber) {

        if (start <= end) {

            int mid = (start + end) / 2;
            // Base Condition
            if (arr[mid] == searchNumber) {
                return mid;
            }

            if (arr[mid] > searchNumber) {
                return binarySearch(arr, start, mid - 1, searchNumber);
            }

            return binarySearch(arr, mid + 1, end, searchNumber);
        }

        return -1;
    }

    public static void main(String[] args) {
         int[] nums = {2, 4, 7, 33, 66, 76, 98};
         BinarySearchIteratively.binarySearch(nums, 0, nums.length - 1, 7);
        // BinarySearch.binarySearch(nums, 7);
    }
}

class BinarySearch {

    public static int binarySearch(int[] nums, int searchNumber) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (searchNumber == nums[mid]) {
                return mid;
            } else if (searchNumber < nums[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;

            }
        }
        return -1;

    }

}
