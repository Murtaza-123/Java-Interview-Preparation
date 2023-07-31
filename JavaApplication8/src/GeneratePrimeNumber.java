
public class GeneratePrimeNumber {

    public static void main(String[] args) {
        Generate.generatePrimeNumbers(15);
    }
}

class Generate {

    public static void generatePrimeNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
