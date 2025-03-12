class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting with a button");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Vehicle myVehicle;
        myVehicle = new Car();
        myVehicle.start();
        myVehicle = new Bike();
        myVehicle.start();
    }
}
