package objectoriented;

public class ObjectOriented {

    public static void main(String[] args) {
        cycle inherit = new cycle();
        inherit.vehicleName = "SORAB";
        inherit.Brand();
        inherit.name();
        inherit.running();
    }

}

class Vehicle {

    String vehicleName;

    public void running() {
        System.out.println("Vechile is running");
    }
}

class Bicycle extends Vehicle {

    public void Brand() {
        System.out.println("CD125");
    }
}

class cycle extends Bicycle {

    public void name() {
        System.out.println("The name is:" + this.vehicleName);
    }

}
