
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        DeleteDuplicates delete = new DeleteDuplicates();
        System.out.println(delete.Remove(array));
    }
}

class DeleteDuplicates {

    public int Remove(int[] array) {
        int count = 1;
        int i = 0, j = i + 1;
        while (i < array.length - 1) {
            if (array[i] != array[j]) {

                array[count++] = array[j];

            }

            i++;
            j++;

        }

        return count;
    }

    public void traverse(int[] array) {
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

}
