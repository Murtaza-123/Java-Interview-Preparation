
class Builder {

    public int length;
    public char[] array;

    Builder(int size) {
        this.length = 0;
        this.array = new char[size];
    }

    public void append(String str) {

        for (int i = 0; i < str.length(); i++) {
            this.array[this.length] = str.charAt(i);
            this.length++;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void printArray() {
        for (char n : this.array) {
            System.out.print(n + "");
        }
        System.out.println();
    }

}

public class MyBuilder {

    public static void main(String[] args) {

        Builder builder = new Builder(20);
        builder.append("murtaza");
        builder.append("zaidi");
        builder.append("hussain");
        //System.out.println(builder.isEmpty());

        builder.printArray();

    }
}
