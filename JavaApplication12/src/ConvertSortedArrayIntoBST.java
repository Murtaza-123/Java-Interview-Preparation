
public class ConvertSortedArrayIntoBST {

    public static void main(String[] args) {
        int nums[] = {-10, -3, 0, 5, 9};
        ConvertedArray convert = new ConvertedArray();
        convert.sortedArrayToBst(nums);
    }
}

class ConvertedArray {

    class Node {

        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public Node sortedArrayToBst(int[] nums) {
        Node root = null;
        if (root == null || nums.length == 0) {
            return null;
        }
        return convertedSortedArray(nums, 0, nums.length - 1);
    }

    public Node convertedSortedArray(int[] nums, int start, int end) {
        Node root;
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        root = new Node(nums[mid]);
        root.left = convertedSortedArray(nums, start, mid - 1);
        root.right = convertedSortedArray(nums, mid + 1, end);
        return root;

    }
}
