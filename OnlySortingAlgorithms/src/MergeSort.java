
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {50, 47, 6, 8, 98, 3, 2, 15, 17, 19, 18, 30, 1};
        Merge.divide(array, array.length);
        Merge.printArray(array);
    }
}

class Merge {

    public static void divide(int[] nums, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int j = mid; j < n; j++) {
            right[j - mid] = nums[j];
        }
        divide(left, mid);
        divide(right, n - mid);
        merge(nums, left, right, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int start, int end) {
        int i, j, k;
        i = j = k = 0;
        while (i < start && j < end) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];

            } else {
                a[k++] = r[j++];
            }

        }
        while (i < start) {
            a[k++] = l[i++];
        }
        while (j < end) {
            a[k++] = r[j++];
        }
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

}
