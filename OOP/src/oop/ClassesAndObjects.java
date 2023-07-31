package oop;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.name);

    }

}

class Person {

    int age = 45;
    String name = "murtaza";

    public void display() {
        System.out.println(this.age + " " + this.name);
    }
}
