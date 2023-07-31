package array;

public class ReplaceElement {

    public static void main(String[] args) {
        int[] array = {17, 18, 5, 4, 6, 1};
        Replace.replaceElement(array);
        Replace.printArray(array);
    }
}

class Replace {

    public static int[] replaceElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = i + 1; j < array.length; j++) {
                max = Math.max(max, array[j]);

            }
            array[i] = max;
        }
        array[array.length - 1] = -1;
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
