package OOPS.Part4;

abstract class Vehicle{
    void start() {
        System.out.println("Starting");
    }
    abstract void noOfWheels();
}

class Car extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels is 4");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.noOfWheels();
        c.start();
    }
}
