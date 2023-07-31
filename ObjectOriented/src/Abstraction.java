
public class Abstraction {

    public static void main(String[] args) {
        Wild wild = new Wild();
        wild.Lion();
        wild.Monkey();
    }
}

abstract class Animal {

    abstract void Monkey();

    public void Lion() {
        System.out.println("Lion is roaring");
    }
}

class Wild extends Animal {

    public void Monkey() {
        System.out.println("This is monkey");
    }
}
