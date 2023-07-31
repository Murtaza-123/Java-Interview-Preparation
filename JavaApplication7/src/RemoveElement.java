
import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        Remove remove = new Remove();
        remove.removeElement(array, 3);

    }
}

class Remove {

    public int removeElement(int[] array, int val) {
        int count = 0;

        int[] anotherArray = new int[array.length];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] != val) {
                anotherArray[k++] = array[i];
                count++;
            }

        }
        for(int j =0; j < array.length;j++)
        {
            array[j] = anotherArray[j];
        }
        return count;
    }

}
