
public class ReverseString {

    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        ReverseTheString reverse = new ReverseTheString();
        reverse.Reverse(ch);
        reverse.printArray(ch);

    }
}

class ReverseTheString {

    public void Reverse(char[] ch) {
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;

        }

    }

    public void printArray(char[] array) {
        for (char arr : array) {
            System.out.print(arr + " ");
        }
    }

}
