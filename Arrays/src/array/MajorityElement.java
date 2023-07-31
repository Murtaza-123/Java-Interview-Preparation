package array;


import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {3, 2, 3};
        System.out.print(Majority.majorityElement(array));
    }
}

class Majority {

    public static int majorityElement(int[] array) {
        Arrays.sort(array);
        int majorityElement = array.length / 2;
        return array[majorityElement];
    }
}
