
public class reArrangedTheArray {

    public void printArray(int[] array) {
        for (int k : array) {
            System.out.print(" " + k);
        }
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void Sort(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            while (array[start] == 0) {
                start++;
            }

            while (array[end] == 1) {

                end--;
            }

            if (start < end) {
                swap(array, start, end);
                start++;
                end--;
            }

        }

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1};
        reArrangedTheArray obj = new reArrangedTheArray();
        obj.Sort(array);
        obj.printArray(array);

    }
}
