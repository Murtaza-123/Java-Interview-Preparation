
public class CalculateSales {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findMin(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
          
        }
        return minIndex;
    }

    public static void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = findMin(array, i, array.length - 1);
            swap(array, i, min);
        }
    }

    public static int searchNumber(int[] array, int Number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Number) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] array) {
        for (int k : array) {
            System.out.println(k + " ");
        }
    }

    public static int BinarySearch(int[] array, int Number) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (Number == array[mid]) {
                return mid;
            } else if (Number < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] ar) {
        int[] arr = {2, 4, 7, 33, 66, 76, 98};
         CalculateSales.Sort(arr);
         CalculateSales.printArray(arr);
    }
}

