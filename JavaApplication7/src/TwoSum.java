
class Pair {
    //Fields of Class
    int a, b;
    //Constructor of Pair Class
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

class TwoSumSolution {

    public static Pair twoSum(int[] array, int target) {
        int i = 0;
        int j = i+1;
        for (i = 0; i < array.length - 1; i++) {
            for (j = i+1; j < array.length - 1; j++) {
                int n = array[i] + array[j];
                if(n == target) {
                    //Object of Pair Class
                    return new Pair(i,j);
            }
        }
    }
        return null;
}
}

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {8,5, 9, 6,  7};
        Pair n = TwoSumSolution.twoSum(array,14);
        System.out.println(n.a);
        System.out.println(n.b);
    }
}

