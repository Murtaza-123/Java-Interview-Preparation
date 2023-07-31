package objectoriented;

public class Overriding {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}

class Animal {

    public void display() {
        System.out.println("It is a Animal");
    }
}

class Dog extends Animal {

    @Override
    public void display() {
        System.out.println("It is a dog");
    }
}
